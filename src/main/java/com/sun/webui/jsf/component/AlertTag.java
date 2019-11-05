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

public class AlertTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Alert";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Alert";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        summary = null;
        detail = null;
        linkToolTip = null;
        visible = null;
        styleClass = null;
        tabIndex = null;
        linkActionExpression = null;
        rendered = null;
        type = null;
        linkText = null;
        style = null;
        alt = null;
        linkURL = null;
        linkTarget = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (summary != null) {
            component.setValueExpression("summary", summary);
        }
        if (detail != null) {
            component.setValueExpression("detail", detail);
        }
        if (linkToolTip != null) {
            component.setValueExpression("linkToolTip", linkToolTip);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (linkActionExpression != null) {
            try {
                component.getAttributes().put("linkActionExpression", linkActionExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (type != null) {
            component.setValueExpression("type", type);
        }
        if (linkText != null) {
            component.setValueExpression("linkText", linkText);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (alt != null) {
            component.setValueExpression("alt", alt);
        }
        if (linkURL != null) {
            component.setValueExpression("linkURL", linkURL);
        }
        if (linkTarget != null) {
            component.setValueExpression("linkTarget", linkTarget);
        }
     }


    /**
     * Set attribute corresponding to the "summary" property
     */
    private ValueExpression summary = null;
    public void setSummary (ValueExpression summary) {
        this.summary = summary;
    }
     /**
     * Set attribute corresponding to the "detail" property
     */
    private ValueExpression detail = null;
    public void setDetail (ValueExpression detail) {
        this.detail = detail;
    }
     /**
     * Set attribute corresponding to the "linkToolTip" property
     */
    private ValueExpression linkToolTip = null;
    public void setLinkToolTip (ValueExpression linkToolTip) {
        this.linkToolTip = linkToolTip;
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
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "linkActionExpression" property
     */
    private MethodExpression linkActionExpression = null;
    public void setLinkActionExpression (MethodExpression linkActionExpression) {
        this.linkActionExpression = linkActionExpression;
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
     * Set attribute corresponding to the "linkText" property
     */
    private ValueExpression linkText = null;
    public void setLinkText (ValueExpression linkText) {
        this.linkText = linkText;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
      /**
     * Set attribute corresponding to the "alt" property
     */
    private ValueExpression alt = null;
    public void setAlt (ValueExpression alt) {
        this.alt = alt;
    }
      /**
     * Set attribute corresponding to the "linkURL" property
     */
    private ValueExpression linkURL = null;
    public void setLinkURL (ValueExpression linkURL) {
        this.linkURL = linkURL;
    }
     /**
     * Set attribute corresponding to the "linkTarget" property
     */
    private ValueExpression linkTarget = null;
    public void setLinkTarget (ValueExpression linkTarget) {
        this.linkTarget = linkTarget;
    }

}
