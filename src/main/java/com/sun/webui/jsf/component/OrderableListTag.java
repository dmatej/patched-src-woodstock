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

public class OrderableListTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.OrderableList";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.OrderableList";
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
        required = null;
        visible = null;
        toolTip = null;
        styleClass = null;
        tabIndex = null;
        list = null;
        label = null;
        rows = null;
        readOnly = null;
        style = null;
        moveTopBottom = null;
        labelOnTop = null;
        labelLevel = null;
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
        if (required != null) {
            component.setValueExpression("required", required);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (list != null) {
            component.setValueExpression("list", list);
        }
        if (label != null) {
            component.setValueExpression("label", label);
        }
        if (rows != null) {
            component.setValueExpression("rows", rows);
        }
        if (readOnly != null) {
            component.setValueExpression("readOnly", readOnly);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (moveTopBottom != null) {
            component.setValueExpression("moveTopBottom", moveTopBottom);
        }
        if (labelOnTop != null) {
            component.setValueExpression("labelOnTop", labelOnTop);
        }
        if (labelLevel != null) {
            component.setValueExpression("labelLevel", labelLevel);
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
     * Set attribute corresponding to the "required" property
     */
    private ValueExpression required = null;
    public void setRequired (ValueExpression required) {
        this.required = required;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "toolTip" property
     */
    private ValueExpression toolTip = null;
    public void setToolTip (ValueExpression toolTip) {
        this.toolTip = toolTip;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "list" property
     */
    private ValueExpression list = null;
    public void setList (ValueExpression list) {
        this.list = list;
    }
     /**
     * Set attribute corresponding to the "label" property
     */
    private ValueExpression label = null;
    public void setLabel (ValueExpression label) {
        this.label = label;
    }
     /**
     * Set attribute corresponding to the "rows" property
     */
    private ValueExpression rows = null;
    public void setRows (ValueExpression rows) {
        this.rows = rows;
    }
     /**
     * Set attribute corresponding to the "readOnly" property
     */
    private ValueExpression readOnly = null;
    public void setReadOnly (ValueExpression readOnly) {
        this.readOnly = readOnly;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "moveTopBottom" property
     */
    private ValueExpression moveTopBottom = null;
    public void setMoveTopBottom (ValueExpression moveTopBottom) {
        this.moveTopBottom = moveTopBottom;
    }
      /**
     * Set attribute corresponding to the "labelOnTop" property
     */
    private ValueExpression labelOnTop = null;
    public void setLabelOnTop (ValueExpression labelOnTop) {
        this.labelOnTop = labelOnTop;
    }
     /**
     * Set attribute corresponding to the "labelLevel" property
     */
    private ValueExpression labelLevel = null;
    public void setLabelLevel (ValueExpression labelLevel) {
        this.labelLevel = labelLevel;
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
