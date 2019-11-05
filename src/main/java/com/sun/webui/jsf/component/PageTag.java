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

public class PageTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Page";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Page";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        frame = null;
        xhtml = null;
        rendered = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (frame != null) {
            component.setValueExpression("frame", frame);
        }
        if (xhtml != null) {
            component.setValueExpression("xhtml", xhtml);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
     }


     /**
     * Set attribute corresponding to the "frame" property
     */
    private ValueExpression frame = null;
    public void setFrame (ValueExpression frame) {
        this.frame = frame;
    }
     /**
     * Set attribute corresponding to the "xhtml" property
     */
    private ValueExpression xhtml = null;
    public void setXhtml (ValueExpression xhtml) {
        this.xhtml = xhtml;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }

}
