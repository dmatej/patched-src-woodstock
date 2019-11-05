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

public class VersionPageTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.VersionPage";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.VersionPage";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        productImageDescription = null;
        visible = null;
        styleClass = null;
        rendered = null;
        productImageHeight = null;
        versionString = null;
        copyrightString = null;
        style = null;
        productImageURL = null;
        productImageWidth = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (productImageDescription != null) {
            component.setValueExpression("productImageDescription", productImageDescription);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (productImageHeight != null) {
            component.setValueExpression("productImageHeight", productImageHeight);
        }
        if (versionString != null) {
            component.setValueExpression("versionString", versionString);
        }
        if (copyrightString != null) {
            component.setValueExpression("copyrightString", copyrightString);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (productImageURL != null) {
            component.setValueExpression("productImageURL", productImageURL);
        }
        if (productImageWidth != null) {
            component.setValueExpression("productImageWidth", productImageWidth);
        }
     }


    /**
     * Set attribute corresponding to the "productImageDescription" property
     */
    private ValueExpression productImageDescription = null;
    public void setProductImageDescription (ValueExpression productImageDescription) {
        this.productImageDescription = productImageDescription;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
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
     /**
     * Set attribute corresponding to the "productImageHeight" property
     */
    private ValueExpression productImageHeight = null;
    public void setProductImageHeight (ValueExpression productImageHeight) {
        this.productImageHeight = productImageHeight;
    }
      /**
     * Set attribute corresponding to the "versionString" property
     */
    private ValueExpression versionString = null;
    public void setVersionString (ValueExpression versionString) {
        this.versionString = versionString;
    }
     /**
     * Set attribute corresponding to the "copyrightString" property
     */
    private ValueExpression copyrightString = null;
    public void setCopyrightString (ValueExpression copyrightString) {
        this.copyrightString = copyrightString;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "productImageURL" property
     */
    private ValueExpression productImageURL = null;
    public void setProductImageURL (ValueExpression productImageURL) {
        this.productImageURL = productImageURL;
    }
       /**
     * Set attribute corresponding to the "productImageWidth" property
     */
    private ValueExpression productImageWidth = null;
    public void setProductImageWidth (ValueExpression productImageWidth) {
        this.productImageWidth = productImageWidth;
    }

}
