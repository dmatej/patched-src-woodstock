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

public class TabSetTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.TabSet";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.TabSet";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        valueChangeListenerExpression = null;
        immediate = null;
        rendered = null;
        actionListenerExpression = null;
        selected = null;
        visible = null;
        style = null;
        styleClass = null;
        value = null;
        lite = null;
        mini = null;
        lastSelectedChildSaved = null;
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
        if (immediate != null) {
            component.setValueExpression("immediate", immediate);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (actionListenerExpression != null) {
            try {
                component.getAttributes().put("actionListenerExpression", actionListenerExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (selected != null) {
            component.setValueExpression("selected", selected);
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
        if (value != null) {
            component.setValueExpression("value", value);
        }
        if (lite != null) {
            component.setValueExpression("lite", lite);
        }
        if (mini != null) {
            component.setValueExpression("mini", mini);
        }
        if (lastSelectedChildSaved != null) {
            component.setValueExpression("lastSelectedChildSaved", lastSelectedChildSaved);
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
     * Set attribute corresponding to the "actionListenerExpression" property
     */
    private MethodExpression actionListenerExpression = null;
    public void setActionListenerExpression (MethodExpression actionListenerExpression) {
        this.actionListenerExpression = actionListenerExpression;
    }
      /**
     * Set attribute corresponding to the "selected" property
     */
    private ValueExpression selected = null;
    public void setSelected (ValueExpression selected) {
        this.selected = selected;
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
     * Set attribute corresponding to the "value" property
     */
    private ValueExpression value = null;
    public void setValue (ValueExpression value) {
        this.value = value;
    }
     /**
     * Set attribute corresponding to the "lite" property
     */
    private ValueExpression lite = null;
    public void setLite (ValueExpression lite) {
        this.lite = lite;
    }
      /**
     * Set attribute corresponding to the "mini" property
     */
    private ValueExpression mini = null;
    public void setMini (ValueExpression mini) {
        this.mini = mini;
    }
     /**
     * Set attribute corresponding to the "lastSelectedChildSaved" property
     */
    private ValueExpression lastSelectedChildSaved = null;
    public void setLastSelectedChildSaved (ValueExpression lastSelectedChildSaved) {
        this.lastSelectedChildSaved = lastSelectedChildSaved;
    }

}
