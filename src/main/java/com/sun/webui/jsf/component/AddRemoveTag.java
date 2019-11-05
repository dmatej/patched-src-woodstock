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

public class AddRemoveTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.AddRemove";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.AddRemove";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        visible = null;
        toolTip = null;
        tabIndex = null;
        styleClass = null;
        label = null;
        rendered = null;
        rows = null;
        valueChangeListenerExpression = null;
        validatorExpression = null;
        immediate = null;
        selected = null;
        readOnly = null;
        style = null;
        items = null;
        converter = null;
        labelOnTop = null;
        required = null;
        disabled = null;
        vertical = null;
        selectedItemsLabel = null;
        duplicateSelections = null;
        sorted = null;
        selectAll = null;
        moveButtons = null;
        availableItemsLabel = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
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
        if (rows != null) {
            component.setValueExpression("rows", rows);
        }
        if (valueChangeListenerExpression != null) {
            try {
                component.getAttributes().put("valueChangeListenerExpression", valueChangeListenerExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (validatorExpression != null) {
            try {
                component.getAttributes().put("validatorExpression", validatorExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (immediate != null) {
            component.setValueExpression("immediate", immediate);
        }
        if (selected != null) {
            component.setValueExpression("selected", selected);
        }
        if (readOnly != null) {
            component.setValueExpression("readOnly", readOnly);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (items != null) {
            component.setValueExpression("items", items);
        }
        if (converter != null) {
            component.setValueExpression("converter", converter);
        }
        if (labelOnTop != null) {
            component.setValueExpression("labelOnTop", labelOnTop);
        }
        if (required != null) {
            component.setValueExpression("required", required);
        }
        if (disabled != null) {
            component.setValueExpression("disabled", disabled);
        }
        if (vertical != null) {
            component.setValueExpression("vertical", vertical);
        }
        if (selectedItemsLabel != null) {
            component.setValueExpression("selectedItemsLabel", selectedItemsLabel);
        }
        if (duplicateSelections != null) {
            component.setValueExpression("duplicateSelections", duplicateSelections);
        }
        if (sorted != null) {
            component.setValueExpression("sorted", sorted);
        }
        if (selectAll != null) {
            component.setValueExpression("selectAll", selectAll);
        }
        if (moveButtons != null) {
            component.setValueExpression("moveButtons", moveButtons);
        }
        if (availableItemsLabel != null) {
            component.setValueExpression("availableItemsLabel", availableItemsLabel);
        }
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
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
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
     * Set attribute corresponding to the "rows" property
     */
    private ValueExpression rows = null;
    public void setRows (ValueExpression rows) {
        this.rows = rows;
    }
      /**
     * Set attribute corresponding to the "valueChangeListenerExpression" property
     */
    private MethodExpression valueChangeListenerExpression = null;
    public void setValueChangeListenerExpression (MethodExpression valueChangeListenerExpression) {
        this.valueChangeListenerExpression = valueChangeListenerExpression;
    }
     /**
     * Set attribute corresponding to the "validatorExpression" property
     */
    private MethodExpression validatorExpression = null;
    public void setValidatorExpression (MethodExpression validatorExpression) {
        this.validatorExpression = validatorExpression;
    }
     /**
     * Set attribute corresponding to the "immediate" property
     */
    private ValueExpression immediate = null;
    public void setImmediate (ValueExpression immediate) {
        this.immediate = immediate;
    }
      /**
     * Set attribute corresponding to the "selected" property
     */
    private ValueExpression selected = null;
    public void setSelected (ValueExpression selected) {
        this.selected = selected;
    }
     /**
     * Set attribute corresponding to the "readOnly" property
     */
    private ValueExpression readOnly = null;
    public void setReadOnly (ValueExpression readOnly) {
        this.readOnly = readOnly;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "items" property
     */
    private ValueExpression items = null;
    public void setItems (ValueExpression items) {
        this.items = items;
    }
      /**
     * Set attribute corresponding to the "converter" property
     */
    private ValueExpression converter = null;
    public void setConverter (ValueExpression converter) {
        this.converter = converter;
    }
      /**
     * Set attribute corresponding to the "labelOnTop" property
     */
    private ValueExpression labelOnTop = null;
    public void setLabelOnTop (ValueExpression labelOnTop) {
        this.labelOnTop = labelOnTop;
    }
     /**
     * Set attribute corresponding to the "required" property
     */
    private ValueExpression required = null;
    public void setRequired (ValueExpression required) {
        this.required = required;
    }
     /**
     * Set attribute corresponding to the "disabled" property
     */
    private ValueExpression disabled = null;
    public void setDisabled (ValueExpression disabled) {
        this.disabled = disabled;
    }
       /**
     * Set attribute corresponding to the "vertical" property
     */
    private ValueExpression vertical = null;
    public void setVertical (ValueExpression vertical) {
        this.vertical = vertical;
    }
       /**
     * Set attribute corresponding to the "selectedItemsLabel" property
     */
    private ValueExpression selectedItemsLabel = null;
    public void setSelectedItemsLabel (ValueExpression selectedItemsLabel) {
        this.selectedItemsLabel = selectedItemsLabel;
    }
       /**
     * Set attribute corresponding to the "duplicateSelections" property
     */
    private ValueExpression duplicateSelections = null;
    public void setDuplicateSelections (ValueExpression duplicateSelections) {
        this.duplicateSelections = duplicateSelections;
    }
     /**
     * Set attribute corresponding to the "sorted" property
     */
    private ValueExpression sorted = null;
    public void setSorted (ValueExpression sorted) {
        this.sorted = sorted;
    }
        /**
     * Set attribute corresponding to the "selectAll" property
     */
    private ValueExpression selectAll = null;
    public void setSelectAll (ValueExpression selectAll) {
        this.selectAll = selectAll;
    }
           /**
     * Set attribute corresponding to the "moveButtons" property
     */
    private ValueExpression moveButtons = null;
    public void setMoveButtons (ValueExpression moveButtons) {
        this.moveButtons = moveButtons;
    }
     /**
     * Set attribute corresponding to the "availableItemsLabel" property
     */
    private ValueExpression availableItemsLabel = null;
    public void setAvailableItemsLabel (ValueExpression availableItemsLabel) {
        this.availableItemsLabel = availableItemsLabel;
    }

}
