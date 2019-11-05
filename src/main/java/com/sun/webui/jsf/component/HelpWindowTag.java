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

public class HelpWindowTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.HelpWindow";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.HelpWindow";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        onBlur = null;
        onClick = null;
        onMouseOver = null;
        onKeyPress = null;
        onKeyUp = null;
        toolTip = null;
        width = null;
        align = null;
        tabIndex = null;
        rendered = null;
        onMouseMove = null;
        onMouseUp = null;
        onMouseDown = null;
        onFocus = null;
        disabled = null;
        onMouseOut = null;
        onKeyDown = null;
        visible = null;
        linkText = null;
        style = null;
        windowTitle = null;
        helpSetPath = null;
        styleClass = null;
        onDblClick = null;
        helpFile = null;
        linkIcon = null;
        target = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (onBlur != null) {
            component.setValueExpression("onBlur", onBlur);
        }
        if (onClick != null) {
            component.setValueExpression("onClick", onClick);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
        }
        if (onKeyPress != null) {
            component.setValueExpression("onKeyPress", onKeyPress);
        }
        if (onKeyUp != null) {
            component.setValueExpression("onKeyUp", onKeyUp);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (width != null) {
            component.setValueExpression("width", width);
        }
        if (align != null) {
            component.setValueExpression("align", align);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (onMouseMove != null) {
            component.setValueExpression("onMouseMove", onMouseMove);
        }
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (onFocus != null) {
            component.setValueExpression("onFocus", onFocus);
        }
        if (disabled != null) {
            component.setValueExpression("disabled", disabled);
        }
        if (onMouseOut != null) {
            component.setValueExpression("onMouseOut", onMouseOut);
        }
        if (onKeyDown != null) {
            component.setValueExpression("onKeyDown", onKeyDown);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (linkText != null) {
            component.setValueExpression("linkText", linkText);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (windowTitle != null) {
            component.setValueExpression("windowTitle", windowTitle);
        }
        if (helpSetPath != null) {
            component.setValueExpression("helpSetPath", helpSetPath);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (onDblClick != null) {
            component.setValueExpression("onDblClick", onDblClick);
        }
        if (helpFile != null) {
            component.setValueExpression("helpFile", helpFile);
        }
        if (linkIcon != null) {
            component.setValueExpression("linkIcon", linkIcon);
        }
        if (target != null) {
            component.setValueExpression("target", target);
        }
     }


     /**
     * Set attribute corresponding to the "onBlur" property
     */
    private ValueExpression onBlur = null;
    public void setOnBlur (ValueExpression onBlur) {
        this.onBlur = onBlur;
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
     * Set attribute corresponding to the "onKeyPress" property
     */
    private ValueExpression onKeyPress = null;
    public void setOnKeyPress (ValueExpression onKeyPress) {
        this.onKeyPress = onKeyPress;
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
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
      /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
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
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "onFocus" property
     */
    private ValueExpression onFocus = null;
    public void setOnFocus (ValueExpression onFocus) {
        this.onFocus = onFocus;
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
     /**
     * Set attribute corresponding to the "onKeyDown" property
     */
    private ValueExpression onKeyDown = null;
    public void setOnKeyDown (ValueExpression onKeyDown) {
        this.onKeyDown = onKeyDown;
    }
      /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
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
     * Set attribute corresponding to the "windowTitle" property
     */
    private ValueExpression windowTitle = null;
    public void setWindowTitle (ValueExpression windowTitle) {
        this.windowTitle = windowTitle;
    }
     /**
     * Set attribute corresponding to the "helpSetPath" property
     */
    private ValueExpression helpSetPath = null;
    public void setHelpSetPath (ValueExpression helpSetPath) {
        this.helpSetPath = helpSetPath;
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
     * Set attribute corresponding to the "helpFile" property
     */
    private ValueExpression helpFile = null;
    public void setHelpFile (ValueExpression helpFile) {
        this.helpFile = helpFile;
    }
      /**
     * Set attribute corresponding to the "linkIcon" property
     */
    private ValueExpression linkIcon = null;
    public void setLinkIcon (ValueExpression linkIcon) {
        this.linkIcon = linkIcon;
    }
      /**
     * Set attribute corresponding to the "target" property
     */
    private ValueExpression target = null;
    public void setTarget (ValueExpression target) {
        this.target = target;
    }

}
