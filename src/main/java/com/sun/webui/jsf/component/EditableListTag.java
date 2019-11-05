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

public class EditableListTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.EditableList";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.EditableList";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        valueChangeListenerExpression = null;
        rendered = null;
        required = null;
        visible = null;
        toolTip = null;
        sorted = null;
        styleClass = null;
        tabIndex = null;
        list = null;
        fieldLabel = null;
        rows = null;
        readOnly = null;
        maxLength = null;
        style = null;
        listValidatorExpression = null;
        listOnTop = null;
        listLabel = null;
        labelLevel = null;
        fieldValidatorExpression = null;
        multiple = null;
        disabled = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (valueChangeListenerExpression != null) {
            try {
                component.getAttributes().put("valueChangeListenerExpression", valueChangeListenerExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (required != null) {
            component.setValueExpression("required", required);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (sorted != null) {
            component.setValueExpression("sorted", sorted);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (list != null) {
            component.setValueExpression("list", list);
        }
        if (fieldLabel != null) {
            component.setValueExpression("fieldLabel", fieldLabel);
        }
        if (rows != null) {
            component.setValueExpression("rows", rows);
        }
        if (readOnly != null) {
            component.setValueExpression("readOnly", readOnly);
        }
        if (maxLength != null) {
            component.setValueExpression("maxLength", maxLength);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (listValidatorExpression != null) {
            try {
                component.getAttributes().put("listValidatorExpression", listValidatorExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (listOnTop != null) {
            component.setValueExpression("listOnTop", listOnTop);
        }
        if (listLabel != null) {
            component.setValueExpression("listLabel", listLabel);
        }
        if (labelLevel != null) {
            component.setValueExpression("labelLevel", labelLevel);
        }
        if (fieldValidatorExpression != null) {
            try {
                component.getAttributes().put("fieldValidatorExpression", fieldValidatorExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (multiple != null) {
            component.setValueExpression("multiple", multiple);
        }
        if (disabled != null) {
            component.setValueExpression("disabled", disabled);
        }
     }


     /**
     * Set attribute corresponding to the "valueChangeListenerExpression" property
     */
    private MethodExpression valueChangeListenerExpression = null;
    public void setValueChangeListenerExpression (MethodExpression valueChangeListenerExpression) {
        this.valueChangeListenerExpression = valueChangeListenerExpression;
    }
         /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "required" property
     */
    private ValueExpression required = null;
    public void setRequired (ValueExpression required) {
        this.required = required;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "toolTip" property
     */
    private ValueExpression toolTip = null;
    public void setToolTip (ValueExpression toolTip) {
        this.toolTip = toolTip;
    }
     /**
     * Set attribute corresponding to the "sorted" property
     */
    private ValueExpression sorted = null;
    public void setSorted (ValueExpression sorted) {
        this.sorted = sorted;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "list" property
     */
    private ValueExpression list = null;
    public void setList (ValueExpression list) {
        this.list = list;
    }
     /**
     * Set attribute corresponding to the "fieldLabel" property
     */
    private ValueExpression fieldLabel = null;
    public void setFieldLabel (ValueExpression fieldLabel) {
        this.fieldLabel = fieldLabel;
    }
     /**
     * Set attribute corresponding to the "rows" property
     */
    private ValueExpression rows = null;
    public void setRows (ValueExpression rows) {
        this.rows = rows;
    }
       /**
     * Set attribute corresponding to the "readOnly" property
     */
    private ValueExpression readOnly = null;
    public void setReadOnly (ValueExpression readOnly) {
        this.readOnly = readOnly;
    }
     /**
     * Set attribute corresponding to the "maxLength" property
     */
    private ValueExpression maxLength = null;
    public void setMaxLength (ValueExpression maxLength) {
        this.maxLength = maxLength;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "listValidatorExpression" property
     */
    private MethodExpression listValidatorExpression = null;
    public void setListValidatorExpression (MethodExpression listValidatorExpression) {
        this.listValidatorExpression = listValidatorExpression;
    }
     /**
     * Set attribute corresponding to the "listOnTop" property
     */
    private ValueExpression listOnTop = null;
    public void setListOnTop (ValueExpression listOnTop) {
        this.listOnTop = listOnTop;
    }
      /**
     * Set attribute corresponding to the "listLabel" property
     */
    private ValueExpression listLabel = null;
    public void setListLabel (ValueExpression listLabel) {
        this.listLabel = listLabel;
    }
      /**
     * Set attribute corresponding to the "labelLevel" property
     */
    private ValueExpression labelLevel = null;
    public void setLabelLevel (ValueExpression labelLevel) {
        this.labelLevel = labelLevel;
    }
     /**
     * Set attribute corresponding to the "fieldValidatorExpression" property
     */
    private MethodExpression fieldValidatorExpression = null;
    public void setFieldValidatorExpression (MethodExpression fieldValidatorExpression) {
        this.fieldValidatorExpression = fieldValidatorExpression;
    }
     /**
     * Set attribute corresponding to the "multiple" property
     */
    private ValueExpression multiple = null;
    public void setMultiple (ValueExpression multiple) {
        this.multiple = multiple;
    }
     /**
     * Set attribute corresponding to the "disabled" property
     */
    private ValueExpression disabled = null;
    public void setDisabled (ValueExpression disabled) {
        this.disabled = disabled;
    }

}
