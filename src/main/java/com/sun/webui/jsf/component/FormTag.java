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

public class FormTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Form";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Form";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        onClick = null;
        onSubmit = null;
        onMouseOver = null;
        visible = null;
        onKeyPress = null;
        autoComplete = null;
        onKeyUp = null;
        styleClass = null;
        rendered = null;
        onDblClick = null;
        onMouseMove = null;
        onMouseUp = null;
        virtualFormsConfig = null;
        style = null;
        enctype = null;
        target = null;
        onReset = null;
        onMouseDown = null;
        onKeyDown = null;
        onMouseOut = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (onClick != null) {
            component.setValueExpression("onClick", onClick);
        }
        if (onSubmit != null) {
            component.setValueExpression("onSubmit", onSubmit);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (onKeyPress != null) {
            component.setValueExpression("onKeyPress", onKeyPress);
        }
        if (autoComplete != null) {
            component.setValueExpression("autoComplete", autoComplete);
        }
        if (onKeyUp != null) {
            component.setValueExpression("onKeyUp", onKeyUp);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
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
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (virtualFormsConfig != null) {
            component.setValueExpression("virtualFormsConfig", virtualFormsConfig);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (enctype != null) {
            component.setValueExpression("enctype", enctype);
        }
        if (target != null) {
            component.setValueExpression("target", target);
        }
        if (onReset != null) {
            component.setValueExpression("onReset", onReset);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (onKeyDown != null) {
            component.setValueExpression("onKeyDown", onKeyDown);
        }
        if (onMouseOut != null) {
            component.setValueExpression("onMouseOut", onMouseOut);
        }
     }


    /**
     * Set attribute corresponding to the "onClick" property
     */
    private ValueExpression onClick = null;
    public void setOnClick (ValueExpression onClick) {
        this.onClick = onClick;
    }
     /**
     * Set attribute corresponding to the "onSubmit" property
     */
    private ValueExpression onSubmit = null;
    public void setOnSubmit (ValueExpression onSubmit) {
        this.onSubmit = onSubmit;
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
     * Set attribute corresponding to the "onKeyPress" property
     */
    private ValueExpression onKeyPress = null;
    public void setOnKeyPress (ValueExpression onKeyPress) {
        this.onKeyPress = onKeyPress;
    }
     /**
     * Set attribute corresponding to the "autoComplete" property
     */
    private ValueExpression autoComplete = null;
    public void setAutoComplete (ValueExpression autoComplete) {
        this.autoComplete = autoComplete;
    }
     /**
     * Set attribute corresponding to the "onKeyUp" property
     */
    private ValueExpression onKeyUp = null;
    public void setOnKeyUp (ValueExpression onKeyUp) {
        this.onKeyUp = onKeyUp;
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
     * Set attribute corresponding to the "onMouseUp" property
     */
    private ValueExpression onMouseUp = null;
    public void setOnMouseUp (ValueExpression onMouseUp) {
        this.onMouseUp = onMouseUp;
    }
     /**
     * Set attribute corresponding to the "virtualFormsConfig" property
     */
    private ValueExpression virtualFormsConfig = null;
    public void setVirtualFormsConfig (ValueExpression virtualFormsConfig) {
        this.virtualFormsConfig = virtualFormsConfig;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
      /**
     * Set attribute corresponding to the "enctype" property
     */
    private ValueExpression enctype = null;
    public void setEnctype (ValueExpression enctype) {
        this.enctype = enctype;
    }
     /**
     * Set attribute corresponding to the "target" property
     */
    private ValueExpression target = null;
    public void setTarget (ValueExpression target) {
        this.target = target;
    }
     /**
     * Set attribute corresponding to the "onReset" property
     */
    private ValueExpression onReset = null;
    public void setOnReset (ValueExpression onReset) {
        this.onReset = onReset;
    }
     /**
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "onKeyDown" property
     */
    private ValueExpression onKeyDown = null;
    public void setOnKeyDown (ValueExpression onKeyDown) {
        this.onKeyDown = onKeyDown;
    }
     /**
     * Set attribute corresponding to the "onMouseOut" property
     */
    private ValueExpression onMouseOut = null;
    public void setOnMouseOut (ValueExpression onMouseOut) {
        this.onMouseOut = onMouseOut;
    }

}
