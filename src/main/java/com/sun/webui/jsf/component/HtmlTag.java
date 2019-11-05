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

public class HtmlTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Html";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Html";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        xmlns = null;
        rendered = null;
        lang = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (xmlns != null) {
            component.setValueExpression("xmlns", xmlns);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (lang != null) {
            component.setValueExpression("lang", lang);
        }
     }


     /**
     * Set attribute corresponding to the "xmlns" property
     */
    private ValueExpression xmlns = null;
    public void setXmlns (ValueExpression xmlns) {
        this.xmlns = xmlns;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "lang" property
     */
    private ValueExpression lang = null;
    public void setLang (ValueExpression lang) {
        this.lang = lang;
    }

}
