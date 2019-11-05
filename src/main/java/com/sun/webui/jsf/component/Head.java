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
package com.sun.webui.jsf.component;

import javax.el.ValueExpression;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import com.sun.faces.annotation.Component;
import com.sun.faces.annotation.Property;

/**
 * The Head component is used to provide information to be used in the head
 * element.
 */
@Component(type = "com.sun.webui.jsf.Head", family = "com.sun.webui.jsf.Head",
displayName = "Head", tagName = "head",
helpKey = "projrave_ui_elements_palette_wdstk-jsf1.2_head",
propertiesHelpKey = "projrave_ui_elements_palette_wdstk-jsf1.2_propsheets_head_props")
public class Head extends UIComponentBase {

    /**
     * <p>Construct a new <code>Head</code>.</p>
     */
    public Head() {
        super();
        setRendererType("com.sun.webui.jsf.Head");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    public String getFamily() {
        return "com.sun.webui.jsf.Head";
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Tag attribute methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * The component identifier for this component. This value must be unique
     * within the closest parent component that is a naming container.
     */
    @Property(name = "id")
    @Override
    public void setId(String id) {
        super.setId(id);
    }

    /**
     * Use the rendered attribute to indicate whether the HTML code for the
     * component should be included in the rendered HTML page. If set to false,
     * the rendered HTML page does not include the HTML for the component. If
     * the component is not rendered, it is also not processed on any subsequent
     * form submission.
     */
    @Property(name = "rendered")
    @Override
    public void setRendered(boolean rendered) {
        super.setRendered(rendered);
    }
    /**
     * Flag (true or false) indicating that Dojo debugging is enabled. The
     * default value is false.
     */
    @Property(name = "debug", displayName = "Enable Dojo Debugging", category = "Advanced")
    private boolean debug = false;
    private boolean debug_set = false;

    /**
     * Test flag indicating that Dojo debugging is enabled.
     */
    public boolean isDebug() {
        if (this.debug_set) {
            return this.debug;
        }
        ValueExpression _vb = getValueExpression("debug");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext().getELContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
     * Set flag indicating that Dojo debugging is enabled.
     */
    public void setDebug(boolean debug) {
        this.debug = debug;
        this.debug_set = true;
    }
    /**
     * Flag (true or false) indicating that component JavaScript should be
     * output in page. The default value is true.
     */
    @Property(name = "javaScript", displayName = "Include Component JavaScript", category = "Advanced")
    private boolean javaScript = true;
    private boolean javaScript_set = false;

    /**
     * Test flag indicating that component JavaScript should be output in page.
     */
    public boolean isJavaScript() {
        if (this.javaScript_set) {
            return this.javaScript;
        }
        ValueExpression _vb = getValueExpression("javaScript");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext().getELContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return true;
    }

    /**
     * Set flag indicating that component JavaScript should be output in page.
     */
    public void setJavaScript(boolean javaScript) {
        this.javaScript = javaScript;
        this.javaScript_set = true;
    }
    /**
     * Flag (true or false) indicating that Dojo should search for dojoType
     * widget tags. Page load time is proportional to the number of nodes on the
     * page. The default value is false.
     */
    @Property(name = "parseWidgets", displayName = "Parse Dojo Widgets", category = "Advanced")
    private boolean parseWidgets = false;
    private boolean parseWidgets_set = false;

    /**
     * Test flag indicating that Dojo should search for dojoType widget tags.
     */
    public boolean isParseWidgets() {
        if (this.parseWidgets_set) {
            return this.parseWidgets;
        }
        ValueExpression _vb = getValueExpression("parseWidgets");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext().getELContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
     * Set flag indicating that Dojo should search for dojoType widget tags.
     */
    public void setParseWidgets(boolean parseWidgets) {
        this.parseWidgets = parseWidgets;
        this.parseWidgets_set = true;
    }
    /**
     * Flag (true or false) indicating if meta data should be rendered. The
     * default value is true.
     */
    @Property(name = "meta", displayName = "Render Meta Data", category = "Advanced")
    private boolean meta = false;
    private boolean meta_set = false;

    /**
     * Test flag indicating if the default meta data should be rendered.
     */
    public boolean isMeta() {
        if (this.meta_set) {
            return this.meta;
        }
        ValueExpression _vb = getValueExpression("meta");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext().getELContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return true;
    }

    /**
     * Set flag indicating if the default meta data should be rendered.
     */
    public void setMeta(boolean meta) {
        this.meta = meta;
        this.meta_set = true;
    }
    /**
     * <p>Flag (true or false) indicating that a default html base tag should be
     * shown or not.  Changing this attribute could cause webuijsf:anchor to not work
     * properly.  The default value is false.</p>
     */
    @Property(name = "defaultBase", displayName = "Default Base", category = "Appearance")
    private boolean defaultBase = false;
    private boolean defaultBase_set = false;

    /**
     * <p>Flag (true or false) indicating that a default html base tag should be
     * shown or not.  Changing this attribute could cause webuijsf:anchor to not work
     * properly.  The default value is false.</p>
     */
    public boolean isDefaultBase() {
        if (this.defaultBase_set) {
            return this.defaultBase;
        }
        ValueExpression _vb = getValueExpression("defaultBase");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext().getELContext());
            if (_result == null) {
                return false;
            } else {
                return ((Boolean) _result).booleanValue();
            }
        }
        return false;
    }

    /**
     * <p>Flag (true or false) indicating that a default html base tag should be
     * shown or not.  Changing this attribute could cause webuijsf:anchor to not work
     * properly.  The default value is false.</p>
     * @see #isDefaultBase()
     */
    public void setDefaultBase(boolean defaultBase) {
        this.defaultBase = defaultBase;
        this.defaultBase_set = true;
    }
    /**
     * <p>A space separated list of URL's that contains meta data information
     * about the page</p>
     */
    @Property(name = "profile", displayName = "Profile", category = "Advanced")
    private String profile = null;

    /**
     * <p>A space separated list of URL's that contains meta data information
     * about the page</p>
     */
    public String getProfile() {
        if (this.profile != null) {
            return this.profile;
        }
        ValueExpression _vb = getValueExpression("profile");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    /**
     * <p>A space separated list of URL's that contains meta data information
     * about the page</p>
     * @see #getProfile()
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }
    /**
     * <p>Title of the document to be displayed in the browser title bar.</p>
     */
    @Property(name = "title", displayName = "title", category = "Appearance", isDefault = true)
    private String title = null;

    /**
     * <p>Title of the document to be displayed in the browser title bar.</p>
     */
    public String getTitle() {
        if (this.title != null) {
            return this.title;
        }
        ValueExpression _vb = getValueExpression("title");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    /**
     * <p>Title of the document to be displayed in the browser title bar.</p>
     * @see #getTitle()
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    @Override
    public void restoreState(FacesContext _context, Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.defaultBase = ((Boolean) _values[1]).booleanValue();
        this.defaultBase_set = ((Boolean) _values[2]).booleanValue();
        this.profile = (String) _values[3];
        this.title = (String) _values[4];
    }

    /**
     * <p>Save the state of this component.</p>
     */
    @Override
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[5];
        _values[0] = super.saveState(_context);
        _values[1] = this.defaultBase ? Boolean.TRUE : Boolean.FALSE;
        _values[2] = this.defaultBase_set ? Boolean.TRUE : Boolean.FALSE;
        _values[3] = this.profile;
        _values[4] = this.title;
        return _values;
    }
}
