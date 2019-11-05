package com.sun.webui.jsf.component;

import javax.el.ELException;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.StateHolder;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.webapp.UIComponentELTag;
import javax.faces.context.FacesContext;

/**
 * This file was generated automatically on Jan 26, 2012.
 */

public class FileChooserTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.FileChooser";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.FileChooser";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        valueChangeListenerExpression = null;
        validatorExpression = null;
        immediate = null;
        converter = null;
        rendered = null;
        visible = null;
        lookin = null;
        tabIndex = null;
        styleClass = null;
        descending = null;
        rows = null;
        folderChooser = null;
        selected = null;
        readOnly = null;
        sortField = null;
        style = null;
        multiple = null;
        disabled = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (valueChangeListenerExpression != null) {
            try {
                component.getAttributes().put("valueChangeListenerExpression", valueChangeListenerExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (validatorExpression != null) {
            try {
                component.getAttributes().put("validatorExpression", validatorExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (immediate != null) {
            component.setValueExpression("immediate", immediate);
        }
        if (converter != null) {
            component.setValueExpression("converter", converter);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (lookin != null) {
            component.setValueExpression("lookin", lookin);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (descending != null) {
            component.setValueExpression("descending", descending);
        }
        if (rows != null) {
            component.setValueExpression("rows", rows);
        }
        if (folderChooser != null) {
            component.setValueExpression("folderChooser", folderChooser);
        }
        if (selected != null) {
            component.setValueExpression("selected", selected);
        }
        if (readOnly != null) {
            component.setValueExpression("readOnly", readOnly);
        }
        if (sortField != null) {
            component.setValueExpression("sortField", sortField);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (multiple != null) {
            component.setValueExpression("multiple", multiple);
        }
        if (disabled != null) {
            component.setValueExpression("disabled", disabled);
        }
     }


     /**
     * Set attribute corresponding to the "valueChangeListenerExpression" property
     */
    private MethodExpression valueChangeListenerExpression = null;
    public void setValueChangeListenerExpression (MethodExpression valueChangeListenerExpression) {
        this.valueChangeListenerExpression = valueChangeListenerExpression;
    }
     /**
     * Set attribute corresponding to the "validatorExpression" property
     */
    private MethodExpression validatorExpression = null;
    public void setValidatorExpression (MethodExpression validatorExpression) {
        this.validatorExpression = validatorExpression;
    }
     /**
     * Set attribute corresponding to the "immediate" property
     */
    private ValueExpression immediate = null;
    public void setImmediate (ValueExpression immediate) {
        this.immediate = immediate;
    }
       /**
     * Set attribute corresponding to the "converter" property
     */
    private ValueExpression converter = null;
    public void setConverter (ValueExpression converter) {
        this.converter = converter;
    }
       /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
      /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "lookin" property
     */
    private ValueExpression lookin = null;
    public void setLookin (ValueExpression lookin) {
        this.lookin = lookin;
    }
     /**
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "descending" property
     */
    private ValueExpression descending = null;
    public void setDescending (ValueExpression descending) {
        this.descending = descending;
    }
     /**
     * Set attribute corresponding to the "rows" property
     */
    private ValueExpression rows = null;
    public void setRows (ValueExpression rows) {
        this.rows = rows;
    }
     /**
     * Set attribute corresponding to the "folderChooser" property
     */
    private ValueExpression folderChooser = null;
    public void setFolderChooser (ValueExpression folderChooser) {
        this.folderChooser = folderChooser;
    }
     /**
     * Set attribute corresponding to the "selected" property
     */
    private ValueExpression selected = null;
    public void setSelected (ValueExpression selected) {
        this.selected = selected;
    }
     /**
     * Set attribute corresponding to the "readOnly" property
     */
    private ValueExpression readOnly = null;
    public void setReadOnly (ValueExpression readOnly) {
        this.readOnly = readOnly;
    }
     /**
     * Set attribute corresponding to the "sortField" property
     */
    private ValueExpression sortField = null;
    public void setSortField (ValueExpression sortField) {
        this.sortField = sortField;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
       /**
     * Set attribute corresponding to the "multiple" property
     */
    private ValueExpression multiple = null;
    public void setMultiple (ValueExpression multiple) {
        this.multiple = multiple;
    }
     /**
     * Set attribute corresponding to the "disabled" property
     */
    private ValueExpression disabled = null;
    public void setDisabled (ValueExpression disabled) {
        this.disabled = disabled;
    }

}
