/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License).  You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://woodstock.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at https://woodstock.dev.java.net/public/CDDLv1.0.html.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * you own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Copyright 2007 Sun Microsystems, Inc. All rights reserved.
 */

/*
 * ThemeUtilities.java
 *
 * Created on January 11, 2005, 2:15 PM
 */

package com.sun.webui.jsf.util;

import com.sun.webui.jsf.component.Icon;
import com.sun.webui.jsf.theme.JSFThemeContext;
import com.sun.webui.theme.Theme;
import com.sun.webui.theme.ThemeContext;
import com.sun.webui.theme.ThemeFactory;
import com.sun.webui.theme.ThemeImage;

import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

/**
 * Utilities needed by Sun Web Components to
 * retrieve an appropriate Theme.
 * @author avk
 */
public class ThemeUtilities {

    private static final Logger LOG = Logger.getLogger(ThemeUtilities.class.getName());

    /**
     * Defines the attribute in the <code>RequestMap</code> for
     * caching the theme.
     */
    private static final String JSFTHEME = "com.sun.webui.jsf.theme.THEME";

    /**
     * Return the default <code>Theme</code> instance.
     * <code>getTheme</code> first looks in the request map
     * for an instance. If an instance does not exist in the
     * request map, obtain an instance from the
     * <code>ThemeFactory</code>. If the theme is obtained from
     * the <code>ThemeFactory</code> place it in the request map.
     */
    public static Theme getTheme(FacesContext context) {
        LOG.finest(() -> String.format("getTheme(context=%s)", context));

        // optimization
        // Assumptions include that the locale is not changing
        // within a request for the default theme.
        // It is also assumed that there is a single thread of
        // execution during a request especially code that
        // might be calling "getTheme".
        //
        Theme theme = (Theme)
            context.getExternalContext().getRequestMap().get(JSFTHEME);
        if (theme != null) {
            return theme;
        }
        Locale locale = context.getViewRoot().getLocale();

        /*
        long mem = Runtime.getRuntime().freeMemory();
        long elapsed = System.currentTimeMillis();
        */

        // Restore support for "THEME_ATTR" session theme name.
        // Note that there really is no official support for
        // changing a theme during a user session, but this code
        // was in the original implementation, so provide the
        // same feature now. But this has to be formalized.
        // The framework should be able to control the lifecycle
        // and scope of a ThemeContext and manipulate it to reflect
        // user Session scoped information and servlet scoped information.
        // hardcoded reference to the defined constant in creator
        // ./designer/src/com/sun/rave/designer/RefreshServiceProvider.java
        //
        String themeName = null;
        Map sessionAttributes =
            context.getExternalContext().getSessionMap();
        Object themeObject = sessionAttributes.get(Theme.THEME_ATTR);
        if (themeObject != null) {
            themeName = themeObject.toString().trim();
        }

        ThemeContext themeContext = JSFThemeContext.getInstance(context);

        // We must ensure that a theme instance is always returned.
        //
        ThemeFactory themeFactory = themeContext.getThemeFactory();
        theme = themeFactory.getTheme(themeName, locale, themeContext);

        // Now see if this call to getTheme, set a default theme
        // as a result of not theme set in ThemeContext and the
        // decision was left to ThemeFactory.
        // if THEME_ATTR was null
        //
        if (themeName == null) {
            // Hack - this will go away.
            //
            themeName = themeFactory.getDefaultThemeName(themeContext);
            if (themeName != null) {
                sessionAttributes.put(Theme.THEME_ATTR, themeName);
            }
        }

        /*
        elapsed = System.currentTimeMillis() - elapsed;
        mem  = mem - Runtime.getRuntime().freeMemory();
        */

        context.getExternalContext().getRequestMap().put(JSFTHEME, theme);

        return theme;
    }

    /**
     * Return an <code>Icon</code> component for the
     * <code>iconKey</code>.
     */
    public static Icon getIcon(Theme theme, String iconKey) {
        LOG.finest(() -> String.format("getIcon(theme, iconKey=%s)", iconKey));

        Icon icon = new Icon();
        icon.setIcon(iconKey);
        if (iconKey == null) {
            return icon;
        }

        ThemeImage themeImage = null;
        try {
            themeImage = theme.getImage(iconKey);
        } catch (MissingResourceException mre) {
            return icon;
        }

        // make sure to setIcon on parent and not the icon itself (which
        // now does the theme stuff in the component

        icon.setUrl(themeImage.getPath());
        icon.setAlt(themeImage.getAlt());
        icon.setHeight(themeImage.getHeight());
        icon.setWidth(themeImage.getWidth());

        return icon;
    }
}
