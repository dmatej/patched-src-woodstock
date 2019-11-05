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

public class FrameSetTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.FrameSet";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.FrameSet";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        cols = null;
        borderColor = null;
        style = null;
        frameSpacing = null;
        toolTip = null;
        styleClass = null;
        frameBorder = null;
        rendered = null;
        border = null;
        rows = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (cols != null) {
            component.setValueExpression("cols", cols);
        }
        if (borderColor != null) {
            component.setValueExpression("borderColor", borderColor);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (frameSpacing != null) {
            component.setValueExpression("frameSpacing", frameSpacing);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (frameBorder != null) {
            component.setValueExpression("frameBorder", frameBorder);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (border != null) {
            component.setValueExpression("border", border);
        }
        if (rows != null) {
            component.setValueExpression("rows", rows);
        }
     }


     /**
     * Set attribute corresponding to the "cols" property
     */
    private ValueExpression cols = null;
    public void setCols (ValueExpression cols) {
        this.cols = cols;
    }
     /**
     * Set attribute corresponding to the "borderColor" property
     */
    private ValueExpression borderColor = null;
    public void setBorderColor (ValueExpression borderColor) {
        this.borderColor = borderColor;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "frameSpacing" property
     */
    private ValueExpression frameSpacing = null;
    public void setFrameSpacing (ValueExpression frameSpacing) {
        this.frameSpacing = frameSpacing;
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
     * Set attribute corresponding to the "frameBorder" property
     */
    private ValueExpression frameBorder = null;
    public void setFrameBorder (ValueExpression frameBorder) {
        this.frameBorder = frameBorder;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "border" property
     */
    private ValueExpression border = null;
    public void setBorder (ValueExpression border) {
        this.border = border;
    }
     /**
     * Set attribute corresponding to the "rows" property
     */
    private ValueExpression rows = null;
    public void setRows (ValueExpression rows) {
        this.rows = rows;
    }

}
