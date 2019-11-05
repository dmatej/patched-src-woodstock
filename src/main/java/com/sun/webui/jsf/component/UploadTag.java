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

public class UploadTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Upload";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Upload";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        onClick = null;
        onKeyPress = null;
        visible = null;
        tabIndex = null;
        validatorExpression = null;
        onMouseUp = null;
        style = null;
        onFocus = null;
        onKeyDown = null;
        onBlur = null;
        onSelect = null;
        onMouseOver = null;
        onKeyUp = null;
        toolTip = null;
        styleClass = null;
        label = null;
        rendered = null;
        onDblClick = null;
        onMouseMove = null;
        valueChangeListenerExpression = null;
        immediate = null;
        readOnly = null;
        onChange = null;
        onMouseDown = null;
        labelLevel = null;
        disabled = null;
        onMouseOut = null;
        maxLength = null;
        converter = null;
        columns = null;
        uploadedFile = null;
        required = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (onClick != null) {
            component.setValueExpression("onClick", onClick);
        }
        if (onKeyPress != null) {
            component.setValueExpression("onKeyPress", onKeyPress);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (validatorExpression != null) {
            try {
                component.getAttributes().put("validatorExpression", validatorExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
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
        if (onSelect != null) {
            component.setValueExpression("onSelect", onSelect);
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
        if (label != null) {
            component.setValueExpression("label", label);
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
        if (valueChangeListenerExpression != null) {
            try {
                component.getAttributes().put("valueChangeListenerExpression", valueChangeListenerExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (immediate != null) {
            component.setValueExpression("immediate", immediate);
        }
        if (readOnly != null) {
            component.setValueExpression("readOnly", readOnly);
        }
        if (onChange != null) {
            component.setValueExpression("onChange", onChange);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (labelLevel != null) {
            component.setValueExpression("labelLevel", labelLevel);
        }
        if (disabled != null) {
            component.setValueExpression("disabled", disabled);
        }
        if (onMouseOut != null) {
            component.setValueExpression("onMouseOut", onMouseOut);
        }
        if (maxLength != null) {
            component.setValueExpression("maxLength", maxLength);
        }
        if (converter != null) {
            component.setValueExpression("converter", converter);
        }
        if (columns != null) {
            component.setValueExpression("columns", columns);
        }
        if (uploadedFile != null) {
            component.setValueExpression("uploadedFile", uploadedFile);
        }
        if (required != null) {
            component.setValueExpression("required", required);
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
     * Set attribute corresponding to the "onKeyPress" property
     */
    private ValueExpression onKeyPress = null;
    public void setOnKeyPress (ValueExpression onKeyPress) {
        this.onKeyPress = onKeyPress;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
      /**
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
      /**
     * Set attribute corresponding to the "validatorExpression" property
     */
    private MethodExpression validatorExpression = null;
    public void setValidatorExpression (MethodExpression validatorExpression) {
        this.validatorExpression = validatorExpression;
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
     * Set attribute corresponding to the "onSelect" property
     */
    private ValueExpression onSelect = null;
    public void setOnSelect (ValueExpression onSelect) {
        this.onSelect = onSelect;
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
     * Set attribute corresponding to the "label" property
     */
    private ValueExpression label = null;
    public void setLabel (ValueExpression label) {
        this.label = label;
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
     * Set attribute corresponding to the "valueChangeListenerExpression" property
     */
    private MethodExpression valueChangeListenerExpression = null;
    public void setValueChangeListenerExpression (MethodExpression valueChangeListenerExpression) {
        this.valueChangeListenerExpression = valueChangeListenerExpression;
    }
     /**
     * Set attribute corresponding to the "immediate" property
     */
    private ValueExpression immediate = null;
    public void setImmediate (ValueExpression immediate) {
        this.immediate = immediate;
    }
     /**
     * Set attribute corresponding to the "readOnly" property
     */
    private ValueExpression readOnly = null;
    public void setReadOnly (ValueExpression readOnly) {
        this.readOnly = readOnly;
    }
      /**
     * Set attribute corresponding to the "onChange" property
     */
    private ValueExpression onChange = null;
    public void setOnChange (ValueExpression onChange) {
        this.onChange = onChange;
    }
     /**
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "labelLevel" property
     */
    private ValueExpression labelLevel = null;
    public void setLabelLevel (ValueExpression labelLevel) {
        this.labelLevel = labelLevel;
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
     * Set attribute corresponding to the "maxLength" property
     */
    private ValueExpression maxLength = null;
    public void setMaxLength (ValueExpression maxLength) {
        this.maxLength = maxLength;
    }
     /**
     * Set attribute corresponding to the "converter" property
     */
    private ValueExpression converter = null;
    public void setConverter (ValueExpression converter) {
        this.converter = converter;
    }
     /**
     * Set attribute corresponding to the "columns" property
     */
    private ValueExpression columns = null;
    public void setColumns (ValueExpression columns) {
        this.columns = columns;
    }
     /**
     * Set attribute corresponding to the "uploadedFile" property
     */
    private ValueExpression uploadedFile = null;
    public void setUploadedFile (ValueExpression uploadedFile) {
        this.uploadedFile = uploadedFile;
    }
      /**
     * Set attribute corresponding to the "required" property
     */
    private ValueExpression required = null;
    public void setRequired (ValueExpression required) {
        this.required = required;
    }

}
