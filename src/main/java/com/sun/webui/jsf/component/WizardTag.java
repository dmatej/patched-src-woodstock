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

public class WizardTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Wizard";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Wizard";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        model = null;
        onStepsTab = null;
        onFinish = null;
        visible = null;
        eventListener = null;
        styleClass = null;
        onPrevious = null;
        onStepLink = null;
        steps = null;
        rendered = null;
        onHelpTab = null;
        title = null;
        onNext = null;
        style = null;
        onClose = null;
        onCancel = null;
        onPopupDismiss = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (model != null) {
            component.setValueExpression("model", model);
        }
        if (onStepsTab != null) {
            component.setValueExpression("onStepsTab", onStepsTab);
        }
        if (onFinish != null) {
            component.setValueExpression("onFinish", onFinish);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (eventListener != null) {
            component.setValueExpression("eventListener", eventListener);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (onPrevious != null) {
            component.setValueExpression("onPrevious", onPrevious);
        }
        if (onStepLink != null) {
            component.setValueExpression("onStepLink", onStepLink);
        }
        if (steps != null) {
            component.setValueExpression("steps", steps);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (onHelpTab != null) {
            component.setValueExpression("onHelpTab", onHelpTab);
        }
        if (title != null) {
            component.setValueExpression("title", title);
        }
        if (onNext != null) {
            component.setValueExpression("onNext", onNext);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (onClose != null) {
            component.setValueExpression("onClose", onClose);
        }
        if (onCancel != null) {
            component.setValueExpression("onCancel", onCancel);
        }
        if (onPopupDismiss != null) {
            component.setValueExpression("onPopupDismiss", onPopupDismiss);
        }
     }


    /**
     * Set attribute corresponding to the "model" property
     */
    private ValueExpression model = null;
    public void setModel (ValueExpression model) {
        this.model = model;
    }
     /**
     * Set attribute corresponding to the "onStepsTab" property
     */
    private ValueExpression onStepsTab = null;
    public void setOnStepsTab (ValueExpression onStepsTab) {
        this.onStepsTab = onStepsTab;
    }
     /**
     * Set attribute corresponding to the "onFinish" property
     */
    private ValueExpression onFinish = null;
    public void setOnFinish (ValueExpression onFinish) {
        this.onFinish = onFinish;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "eventListener" property
     */
    private ValueExpression eventListener = null;
    public void setEventListener (ValueExpression eventListener) {
        this.eventListener = eventListener;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "onPrevious" property
     */
    private ValueExpression onPrevious = null;
    public void setOnPrevious (ValueExpression onPrevious) {
        this.onPrevious = onPrevious;
    }
     /**
     * Set attribute corresponding to the "onStepLink" property
     */
    private ValueExpression onStepLink = null;
    public void setOnStepLink (ValueExpression onStepLink) {
        this.onStepLink = onStepLink;
    }
     /**
     * Set attribute corresponding to the "steps" property
     */
    private ValueExpression steps = null;
    public void setSteps (ValueExpression steps) {
        this.steps = steps;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "onHelpTab" property
     */
    private ValueExpression onHelpTab = null;
    public void setOnHelpTab (ValueExpression onHelpTab) {
        this.onHelpTab = onHelpTab;
    }
      /**
     * Set attribute corresponding to the "title" property
     */
    private ValueExpression title = null;
    public void setTitle (ValueExpression title) {
        this.title = title;
    }
     /**
     * Set attribute corresponding to the "onNext" property
     */
    private ValueExpression onNext = null;
    public void setOnNext (ValueExpression onNext) {
        this.onNext = onNext;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "onClose" property
     */
    private ValueExpression onClose = null;
    public void setOnClose (ValueExpression onClose) {
        this.onClose = onClose;
    }
      /**
     * Set attribute corresponding to the "onCancel" property
     */
    private ValueExpression onCancel = null;
    public void setOnCancel (ValueExpression onCancel) {
        this.onCancel = onCancel;
    }
     /**
     * Set attribute corresponding to the "onPopupDismiss" property
     */
    private ValueExpression onPopupDismiss = null;
    public void setOnPopupDismiss (ValueExpression onPopupDismiss) {
        this.onPopupDismiss = onPopupDismiss;
    }

}
