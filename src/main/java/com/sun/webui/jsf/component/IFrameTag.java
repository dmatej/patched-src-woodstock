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

public class IFrameTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.IFrame";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.IFrame";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        style = null;
        scrolling = null;
        toolTip = null;
        name = null;
        styleClass = null;
        longDesc = null;
        marginHeight = null;
        marginWidth = null;
        frameBorder = null;
        url = null;
        height = null;
        width = null;
        align = null;
        rendered = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (scrolling != null) {
            component.setValueExpression("scrolling", scrolling);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (name != null) {
            component.setValueExpression("name", name);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (longDesc != null) {
            component.setValueExpression("longDesc", longDesc);
        }
        if (marginHeight != null) {
            component.setValueExpression("marginHeight", marginHeight);
        }
        if (marginWidth != null) {
            component.setValueExpression("marginWidth", marginWidth);
        }
        if (frameBorder != null) {
            component.setValueExpression("frameBorder", frameBorder);
        }
        if (url != null) {
            component.setValueExpression("url", url);
        }
        if (height != null) {
            component.setValueExpression("height", height);
        }
        if (width != null) {
            component.setValueExpression("width", width);
        }
        if (align != null) {
            component.setValueExpression("align", align);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
     }


    /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "scrolling" property
     */
    private ValueExpression scrolling = null;
    public void setScrolling (ValueExpression scrolling) {
        this.scrolling = scrolling;
    }
     /**
     * Set attribute corresponding to the "toolTip" property
     */
    private ValueExpression toolTip = null;
    public void setToolTip (ValueExpression toolTip) {
        this.toolTip = toolTip;
    }
     /**
     * Set attribute corresponding to the "name" property
     */
    private ValueExpression name = null;
    public void setName (ValueExpression name) {
        this.name = name;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "longDesc" property
     */
    private ValueExpression longDesc = null;
    public void setLongDesc (ValueExpression longDesc) {
        this.longDesc = longDesc;
    }
     /**
     * Set attribute corresponding to the "marginHeight" property
     */
    private ValueExpression marginHeight = null;
    public void setMarginHeight (ValueExpression marginHeight) {
        this.marginHeight = marginHeight;
    }
     /**
     * Set attribute corresponding to the "marginWidth" property
     */
    private ValueExpression marginWidth = null;
    public void setMarginWidth (ValueExpression marginWidth) {
        this.marginWidth = marginWidth;
    }
     /**
     * Set attribute corresponding to the "frameBorder" property
     */
    private ValueExpression frameBorder = null;
    public void setFrameBorder (ValueExpression frameBorder) {
        this.frameBorder = frameBorder;
    }
     /**
     * Set attribute corresponding to the "url" property
     */
    private ValueExpression url = null;
    public void setUrl (ValueExpression url) {
        this.url = url;
    }
      /**
     * Set attribute corresponding to the "height" property
     */
    private ValueExpression height = null;
    public void setHeight (ValueExpression height) {
        this.height = height;
    }
     /**
     * Set attribute corresponding to the "width" property
     */
    private ValueExpression width = null;
    public void setWidth (ValueExpression width) {
        this.width = width;
    }
     /**
     * Set attribute corresponding to the "align" property
     */
    private ValueExpression align = null;
    public void setAlign (ValueExpression align) {
        this.align = align;
    }
      /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }

}
