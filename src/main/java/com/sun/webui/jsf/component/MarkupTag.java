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

public class MarkupTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Markup";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Markup";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        extraAttributes = null;
        style = null;
        tag = null;
        singleton = null;
        styleClass = null;
        rendered = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (extraAttributes != null) {
            component.setValueExpression("extraAttributes", extraAttributes);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (tag != null) {
            component.setValueExpression("tag", tag);
        }
        if (singleton != null) {
            component.setValueExpression("singleton", singleton);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
     }


     /**
     * Set attribute corresponding to the "extraAttributes" property
     */
    private ValueExpression extraAttributes = null;
    public void setExtraAttributes (ValueExpression extraAttributes) {
        this.extraAttributes = extraAttributes;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "tag" property
     */
    private ValueExpression tag = null;
    public void setTag (ValueExpression tag) {
        this.tag = tag;
    }
     /**
     * Set attribute corresponding to the "singleton" property
     */
    private ValueExpression singleton = null;
    public void setSingleton (ValueExpression singleton) {
        this.singleton = singleton;
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
