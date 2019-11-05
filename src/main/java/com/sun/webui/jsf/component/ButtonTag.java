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

public class ButtonTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Button";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Button";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        actionListenerExpression = null;
        immediate = null;
        rendered = null;
        actionExpression = null;
        onClick = null;
        visible = null;
        onKeyPress = null;
        tabIndex = null;
        escape = null;
        onMouseUp = null;
        style = null;
        alt = null;
        primary = null;
        reset = null;
        onFocus = null;
        noTextPadding = null;
        mini = null;
        onKeyDown = null;
        onBlur = null;
        icon = null;
        text = null;
        onMouseOver = null;
        onKeyUp = null;
        toolTip = null;
        styleClass = null;
        onDblClick = null;
        onMouseMove = null;
        onMouseDown = null;
        imageURL = null;
        disabled = null;
        onMouseOut = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (actionListenerExpression != null) {
            try {
                component.getAttributes().put("actionListenerExpression", actionListenerExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (immediate != null) {
            component.setValueExpression("immediate", immediate);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (actionExpression != null) {
            try {
                component.getAttributes().put("actionExpression", actionExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (onClick != null) {
            component.setValueExpression("onClick", onClick);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (onKeyPress != null) {
            component.setValueExpression("onKeyPress", onKeyPress);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (escape != null) {
            component.setValueExpression("escape", escape);
        }
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (alt != null) {
            component.setValueExpression("alt", alt);
        }
        if (primary != null) {
            component.setValueExpression("primary", primary);
        }
        if (reset != null) {
            component.setValueExpression("reset", reset);
        }
        if (onFocus != null) {
            component.setValueExpression("onFocus", onFocus);
        }
        if (noTextPadding != null) {
            component.setValueExpression("noTextPadding", noTextPadding);
        }
        if (mini != null) {
            component.setValueExpression("mini", mini);
        }
        if (onKeyDown != null) {
            component.setValueExpression("onKeyDown", onKeyDown);
        }
        if (onBlur != null) {
            component.setValueExpression("onBlur", onBlur);
        }
        if (icon != null) {
            component.setValueExpression("icon", icon);
        }
        if (text != null) {
            component.setValueExpression("text", text);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
        }
        if (onKeyUp != null) {
            component.setValueExpression("onKeyUp", onKeyUp);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (onDblClick != null) {
            component.setValueExpression("onDblClick", onDblClick);
        }
        if (onMouseMove != null) {
            component.setValueExpression("onMouseMove", onMouseMove);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (imageURL != null) {
            component.setValueExpression("imageURL", imageURL);
        }
        if (disabled != null) {
            component.setValueExpression("disabled", disabled);
        }
        if (onMouseOut != null) {
            component.setValueExpression("onMouseOut", onMouseOut);
        }
     }


    /**
     * Set attribute corresponding to the "actionListenerExpression" property
     */
    private MethodExpression actionListenerExpression = null;
    public void setActionListenerExpression (MethodExpression actionListenerExpression) {
        this.actionListenerExpression = actionListenerExpression;
    }
       /**
     * Set attribute corresponding to the "immediate" property
     */
    private ValueExpression immediate = null;
    public void setImmediate (ValueExpression immediate) {
        this.immediate = immediate;
    }
      /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "actionExpression" property
     */
    private MethodExpression actionExpression = null;
    public void setActionExpression (MethodExpression actionExpression) {
        this.actionExpression = actionExpression;
    }
     /**
     * Set attribute corresponding to the "onClick" property
     */
    private ValueExpression onClick = null;
    public void setOnClick (ValueExpression onClick) {
        this.onClick = onClick;
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
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "escape" property
     */
    private ValueExpression escape = null;
    public void setEscape (ValueExpression escape) {
        this.escape = escape;
    }
     /**
     * Set attribute corresponding to the "onMouseUp" property
     */
    private ValueExpression onMouseUp = null;
    public void setOnMouseUp (ValueExpression onMouseUp) {
        this.onMouseUp = onMouseUp;
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
     * Set attribute corresponding to the "primary" property
     */
    private ValueExpression primary = null;
    public void setPrimary (ValueExpression primary) {
        this.primary = primary;
    }
      /**
     * Set attribute corresponding to the "reset" property
     */
    private ValueExpression reset = null;
    public void setReset (ValueExpression reset) {
        this.reset = reset;
    }
     /**
     * Set attribute corresponding to the "onFocus" property
     */
    private ValueExpression onFocus = null;
    public void setOnFocus (ValueExpression onFocus) {
        this.onFocus = onFocus;
    }
     /**
     * Set attribute corresponding to the "noTextPadding" property
     */
    private ValueExpression noTextPadding = null;
    public void setNoTextPadding (ValueExpression noTextPadding) {
        this.noTextPadding = noTextPadding;
    }
     /**
     * Set attribute corresponding to the "mini" property
     */
    private ValueExpression mini = null;
    public void setMini (ValueExpression mini) {
        this.mini = mini;
    }
     /**
     * Set attribute corresponding to the "onKeyDown" property
     */
    private ValueExpression onKeyDown = null;
    public void setOnKeyDown (ValueExpression onKeyDown) {
        this.onKeyDown = onKeyDown;
    }
     /**
     * Set attribute corresponding to the "onBlur" property
     */
    private ValueExpression onBlur = null;
    public void setOnBlur (ValueExpression onBlur) {
        this.onBlur = onBlur;
    }
     /**
     * Set attribute corresponding to the "icon" property
     */
    private ValueExpression icon = null;
    public void setIcon (ValueExpression icon) {
        this.icon = icon;
    }
     /**
     * Set attribute corresponding to the "text" property
     */
    private ValueExpression text = null;
    public void setText (ValueExpression text) {
        this.text = text;
    }
     /**
     * Set attribute corresponding to the "onMouseOver" property
     */
    private ValueExpression onMouseOver = null;
    public void setOnMouseOver (ValueExpression onMouseOver) {
        this.onMouseOver = onMouseOver;
    }
     /**
     * Set attribute corresponding to the "onKeyUp" property
     */
    private ValueExpression onKeyUp = null;
    public void setOnKeyUp (ValueExpression onKeyUp) {
        this.onKeyUp = onKeyUp;
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
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "imageURL" property
     */
    private ValueExpression imageURL = null;
    public void setImageURL (ValueExpression imageURL) {
        this.imageURL = imageURL;
    }
     /**
     * Set attribute corresponding to the "disabled" property
     */
    private ValueExpression disabled = null;
    public void setDisabled (ValueExpression disabled) {
        this.disabled = disabled;
    }
     /**
     * Set attribute corresponding to the "onMouseOut" property
     */
    private ValueExpression onMouseOut = null;
    public void setOnMouseOut (ValueExpression onMouseOut) {
        this.onMouseOut = onMouseOut;
    }

}
