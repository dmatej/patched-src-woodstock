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

public class MessageGroupTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.MessageGroup";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.MessageGroup";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        title = null;
        visible = null;
        style = null;
        showSummary = null;
        toolTip = null;
        styleClass = null;
        showDetail = null;
        rendered = null;
        showGlobalOnly = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (title != null) {
            component.setValueExpression("title", title);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (showSummary != null) {
            component.setValueExpression("showSummary", showSummary);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (showDetail != null) {
            component.setValueExpression("showDetail", showDetail);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (showGlobalOnly != null) {
            component.setValueExpression("showGlobalOnly", showGlobalOnly);
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
     * Set attribute corresponding to the "showSummary" property
     */
    private ValueExpression showSummary = null;
    public void setShowSummary (ValueExpression showSummary) {
        this.showSummary = showSummary;
    }
     /**
     * Set attribute corresponding to the "toolTip" property
     */
    private ValueExpression toolTip = null;
    public void setToolTip (ValueExpression toolTip) {
        this.toolTip = toolTip;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "showDetail" property
     */
    private ValueExpression showDetail = null;
    public void setShowDetail (ValueExpression showDetail) {
        this.showDetail = showDetail;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "showGlobalOnly" property
     */
    private ValueExpression showGlobalOnly = null;
    public void setShowGlobalOnly (ValueExpression showGlobalOnly) {
        this.showGlobalOnly = showGlobalOnly;
    }

}
