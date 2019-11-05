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

public class CommonTaskTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.CommonTask";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.CommonTask";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        actionListenerExpression = null;
        rendered = null;
        actionExpression = null;
        onClick = null;
        visible = null;
        onKeyPress = null;
        imageUrl = null;
        tabIndex = null;
        infoLinkText = null;
        onMouseUp = null;
        style = null;
        onFocus = null;
        onKeyDown = null;
        onBlur = null;
        imageHeight = null;
        icon = null;
        text = null;
        infoText = null;
        onMouseOver = null;
        toolTip = null;
        onKeyUp = null;
        styleClass = null;
        onDblClick = null;
        infoLinkUrl = null;
        onMouseMove = null;
        target = null;
        onMouseDown = null;
        imageWidth = null;
        infoTitle = null;
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
        if (imageUrl != null) {
            component.setValueExpression("imageUrl", imageUrl);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (infoLinkText != null) {
            component.setValueExpression("infoLinkText", infoLinkText);
        }
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (onFocus != null) {
            component.setValueExpression("onFocus", onFocus);
        }
        if (onKeyDown != null) {
            component.setValueExpression("onKeyDown", onKeyDown);
        }
        if (onBlur != null) {
            component.setValueExpression("onBlur", onBlur);
        }
        if (imageHeight != null) {
            component.setValueExpression("imageHeight", imageHeight);
        }
        if (icon != null) {
            component.setValueExpression("icon", icon);
        }
        if (text != null) {
            component.setValueExpression("text", text);
        }
        if (infoText != null) {
            component.setValueExpression("infoText", infoText);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (onKeyUp != null) {
            component.setValueExpression("onKeyUp", onKeyUp);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (onDblClick != null) {
            component.setValueExpression("onDblClick", onDblClick);
        }
        if (infoLinkUrl != null) {
            component.setValueExpression("infoLinkUrl", infoLinkUrl);
        }
        if (onMouseMove != null) {
            component.setValueExpression("onMouseMove", onMouseMove);
        }
        if (target != null) {
            component.setValueExpression("target", target);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (imageWidth != null) {
            component.setValueExpression("imageWidth", imageWidth);
        }
        if (infoTitle != null) {
            component.setValueExpression("infoTitle", infoTitle);
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
     * Set attribute corresponding to the "imageUrl" property
     */
    private ValueExpression imageUrl = null;
    public void setImageUrl (ValueExpression imageUrl) {
        this.imageUrl = imageUrl;
    }
     /**
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "infoLinkText" property
     */
    private ValueExpression infoLinkText = null;
    public void setInfoLinkText (ValueExpression infoLinkText) {
        this.infoLinkText = infoLinkText;
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
     * Set attribute corresponding to the "onFocus" property
     */
    private ValueExpression onFocus = null;
    public void setOnFocus (ValueExpression onFocus) {
        this.onFocus = onFocus;
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
     * Set attribute corresponding to the "imageHeight" property
     */
    private ValueExpression imageHeight = null;
    public void setImageHeight (ValueExpression imageHeight) {
        this.imageHeight = imageHeight;
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
     * Set attribute corresponding to the "infoText" property
     */
    private ValueExpression infoText = null;
    public void setInfoText (ValueExpression infoText) {
        this.infoText = infoText;
    }
     /**
     * Set attribute corresponding to the "onMouseOver" property
     */
    private ValueExpression onMouseOver = null;
    public void setOnMouseOver (ValueExpression onMouseOver) {
        this.onMouseOver = onMouseOver;
    }
     /**
     * Set attribute corresponding to the "toolTip" property
     */
    private ValueExpression toolTip = null;
    public void setToolTip (ValueExpression toolTip) {
        this.toolTip = toolTip;
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
     * Set attribute corresponding to the "onDblClick" property
     */
    private ValueExpression onDblClick = null;
    public void setOnDblClick (ValueExpression onDblClick) {
        this.onDblClick = onDblClick;
    }
     /**
     * Set attribute corresponding to the "infoLinkUrl" property
     */
    private ValueExpression infoLinkUrl = null;
    public void setInfoLinkUrl (ValueExpression infoLinkUrl) {
        this.infoLinkUrl = infoLinkUrl;
    }
     /**
     * Set attribute corresponding to the "onMouseMove" property
     */
    private ValueExpression onMouseMove = null;
    public void setOnMouseMove (ValueExpression onMouseMove) {
        this.onMouseMove = onMouseMove;
    }
      /**
     * Set attribute corresponding to the "target" property
     */
    private ValueExpression target = null;
    public void setTarget (ValueExpression target) {
        this.target = target;
    }
     /**
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "imageWidth" property
     */
    private ValueExpression imageWidth = null;
    public void setImageWidth (ValueExpression imageWidth) {
        this.imageWidth = imageWidth;
    }
      /**
     * Set attribute corresponding to the "infoTitle" property
     */
    private ValueExpression infoTitle = null;
    public void setInfoTitle (ValueExpression infoTitle) {
        this.infoTitle = infoTitle;
    }
     /**
     * Set attribute corresponding to the "onMouseOut" property
     */
    private ValueExpression onMouseOut = null;
    public void setOnMouseOut (ValueExpression onMouseOut) {
        this.onMouseOut = onMouseOut;
    }

}
