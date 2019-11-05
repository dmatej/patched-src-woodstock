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

public class PropertyTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Property";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Property";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        overlapLabel = null;
        visible = null;
        style = null;
        styleClass = null;
        noWrap = null;
        label = null;
        helpText = null;
        labelAlign = null;
        rendered = null;
        disabled = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (overlapLabel != null) {
            component.setValueExpression("overlapLabel", overlapLabel);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (noWrap != null) {
            component.setValueExpression("noWrap", noWrap);
        }
        if (label != null) {
            component.setValueExpression("label", label);
        }
        if (helpText != null) {
            component.setValueExpression("helpText", helpText);
        }
        if (labelAlign != null) {
            component.setValueExpression("labelAlign", labelAlign);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (disabled != null) {
            component.setValueExpression("disabled", disabled);
        }
     }


     /**
     * Set attribute corresponding to the "overlapLabel" property
     */
    private ValueExpression overlapLabel = null;
    public void setOverlapLabel (ValueExpression overlapLabel) {
        this.overlapLabel = overlapLabel;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "noWrap" property
     */
    private ValueExpression noWrap = null;
    public void setNoWrap (ValueExpression noWrap) {
        this.noWrap = noWrap;
    }
     /**
     * Set attribute corresponding to the "label" property
     */
    private ValueExpression label = null;
    public void setLabel (ValueExpression label) {
        this.label = label;
    }
     /**
     * Set attribute corresponding to the "helpText" property
     */
    private ValueExpression helpText = null;
    public void setHelpText (ValueExpression helpText) {
        this.helpText = helpText;
    }
     /**
     * Set attribute corresponding to the "labelAlign" property
     */
    private ValueExpression labelAlign = null;
    public void setLabelAlign (ValueExpression labelAlign) {
        this.labelAlign = labelAlign;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "disabled" property
     */
    private ValueExpression disabled = null;
    public void setDisabled (ValueExpression disabled) {
        this.disabled = disabled;
    }

}
