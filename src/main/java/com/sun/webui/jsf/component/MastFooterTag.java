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

public class MastFooterTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.MastFooter";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.MastFooter";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        corporateImageDescription = null;
        visible = null;
        style = null;
        corporateImageHeight = null;
        styleClass = null;
        corporateImageWidth = null;
        corporateImageURL = null;
        rendered = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (corporateImageDescription != null) {
            component.setValueExpression("corporateImageDescription", corporateImageDescription);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (corporateImageHeight != null) {
            component.setValueExpression("corporateImageHeight", corporateImageHeight);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (corporateImageWidth != null) {
            component.setValueExpression("corporateImageWidth", corporateImageWidth);
        }
        if (corporateImageURL != null) {
            component.setValueExpression("corporateImageURL", corporateImageURL);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
     }


     /**
     * Set attribute corresponding to the "corporateImageDescription" property
     */
    private ValueExpression corporateImageDescription = null;
    public void setCorporateImageDescription (ValueExpression corporateImageDescription) {
        this.corporateImageDescription = corporateImageDescription;
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
     * Set attribute corresponding to the "corporateImageHeight" property
     */
    private ValueExpression corporateImageHeight = null;
    public void setCorporateImageHeight (ValueExpression corporateImageHeight) {
        this.corporateImageHeight = corporateImageHeight;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "corporateImageWidth" property
     */
    private ValueExpression corporateImageWidth = null;
    public void setCorporateImageWidth (ValueExpression corporateImageWidth) {
        this.corporateImageWidth = corporateImageWidth;
    }
     /**
     * Set attribute corresponding to the "corporateImageURL" property
     */
    private ValueExpression corporateImageURL = null;
    public void setCorporateImageURL (ValueExpression corporateImageURL) {
        this.corporateImageURL = corporateImageURL;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }

}
