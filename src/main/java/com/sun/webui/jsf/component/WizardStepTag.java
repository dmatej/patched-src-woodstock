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

public class WizardStepTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.WizardStep";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return null;
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        summary = null;
        detail = null;
        onStepsTab = null;
        onFinish = null;
        eventListener = null;
        onPrevious = null;
        onStepLink = null;
        onHelpTab = null;
        finish = null;
        title = null;
        help = null;
        onNext = null;
        results = null;
        onClose = null;
        onCancel = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (summary != null) {
            component.setValueExpression("summary", summary);
        }
        if (detail != null) {
            component.setValueExpression("detail", detail);
        }
        if (onStepsTab != null) {
            component.setValueExpression("onStepsTab", onStepsTab);
        }
        if (onFinish != null) {
            component.setValueExpression("onFinish", onFinish);
        }
        if (eventListener != null) {
            component.setValueExpression("eventListener", eventListener);
        }
        if (onPrevious != null) {
            component.setValueExpression("onPrevious", onPrevious);
        }
        if (onStepLink != null) {
            component.setValueExpression("onStepLink", onStepLink);
        }
        if (onHelpTab != null) {
            component.setValueExpression("onHelpTab", onHelpTab);
        }
        if (finish != null) {
            component.setValueExpression("finish", finish);
        }
        if (title != null) {
            component.setValueExpression("title", title);
        }
        if (help != null) {
            component.setValueExpression("help", help);
        }
        if (onNext != null) {
            component.setValueExpression("onNext", onNext);
        }
        if (results != null) {
            component.setValueExpression("results", results);
        }
        if (onClose != null) {
            component.setValueExpression("onClose", onClose);
        }
        if (onCancel != null) {
            component.setValueExpression("onCancel", onCancel);
        }
     }


    /**
     * Set attribute corresponding to the "summary" property
     */
    private ValueExpression summary = null;
    public void setSummary (ValueExpression summary) {
        this.summary = summary;
    }
     /**
     * Set attribute corresponding to the "detail" property
     */
    private ValueExpression detail = null;
    public void setDetail (ValueExpression detail) {
        this.detail = detail;
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
     * Set attribute corresponding to the "eventListener" property
     */
    private ValueExpression eventListener = null;
    public void setEventListener (ValueExpression eventListener) {
        this.eventListener = eventListener;
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
     * Set attribute corresponding to the "onHelpTab" property
     */
    private ValueExpression onHelpTab = null;
    public void setOnHelpTab (ValueExpression onHelpTab) {
        this.onHelpTab = onHelpTab;
    }
      /**
     * Set attribute corresponding to the "finish" property
     */
    private ValueExpression finish = null;
    public void setFinish (ValueExpression finish) {
        this.finish = finish;
    }
     /**
     * Set attribute corresponding to the "title" property
     */
    private ValueExpression title = null;
    public void setTitle (ValueExpression title) {
        this.title = title;
    }
     /**
     * Set attribute corresponding to the "help" property
     */
    private ValueExpression help = null;
    public void setHelp (ValueExpression help) {
        this.help = help;
    }
     /**
     * Set attribute corresponding to the "onNext" property
     */
    private ValueExpression onNext = null;
    public void setOnNext (ValueExpression onNext) {
        this.onNext = onNext;
    }
     /**
     * Set attribute corresponding to the "results" property
     */
    private ValueExpression results = null;
    public void setResults (ValueExpression results) {
        this.results = results;
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

}
