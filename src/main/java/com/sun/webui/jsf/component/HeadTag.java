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

public class HeadTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Head";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Head";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        title = null;
        defaultBase = null;
        parseWidgets = null;
        javaScript = null;
        debug = null;
        rendered = null;
        meta = null;
        profile = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (title != null) {
            component.setValueExpression("title", title);
        }
        if (defaultBase != null) {
            component.setValueExpression("defaultBase", defaultBase);
        }
        if (parseWidgets != null) {
            component.setValueExpression("parseWidgets", parseWidgets);
        }
        if (javaScript != null) {
            component.setValueExpression("javaScript", javaScript);
        }
        if (debug != null) {
            component.setValueExpression("debug", debug);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (meta != null) {
            component.setValueExpression("meta", meta);
        }
        if (profile != null) {
            component.setValueExpression("profile", profile);
        }
     }


     /**
     * Set attribute corresponding to the "title" property
     */
    private ValueExpression title = null;
    public void setTitle (ValueExpression title) {
        this.title = title;
    }
     /**
     * Set attribute corresponding to the "defaultBase" property
     */
    private ValueExpression defaultBase = null;
    public void setDefaultBase (ValueExpression defaultBase) {
        this.defaultBase = defaultBase;
    }
     /**
     * Set attribute corresponding to the "parseWidgets" property
     */
    private ValueExpression parseWidgets = null;
    public void setParseWidgets (ValueExpression parseWidgets) {
        this.parseWidgets = parseWidgets;
    }
     /**
     * Set attribute corresponding to the "javaScript" property
     */
    private ValueExpression javaScript = null;
    public void setJavaScript (ValueExpression javaScript) {
        this.javaScript = javaScript;
    }
     /**
     * Set attribute corresponding to the "debug" property
     */
    private ValueExpression debug = null;
    public void setDebug (ValueExpression debug) {
        this.debug = debug;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "meta" property
     */
    private ValueExpression meta = null;
    public void setMeta (ValueExpression meta) {
        this.meta = meta;
    }
     /**
     * Set attribute corresponding to the "profile" property
     */
    private ValueExpression profile = null;
    public void setProfile (ValueExpression profile) {
        this.profile = profile;
    }

}
