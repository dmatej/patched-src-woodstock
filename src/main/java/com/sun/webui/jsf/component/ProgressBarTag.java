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

public class ProgressBarTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.ProgressBar";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.widget.ProgressBar";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        progress = null;
        visible = null;
        status = null;
        toolTip = null;
        width = null;
        tabIndex = null;
        styleClass = null;
        rendered = null;
        type = null;
        htmlTemplate = null;
        failedStateText = null;
        refreshRate = null;
        height = null;
        style = null;
        description = null;
        overlayAnimation = null;
        taskState = null;
        progressImageUrl = null;
        ajaxify = null;
        logMessage = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (progress != null) {
            component.setValueExpression("progress", progress);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (status != null) {
            component.setValueExpression("status", status);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (width != null) {
            component.setValueExpression("width", width);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (type != null) {
            component.setValueExpression("type", type);
        }
        if (htmlTemplate != null) {
            component.setValueExpression("htmlTemplate", htmlTemplate);
        }
        if (failedStateText != null) {
            component.setValueExpression("failedStateText", failedStateText);
        }
        if (refreshRate != null) {
            component.setValueExpression("refreshRate", refreshRate);
        }
        if (height != null) {
            component.setValueExpression("height", height);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (description != null) {
            component.setValueExpression("description", description);
        }
        if (overlayAnimation != null) {
            component.setValueExpression("overlayAnimation", overlayAnimation);
        }
        if (taskState != null) {
            component.setValueExpression("taskState", taskState);
        }
        if (progressImageUrl != null) {
            component.setValueExpression("progressImageUrl", progressImageUrl);
        }
        if (ajaxify != null) {
            component.setValueExpression("ajaxify", ajaxify);
        }
        if (logMessage != null) {
            component.setValueExpression("logMessage", logMessage);
        }
     }


    /**
     * Set attribute corresponding to the "progress" property
     */
    private ValueExpression progress = null;
    public void setProgress (ValueExpression progress) {
        this.progress = progress;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "status" property
     */
    private ValueExpression status = null;
    public void setStatus (ValueExpression status) {
        this.status = status;
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
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "type" property
     */
    private ValueExpression type = null;
    public void setType (ValueExpression type) {
        this.type = type;
    }
     /**
     * Set attribute corresponding to the "htmlTemplate" property
     */
    private ValueExpression htmlTemplate = null;
    public void setHtmlTemplate (ValueExpression htmlTemplate) {
        this.htmlTemplate = htmlTemplate;
    }
     /**
     * Set attribute corresponding to the "failedStateText" property
     */
    private ValueExpression failedStateText = null;
    public void setFailedStateText (ValueExpression failedStateText) {
        this.failedStateText = failedStateText;
    }
     /**
     * Set attribute corresponding to the "refreshRate" property
     */
    private ValueExpression refreshRate = null;
    public void setRefreshRate (ValueExpression refreshRate) {
        this.refreshRate = refreshRate;
    }
      /**
     * Set attribute corresponding to the "height" property
     */
    private ValueExpression height = null;
    public void setHeight (ValueExpression height) {
        this.height = height;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
      /**
     * Set attribute corresponding to the "description" property
     */
    private ValueExpression description = null;
    public void setDescription (ValueExpression description) {
        this.description = description;
    }
     /**
     * Set attribute corresponding to the "overlayAnimation" property
     */
    private ValueExpression overlayAnimation = null;
    public void setOverlayAnimation (ValueExpression overlayAnimation) {
        this.overlayAnimation = overlayAnimation;
    }
      /**
     * Set attribute corresponding to the "taskState" property
     */
    private ValueExpression taskState = null;
    public void setTaskState (ValueExpression taskState) {
        this.taskState = taskState;
    }
     /**
     * Set attribute corresponding to the "progressImageUrl" property
     */
    private ValueExpression progressImageUrl = null;
    public void setProgressImageUrl (ValueExpression progressImageUrl) {
        this.progressImageUrl = progressImageUrl;
    }
     /**
     * Set attribute corresponding to the "ajaxify" property
     */
    private ValueExpression ajaxify = null;
    public void setAjaxify (ValueExpression ajaxify) {
        this.ajaxify = ajaxify;
    }
     /**
     * Set attribute corresponding to the "logMessage" property
     */
    private ValueExpression logMessage = null;
    public void setLogMessage (ValueExpression logMessage) {
        this.logMessage = logMessage;
    }

}
