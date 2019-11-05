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

public class PropertySheetTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.PropertySheet";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.PropertySheet";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        visible = null;
        style = null;
        requiredFields = null;
        jumpLinks = null;
        styleClass = null;
        rendered = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (requiredFields != null) {
            component.setValueExpression("requiredFields", requiredFields);
        }
        if (jumpLinks != null) {
            component.setValueExpression("jumpLinks", jumpLinks);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
     }


     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "requiredFields" property
     */
    private ValueExpression requiredFields = null;
    public void setRequiredFields (ValueExpression requiredFields) {
        this.requiredFields = requiredFields;
    }
     /**
     * Set attribute corresponding to the "jumpLinks" property
     */
    private ValueExpression jumpLinks = null;
    public void setJumpLinks (ValueExpression jumpLinks) {
        this.jumpLinks = jumpLinks;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }

}
