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

public class WizardBranchStepsTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.WizardBranchSteps";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return null;
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        taken = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (taken != null) {
            component.setValueExpression("taken", taken);
        }
     }


                   /**
     * Set attribute corresponding to the "taken" property
     */
    private ValueExpression taken = null;
    public void setTaken (ValueExpression taken) {
        this.taken = taken;
    }

}
