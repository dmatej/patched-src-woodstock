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
import javax.el.ValueExpression;
import javax.faces.context.FacesContext;

/**
 * The TextArea component is used to create a multiple-line input field for
 * text.
 */
@Component(type = "com.sun.webui.jsf.TextArea", family = "com.sun.webui.jsf.TextArea",
displayName = "Text Area", instanceName = "textArea", tagName = "textArea",
helpKey = "projrave_ui_elements_palette_wdstk-jsf1.2_text_area",
propertiesHelpKey = "projrave_ui_elements_palette_wdstk-jsf1.2_propsheets_text_area_props")
public class TextArea extends Field {

    /**
     * Default constructor.
     */
    public TextArea() {
        super();
        setRendererType("com.sun.webui.jsf.TextArea");
    }

    /**
     * <p>Return the family for this component.</p>
     */
    @Override
    public String getFamily() {
        return "com.sun.webui.jsf.TextArea";
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Tag attribute methods
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    /**
     * The maximum number of characters that can be entered for this field.
     */
    @Property(name = "maxLength", isHidden = true, isAttribute = true)
    @Override
    public int getMaxLength() {
        return super.getMaxLength();
    }
    /**
     * <p>Number of rows used to render the textarea. You should set a value
     * for this attribute to ensure that it is rendered correctly in all
     * browsers.  Browsers vary in the default number of rows used for
     * textarea fields.</p>
     */
    @Property(name = "rows", displayName = "Rows", category = "Appearance",
    editorClassName = "com.sun.rave.propertyeditors.IntegerPropertyEditor")
    private int rows = Integer.MIN_VALUE;
    private boolean rows_set = false;

    /**
     * <p>Number of rows used to render the textarea. You should set a value
     * for this attribute to ensure that it is rendered correctly in all
     * browsers.  Browsers vary in the default number of rows used for
     * textarea fields.</p>
     */
    public int getRows() {
        if (this.rows_set) {
            return this.rows;
        }
        ValueExpression _vb = getValueExpression("rows");
        if (_vb != null) {
            Object _result = _vb.getValue(getFacesContext().getELContext());
            if (_result == null) {
                return Integer.MIN_VALUE;
            } else {
                return ((Integer) _result).intValue();
            }
        }
        return 2;
    }

    /**
     * <p>Number of rows used to render the textarea. You should set a value
     * for this attribute to ensure that it is rendered correctly in all
     * browsers.  Browsers vary in the default number of rows used for
     * textarea fields.</p>
     * @see #getRows()
     */
    public void setRows(int rows) {
        this.rows = rows;
        this.rows_set = true;
    }

    /**
     * <p>Restore the state of this component.</p>
     */
    @Override
    public void restoreState(FacesContext _context, Object _state) {
        Object _values[] = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.rows = ((Integer) _values[1]).intValue();
        this.rows_set = ((Boolean) _values[2]).booleanValue();
    }

    /**
     * <p>Save the state of this component.</p>
     */
    @Override
    public Object saveState(FacesContext _context) {
        Object _values[] = new Object[3];
        _values[0] = super.saveState(_context);
        _values[1] = new Integer(this.rows);
        _values[2] = this.rows_set ? Boolean.TRUE : Boolean.FALSE;
        return _values;
    }
}
