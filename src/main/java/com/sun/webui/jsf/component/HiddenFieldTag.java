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

public class HiddenFieldTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.HiddenField";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.HiddenField";
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
        text = null;
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
        if (text != null) {
            component.setValueExpression("text", text);
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
     * Set attribute corresponding to the "text" property
     */
    private ValueExpression text = null;
    public void setText (ValueExpression text) {
        this.text = text;
    }
       /**
     * Set attribute corresponding to the "disabled" property
     */
    private ValueExpression disabled = null;
    public void setDisabled (ValueExpression disabled) {
        this.disabled = disabled;
    }

}
