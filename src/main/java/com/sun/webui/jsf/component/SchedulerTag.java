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

public class SchedulerTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Scheduler";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Scheduler";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        valueChangeListenerExpression = null;
        validatorExpression = null;
        immediate = null;
        rendered = null;
        visible = null;
        endTimeLabel = null;
        tabIndex = null;
        previewButton = null;
        timeZone = null;
        startTimeLabel = null;
        endTime = null;
        repeating = null;
        startTime = null;
        dateFormatPatternHelp = null;
        style = null;
        value = null;
        dateFormatPattern = null;
        styleClass = null;
        repeatIntervalItems = null;
        requiredLegend = null;
        repeatIntervalLabel = null;
        repeatLimitLabel = null;
        readOnly = null;
        maxDate = null;
        repeatUnitItems = null;
        dateLabel = null;
        minDate = null;
        limitRepeating = null;
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
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (endTimeLabel != null) {
            component.setValueExpression("endTimeLabel", endTimeLabel);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (previewButton != null) {
            component.setValueExpression("previewButton", previewButton);
        }
        if (timeZone != null) {
            component.setValueExpression("timeZone", timeZone);
        }
        if (startTimeLabel != null) {
            component.setValueExpression("startTimeLabel", startTimeLabel);
        }
        if (endTime != null) {
            component.setValueExpression("endTime", endTime);
        }
        if (repeating != null) {
            component.setValueExpression("repeating", repeating);
        }
        if (startTime != null) {
            component.setValueExpression("startTime", startTime);
        }
        if (dateFormatPatternHelp != null) {
            component.setValueExpression("dateFormatPatternHelp", dateFormatPatternHelp);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (value != null) {
            component.setValueExpression("value", value);
        }
        if (dateFormatPattern != null) {
            component.setValueExpression("dateFormatPattern", dateFormatPattern);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (repeatIntervalItems != null) {
            component.setValueExpression("repeatIntervalItems", repeatIntervalItems);
        }
        if (requiredLegend != null) {
            component.setValueExpression("requiredLegend", requiredLegend);
        }
        if (repeatIntervalLabel != null) {
            component.setValueExpression("repeatIntervalLabel", repeatIntervalLabel);
        }
        if (repeatLimitLabel != null) {
            component.setValueExpression("repeatLimitLabel", repeatLimitLabel);
        }
        if (readOnly != null) {
            component.setValueExpression("readOnly", readOnly);
        }
        if (maxDate != null) {
            component.setValueExpression("maxDate", maxDate);
        }
        if (repeatUnitItems != null) {
            component.setValueExpression("repeatUnitItems", repeatUnitItems);
        }
        if (dateLabel != null) {
            component.setValueExpression("dateLabel", dateLabel);
        }
        if (minDate != null) {
            component.setValueExpression("minDate", minDate);
        }
        if (limitRepeating != null) {
            component.setValueExpression("limitRepeating", limitRepeating);
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
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "endTimeLabel" property
     */
    private ValueExpression endTimeLabel = null;
    public void setEndTimeLabel (ValueExpression endTimeLabel) {
        this.endTimeLabel = endTimeLabel;
    }
     /**
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "previewButton" property
     */
    private ValueExpression previewButton = null;
    public void setPreviewButton (ValueExpression previewButton) {
        this.previewButton = previewButton;
    }
     /**
     * Set attribute corresponding to the "timeZone" property
     */
    private ValueExpression timeZone = null;
    public void setTimeZone (ValueExpression timeZone) {
        this.timeZone = timeZone;
    }
     /**
     * Set attribute corresponding to the "startTimeLabel" property
     */
    private ValueExpression startTimeLabel = null;
    public void setStartTimeLabel (ValueExpression startTimeLabel) {
        this.startTimeLabel = startTimeLabel;
    }
     /**
     * Set attribute corresponding to the "endTime" property
     */
    private ValueExpression endTime = null;
    public void setEndTime (ValueExpression endTime) {
        this.endTime = endTime;
    }
     /**
     * Set attribute corresponding to the "repeating" property
     */
    private ValueExpression repeating = null;
    public void setRepeating (ValueExpression repeating) {
        this.repeating = repeating;
    }
     /**
     * Set attribute corresponding to the "startTime" property
     */
    private ValueExpression startTime = null;
    public void setStartTime (ValueExpression startTime) {
        this.startTime = startTime;
    }
     /**
     * Set attribute corresponding to the "dateFormatPatternHelp" property
     */
    private ValueExpression dateFormatPatternHelp = null;
    public void setDateFormatPatternHelp (ValueExpression dateFormatPatternHelp) {
        this.dateFormatPatternHelp = dateFormatPatternHelp;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
      /**
     * Set attribute corresponding to the "value" property
     */
    private ValueExpression value = null;
    public void setValue (ValueExpression value) {
        this.value = value;
    }
     /**
     * Set attribute corresponding to the "dateFormatPattern" property
     */
    private ValueExpression dateFormatPattern = null;
    public void setDateFormatPattern (ValueExpression dateFormatPattern) {
        this.dateFormatPattern = dateFormatPattern;
    }
      /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "repeatIntervalItems" property
     */
    private ValueExpression repeatIntervalItems = null;
    public void setRepeatIntervalItems (ValueExpression repeatIntervalItems) {
        this.repeatIntervalItems = repeatIntervalItems;
    }
     /**
     * Set attribute corresponding to the "requiredLegend" property
     */
    private ValueExpression requiredLegend = null;
    public void setRequiredLegend (ValueExpression requiredLegend) {
        this.requiredLegend = requiredLegend;
    }
     /**
     * Set attribute corresponding to the "repeatIntervalLabel" property
     */
    private ValueExpression repeatIntervalLabel = null;
    public void setRepeatIntervalLabel (ValueExpression repeatIntervalLabel) {
        this.repeatIntervalLabel = repeatIntervalLabel;
    }
     /**
     * Set attribute corresponding to the "repeatLimitLabel" property
     */
    private ValueExpression repeatLimitLabel = null;
    public void setRepeatLimitLabel (ValueExpression repeatLimitLabel) {
        this.repeatLimitLabel = repeatLimitLabel;
    }
     /**
     * Set attribute corresponding to the "readOnly" property
     */
    private ValueExpression readOnly = null;
    public void setReadOnly (ValueExpression readOnly) {
        this.readOnly = readOnly;
    }
     /**
     * Set attribute corresponding to the "maxDate" property
     */
    private ValueExpression maxDate = null;
    public void setMaxDate (ValueExpression maxDate) {
        this.maxDate = maxDate;
    }
     /**
     * Set attribute corresponding to the "repeatUnitItems" property
     */
    private ValueExpression repeatUnitItems = null;
    public void setRepeatUnitItems (ValueExpression repeatUnitItems) {
        this.repeatUnitItems = repeatUnitItems;
    }
     /**
     * Set attribute corresponding to the "dateLabel" property
     */
    private ValueExpression dateLabel = null;
    public void setDateLabel (ValueExpression dateLabel) {
        this.dateLabel = dateLabel;
    }
     /**
     * Set attribute corresponding to the "minDate" property
     */
    private ValueExpression minDate = null;
    public void setMinDate (ValueExpression minDate) {
        this.minDate = minDate;
    }
     /**
     * Set attribute corresponding to the "limitRepeating" property
     */
    private ValueExpression limitRepeating = null;
    public void setLimitRepeating (ValueExpression limitRepeating) {
        this.limitRepeating = limitRepeating;
    }

}
