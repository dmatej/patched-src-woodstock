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

public class ImageComponentTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Image";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Image";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        icon = null;
        onClick = null;
        onMouseOver = null;
        visible = null;
        hspace = null;
        toolTip = null;
        width = null;
        styleClass = null;
        align = null;
        rendered = null;
        onDblClick = null;
        onMouseMove = null;
        url = null;
        onMouseUp = null;
        height = null;
        style = null;
        alt = null;
        longDesc = null;
        onMouseDown = null;
        border = null;
        vspace = null;
        onMouseOut = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (icon != null) {
            component.setValueExpression("icon", icon);
        }
        if (onClick != null) {
            component.setValueExpression("onClick", onClick);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (hspace != null) {
            component.setValueExpression("hspace", hspace);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (width != null) {
            component.setValueExpression("width", width);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (align != null) {
            component.setValueExpression("align", align);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (onDblClick != null) {
            component.setValueExpression("onDblClick", onDblClick);
        }
        if (onMouseMove != null) {
            component.setValueExpression("onMouseMove", onMouseMove);
        }
        if (url != null) {
            component.setValueExpression("url", url);
        }
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (height != null) {
            component.setValueExpression("height", height);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (alt != null) {
            component.setValueExpression("alt", alt);
        }
        if (longDesc != null) {
            component.setValueExpression("longDesc", longDesc);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (border != null) {
            component.setValueExpression("border", border);
        }
        if (vspace != null) {
            component.setValueExpression("vspace", vspace);
        }
        if (onMouseOut != null) {
            component.setValueExpression("onMouseOut", onMouseOut);
        }
     }


    /**
     * Set attribute corresponding to the "icon" property
     */
    private ValueExpression icon = null;
    public void setIcon (ValueExpression icon) {
        this.icon = icon;
    }
     /**
     * Set attribute corresponding to the "onClick" property
     */
    private ValueExpression onClick = null;
    public void setOnClick (ValueExpression onClick) {
        this.onClick = onClick;
    }
     /**
     * Set attribute corresponding to the "onMouseOver" property
     */
    private ValueExpression onMouseOver = null;
    public void setOnMouseOver (ValueExpression onMouseOver) {
        this.onMouseOver = onMouseOver;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "hspace" property
     */
    private ValueExpression hspace = null;
    public void setHspace (ValueExpression hspace) {
        this.hspace = hspace;
    }
     /**
     * Set attribute corresponding to the "toolTip" property
     */
    private ValueExpression toolTip = null;
    public void setToolTip (ValueExpression toolTip) {
        this.toolTip = toolTip;
    }
     /**
     * Set attribute corresponding to the "width" property
     */
    private ValueExpression width = null;
    public void setWidth (ValueExpression width) {
        this.width = width;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
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
     /**
     * Set attribute corresponding to the "onDblClick" property
     */
    private ValueExpression onDblClick = null;
    public void setOnDblClick (ValueExpression onDblClick) {
        this.onDblClick = onDblClick;
    }
     /**
     * Set attribute corresponding to the "onMouseMove" property
     */
    private ValueExpression onMouseMove = null;
    public void setOnMouseMove (ValueExpression onMouseMove) {
        this.onMouseMove = onMouseMove;
    }
     /**
     * Set attribute corresponding to the "url" property
     */
    private ValueExpression url = null;
    public void setUrl (ValueExpression url) {
        this.url = url;
    }
      /**
     * Set attribute corresponding to the "onMouseUp" property
     */
    private ValueExpression onMouseUp = null;
    public void setOnMouseUp (ValueExpression onMouseUp) {
        this.onMouseUp = onMouseUp;
    }
     /**
     * Set attribute corresponding to the "height" property
     */
    private ValueExpression height = null;
    public void setHeight (ValueExpression height) {
        this.height = height;
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
     * Set attribute corresponding to the "longDesc" property
     */
    private ValueExpression longDesc = null;
    public void setLongDesc (ValueExpression longDesc) {
        this.longDesc = longDesc;
    }
     /**
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "border" property
     */
    private ValueExpression border = null;
    public void setBorder (ValueExpression border) {
        this.border = border;
    }
     /**
     * Set attribute corresponding to the "vspace" property
     */
    private ValueExpression vspace = null;
    public void setVspace (ValueExpression vspace) {
        this.vspace = vspace;
    }
     /**
     * Set attribute corresponding to the "onMouseOut" property
     */
    private ValueExpression onMouseOut = null;
    public void setOnMouseOut (ValueExpression onMouseOut) {
        this.onMouseOut = onMouseOut;
    }

}
