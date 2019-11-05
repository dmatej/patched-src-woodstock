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

public class MetaTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Meta";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Meta";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        content = null;
        scheme = null;
        name = null;
        httpEquiv = null;
        rendered = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (content != null) {
            component.setValueExpression("content", content);
        }
        if (scheme != null) {
            component.setValueExpression("scheme", scheme);
        }
        if (name != null) {
            component.setValueExpression("name", name);
        }
        if (httpEquiv != null) {
            component.setValueExpression("httpEquiv", httpEquiv);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
     }


     /**
     * Set attribute corresponding to the "content" property
     */
    private ValueExpression content = null;
    public void setContent (ValueExpression content) {
        this.content = content;
    }
     /**
     * Set attribute corresponding to the "scheme" property
     */
    private ValueExpression scheme = null;
    public void setScheme (ValueExpression scheme) {
        this.scheme = scheme;
    }
     /**
     * Set attribute corresponding to the "name" property
     */
    private ValueExpression name = null;
    public void setName (ValueExpression name) {
        this.name = name;
    }
     /**
     * Set attribute corresponding to the "httpEquiv" property
     */
    private ValueExpression httpEquiv = null;
    public void setHttpEquiv (ValueExpression httpEquiv) {
        this.httpEquiv = httpEquiv;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }

}
