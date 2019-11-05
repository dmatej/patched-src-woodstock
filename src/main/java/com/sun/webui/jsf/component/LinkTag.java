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

public class LinkTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Link";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Link";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        urlLang = null;
        charset = null;
        rel = null;
        rendered = null;
        type = null;
        media = null;
        url = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (urlLang != null) {
            component.setValueExpression("urlLang", urlLang);
        }
        if (charset != null) {
            component.setValueExpression("charset", charset);
        }
        if (rel != null) {
            component.setValueExpression("rel", rel);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (type != null) {
            component.setValueExpression("type", type);
        }
        if (media != null) {
            component.setValueExpression("media", media);
        }
        if (url != null) {
            component.setValueExpression("url", url);
        }
     }


     /**
     * Set attribute corresponding to the "urlLang" property
     */
    private ValueExpression urlLang = null;
    public void setUrlLang (ValueExpression urlLang) {
        this.urlLang = urlLang;
    }
     /**
     * Set attribute corresponding to the "charset" property
     */
    private ValueExpression charset = null;
    public void setCharset (ValueExpression charset) {
        this.charset = charset;
    }
     /**
     * Set attribute corresponding to the "rel" property
     */
    private ValueExpression rel = null;
    public void setRel (ValueExpression rel) {
        this.rel = rel;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "type" property
     */
    private ValueExpression type = null;
    public void setType (ValueExpression type) {
        this.type = type;
    }
     /**
     * Set attribute corresponding to the "media" property
     */
    private ValueExpression media = null;
    public void setMedia (ValueExpression media) {
        this.media = media;
    }
     /**
     * Set attribute corresponding to the "url" property
     */
    private ValueExpression url = null;
    public void setUrl (ValueExpression url) {
        this.url = url;
    }

}
