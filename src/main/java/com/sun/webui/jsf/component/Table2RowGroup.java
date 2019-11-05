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

import com.sun.faces.annotation.Component;
import com.sun.faces.annotation.Property;
import com.sun.faces.extensions.avatar.lifecycle.AsyncResponse;
import com.sun.webui.jsf.util.JavaScriptUtilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.el.ValueExpression;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * Component that represents a group of table rows.
 */
@Component(type = "com.sun.webui.jsf.Table2RowGroup",
family = "com.sun.webui.jsf.Table2RowGroup",
tagRendererType = "com.sun.webui.jsf.widget.Table2RowGroup",
displayName = "Table2RowGroup", tagName = "table2RowGroup", isTag = false) // Remove isTag to run
public class Table2RowGroup extends TableRowGroup
        implements NamingContainer, Widget {
    // A List containing Table2Column children.

    private List table2ColumnChildren = null;

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Base methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public Table2RowGroup() {
        super();
        setRendererType("com.sun.webui.jsf.widget.Table2RowGroup");
    }

    public FacesContext getContext() {
        return getFacesContext();
    }

    @Override
    public String getFamily() {
        return "com.sun.webui.jsf.Table2RowGroup";
    }

    @Override
    public String getRendererType() {
        if (AsyncResponse.isAjaxRequest()) {
            return "com.sun.webui.jsf.ajax.Table2RowGroup";
        } else {
            return super.getRendererType();
        }
    }

    /**
     * Get the type of widget represented by this component.
     *
     * @return The type of widget represented by this component.
     */
    public String getWidgetType() {
        return JavaScriptUtilities.getNamespace("table2RowGroup");
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Child methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Get an Iterator over the Table2Column children found for
     * this component.
     *
     * @return An Iterator over the Table2Column children.
     */
    public Iterator getTable2ColumnChildren() {
        // Get TableColumn children.
        if (table2ColumnChildren == null) {
            table2ColumnChildren = new ArrayList();
            Iterator kids = getChildren().iterator();
            while (kids.hasNext()) {
                UIComponent kid = (UIComponent) kids.next();
                if ((kid instanceof Table2Column)) {
                    table2ColumnChildren.add(kid);
                }
            }
        }
        return table2ColumnChildren.iterator();
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Pagination methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Get the number of rows to be displayed for a paginated table.
     * <p>
     * Note: UI guidelines recommend a default value of 25 rows per page.
     * </p>
     * @return The number of rows to be displayed for a paginated table.
     */
    @Override
    public int getRows() {
        setPaginated(true);
        return Math.max(1, super.getRows());
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Tag attribute methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * Flag indicating to turn off default Ajax functionality. Set ajaxify to
     * false when providing a different Ajax implementation.
     */
    @Property(name = "ajaxify", displayName = "Ajaxify", category = "Javascript")
    private boolean ajaxify = true;
    private boolean ajaxify_set = false;

    /**
     * Test if default Ajax functionality should be turned off.
     */
    public boolean isAjaxify() {
        if (this.ajaxify_set) {
            return this.ajaxify;
        }
        ValueExpression _vb = getValueExpression("ajaxify");
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
     * Set flag indicating to turn off default Ajax functionality.
     */
    public void setAjaxify(boolean ajaxify) {
        this.ajaxify = ajaxify;
        this.ajaxify_set = true;
    }
    /**
     * Alternative HTML template to be used by this component.
     */
    @Property(name = "htmlTemplate", displayName = "HTML Template", category = "Appearance")
    private String htmlTemplate = null;

    /**
     * Get alternative HTML template to be used by this component.
     */
    public String getHtmlTemplate() {
        if (this.htmlTemplate != null) {
            return this.htmlTemplate;
        }
        ValueExpression _vb = getValueExpression("htmlTemplate");
        if (_vb != null) {
            return (String) _vb.getValue(getFacesContext().getELContext());
        }
        return null;
    }

    /**
     * Set alternative HTML template to be used by this component.
     */
    public void setHtmlTemplate(String htmlTemplate) {
        this.htmlTemplate = htmlTemplate;
    }
}
