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

public class AlarmStatusTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.AlarmStatus";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.AlarmStatus";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        actionListenerExpression = null;
        onClick = null;
        onKeyPress = null;
        hspace = null;
        tabIndex = null;
        actionExpression = null;
        type = null;
        onMouseUp = null;
        height = null;
        alt = null;
        urlLang = null;
        onFocus = null;
        border = null;
        vspace = null;
        onKeyDown = null;
        onBlur = null;
        onMouseOver = null;
        text = null;
        onKeyUp = null;
        toolTip = null;
        align = null;
        width = null;
        rendered = null;
        onMouseMove = null;
        url = null;
        immediate = null;
        target = null;
        onMouseDown = null;
        disabled = null;
        imageURL = null;
        onMouseOut = null;
        visible = null;
        styleClass = null;
        majorIcon = null;
        majorAlarms = null;
        numMajorAlarms = null;
        onDblClick = null;
        downAlarms = null;
        criticalAlarms = null;
        style = null;
        numCriticalAlarms = null;
        minorAlarms = null;
        value = null;
        numDownAlarms = null;
        criticalIcon = null;
        minorIcon = null;
        downIcon = null;
        numMinorAlarms = null;
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
        if (onClick != null) {
            component.setValueExpression("onClick", onClick);
        }
        if (onKeyPress != null) {
            component.setValueExpression("onKeyPress", onKeyPress);
        }
        if (hspace != null) {
            component.setValueExpression("hspace", hspace);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (actionExpression != null) {
            try {
                component.getAttributes().put("actionExpression", actionExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (type != null) {
            component.setValueExpression("type", type);
        }
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (height != null) {
            component.setValueExpression("height", height);
        }
        if (alt != null) {
            component.setValueExpression("alt", alt);
        }
        if (urlLang != null) {
            component.setValueExpression("urlLang", urlLang);
        }
        if (onFocus != null) {
            component.setValueExpression("onFocus", onFocus);
        }
        if (border != null) {
            component.setValueExpression("border", border);
        }
        if (vspace != null) {
            component.setValueExpression("vspace", vspace);
        }
        if (onKeyDown != null) {
            component.setValueExpression("onKeyDown", onKeyDown);
        }
        if (onBlur != null) {
            component.setValueExpression("onBlur", onBlur);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
        }
        if (text != null) {
            component.setValueExpression("text", text);
        }
        if (onKeyUp != null) {
            component.setValueExpression("onKeyUp", onKeyUp);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (align != null) {
            component.setValueExpression("align", align);
        }
        if (width != null) {
            component.setValueExpression("width", width);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (onMouseMove != null) {
            component.setValueExpression("onMouseMove", onMouseMove);
        }
        if (url != null) {
            component.setValueExpression("url", url);
        }
        if (immediate != null) {
            component.setValueExpression("immediate", immediate);
        }
        if (target != null) {
            component.setValueExpression("target", target);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (disabled != null) {
            component.setValueExpression("disabled", disabled);
        }
        if (imageURL != null) {
            component.setValueExpression("imageURL", imageURL);
        }
        if (onMouseOut != null) {
            component.setValueExpression("onMouseOut", onMouseOut);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (majorIcon != null) {
            component.setValueExpression("majorIcon", majorIcon);
        }
        if (majorAlarms != null) {
            component.setValueExpression("majorAlarms", majorAlarms);
        }
        if (numMajorAlarms != null) {
            component.setValueExpression("numMajorAlarms", numMajorAlarms);
        }
        if (onDblClick != null) {
            component.setValueExpression("onDblClick", onDblClick);
        }
        if (downAlarms != null) {
            component.setValueExpression("downAlarms", downAlarms);
        }
        if (criticalAlarms != null) {
            component.setValueExpression("criticalAlarms", criticalAlarms);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (numCriticalAlarms != null) {
            component.setValueExpression("numCriticalAlarms", numCriticalAlarms);
        }
        if (minorAlarms != null) {
            component.setValueExpression("minorAlarms", minorAlarms);
        }
        if (value != null) {
            component.setValueExpression("value", value);
        }
        if (numDownAlarms != null) {
            component.setValueExpression("numDownAlarms", numDownAlarms);
        }
        if (criticalIcon != null) {
            component.setValueExpression("criticalIcon", criticalIcon);
        }
        if (minorIcon != null) {
            component.setValueExpression("minorIcon", minorIcon);
        }
        if (downIcon != null) {
            component.setValueExpression("downIcon", downIcon);
        }
        if (numMinorAlarms != null) {
            component.setValueExpression("numMinorAlarms", numMinorAlarms);
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
     * Set attribute corresponding to the "onClick" property
     */
    private ValueExpression onClick = null;
    public void setOnClick (ValueExpression onClick) {
        this.onClick = onClick;
    }
     /**
     * Set attribute corresponding to the "onKeyPress" property
     */
    private ValueExpression onKeyPress = null;
    public void setOnKeyPress (ValueExpression onKeyPress) {
        this.onKeyPress = onKeyPress;
    }
     /**
     * Set attribute corresponding to the "hspace" property
     */
    private ValueExpression hspace = null;
    public void setHspace (ValueExpression hspace) {
        this.hspace = hspace;
    }
     /**
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "actionExpression" property
     */
    private MethodExpression actionExpression = null;
    public void setActionExpression (MethodExpression actionExpression) {
        this.actionExpression = actionExpression;
    }
     /**
     * Set attribute corresponding to the "type" property
     */
    private ValueExpression type = null;
    public void setType (ValueExpression type) {
        this.type = type;
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
     * Set attribute corresponding to the "alt" property
     */
    private ValueExpression alt = null;
    public void setAlt (ValueExpression alt) {
        this.alt = alt;
    }
      /**
     * Set attribute corresponding to the "urlLang" property
     */
    private ValueExpression urlLang = null;
    public void setUrlLang (ValueExpression urlLang) {
        this.urlLang = urlLang;
    }
     /**
     * Set attribute corresponding to the "onFocus" property
     */
    private ValueExpression onFocus = null;
    public void setOnFocus (ValueExpression onFocus) {
        this.onFocus = onFocus;
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
     * Set attribute corresponding to the "onMouseOver" property
     */
    private ValueExpression onMouseOver = null;
    public void setOnMouseOver (ValueExpression onMouseOver) {
        this.onMouseOver = onMouseOver;
    }
     /**
     * Set attribute corresponding to the "text" property
     */
    private ValueExpression text = null;
    public void setText (ValueExpression text) {
        this.text = text;
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
     * Set attribute corresponding to the "align" property
     */
    private ValueExpression align = null;
    public void setAlign (ValueExpression align) {
        this.align = align;
    }
     /**
     * Set attribute corresponding to the "width" property
     */
    private ValueExpression width = null;
    public void setWidth (ValueExpression width) {
        this.width = width;
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
     * Set attribute corresponding to the "url" property
     */
    private ValueExpression url = null;
    public void setUrl (ValueExpression url) {
        this.url = url;
    }
     /**
     * Set attribute corresponding to the "immediate" property
     */
    private ValueExpression immediate = null;
    public void setImmediate (ValueExpression immediate) {
        this.immediate = immediate;
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
     * Set attribute corresponding to the "disabled" property
     */
    private ValueExpression disabled = null;
    public void setDisabled (ValueExpression disabled) {
        this.disabled = disabled;
    }
     /**
     * Set attribute corresponding to the "imageURL" property
     */
    private ValueExpression imageURL = null;
    public void setImageURL (ValueExpression imageURL) {
        this.imageURL = imageURL;
    }
     /**
     * Set attribute corresponding to the "onMouseOut" property
     */
    private ValueExpression onMouseOut = null;
    public void setOnMouseOut (ValueExpression onMouseOut) {
        this.onMouseOut = onMouseOut;
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
     * Set attribute corresponding to the "majorIcon" property
     */
    private ValueExpression majorIcon = null;
    public void setMajorIcon (ValueExpression majorIcon) {
        this.majorIcon = majorIcon;
    }
     /**
     * Set attribute corresponding to the "majorAlarms" property
     */
    private ValueExpression majorAlarms = null;
    public void setMajorAlarms (ValueExpression majorAlarms) {
        this.majorAlarms = majorAlarms;
    }
     /**
     * Set attribute corresponding to the "numMajorAlarms" property
     */
    private ValueExpression numMajorAlarms = null;
    public void setNumMajorAlarms (ValueExpression numMajorAlarms) {
        this.numMajorAlarms = numMajorAlarms;
    }
     /**
     * Set attribute corresponding to the "onDblClick" property
     */
    private ValueExpression onDblClick = null;
    public void setOnDblClick (ValueExpression onDblClick) {
        this.onDblClick = onDblClick;
    }
     /**
     * Set attribute corresponding to the "downAlarms" property
     */
    private ValueExpression downAlarms = null;
    public void setDownAlarms (ValueExpression downAlarms) {
        this.downAlarms = downAlarms;
    }
     /**
     * Set attribute corresponding to the "criticalAlarms" property
     */
    private ValueExpression criticalAlarms = null;
    public void setCriticalAlarms (ValueExpression criticalAlarms) {
        this.criticalAlarms = criticalAlarms;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "numCriticalAlarms" property
     */
    private ValueExpression numCriticalAlarms = null;
    public void setNumCriticalAlarms (ValueExpression numCriticalAlarms) {
        this.numCriticalAlarms = numCriticalAlarms;
    }
     /**
     * Set attribute corresponding to the "minorAlarms" property
     */
    private ValueExpression minorAlarms = null;
    public void setMinorAlarms (ValueExpression minorAlarms) {
        this.minorAlarms = minorAlarms;
    }
     /**
     * Set attribute corresponding to the "value" property
     */
    private ValueExpression value = null;
    public void setValue (ValueExpression value) {
        this.value = value;
    }
     /**
     * Set attribute corresponding to the "numDownAlarms" property
     */
    private ValueExpression numDownAlarms = null;
    public void setNumDownAlarms (ValueExpression numDownAlarms) {
        this.numDownAlarms = numDownAlarms;
    }
     /**
     * Set attribute corresponding to the "criticalIcon" property
     */
    private ValueExpression criticalIcon = null;
    public void setCriticalIcon (ValueExpression criticalIcon) {
        this.criticalIcon = criticalIcon;
    }
     /**
     * Set attribute corresponding to the "minorIcon" property
     */
    private ValueExpression minorIcon = null;
    public void setMinorIcon (ValueExpression minorIcon) {
        this.minorIcon = minorIcon;
    }
     /**
     * Set attribute corresponding to the "downIcon" property
     */
    private ValueExpression downIcon = null;
    public void setDownIcon (ValueExpression downIcon) {
        this.downIcon = downIcon;
    }
     /**
     * Set attribute corresponding to the "numMinorAlarms" property
     */
    private ValueExpression numMinorAlarms = null;
    public void setNumMinorAlarms (ValueExpression numMinorAlarms) {
        this.numMinorAlarms = numMinorAlarms;
    }

}
