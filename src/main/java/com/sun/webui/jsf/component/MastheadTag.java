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

public class MastheadTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Masthead";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Masthead";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        brandImageURL = null;
        brandImageHeight = null;
        visible = null;
        dateTime = null;
        brandImageWidth = null;
        secondary = null;
        serverInfoLabel = null;
        serverInfo = null;
        productImageHeight = null;
        roleInfoLabel = null;
        style = null;
        productImageURL = null;
        userInfoLabel = null;
        utilities = null;
        userInfo = null;
        productImageDescription = null;
        styleClass = null;
        brandImageDescription = null;
        rendered = null;
        roleInfo = null;
        notificationMsg = null;
        alarmCounts = null;
        productImageWidth = null;
        jobCount = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (brandImageURL != null) {
            component.setValueExpression("brandImageURL", brandImageURL);
        }
        if (brandImageHeight != null) {
            component.setValueExpression("brandImageHeight", brandImageHeight);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (dateTime != null) {
            component.setValueExpression("dateTime", dateTime);
        }
        if (brandImageWidth != null) {
            component.setValueExpression("brandImageWidth", brandImageWidth);
        }
        if (secondary != null) {
            component.setValueExpression("secondary", secondary);
        }
        if (serverInfoLabel != null) {
            component.setValueExpression("serverInfoLabel", serverInfoLabel);
        }
        if (serverInfo != null) {
            component.setValueExpression("serverInfo", serverInfo);
        }
        if (productImageHeight != null) {
            component.setValueExpression("productImageHeight", productImageHeight);
        }
        if (roleInfoLabel != null) {
            component.setValueExpression("roleInfoLabel", roleInfoLabel);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (productImageURL != null) {
            component.setValueExpression("productImageURL", productImageURL);
        }
        if (userInfoLabel != null) {
            component.setValueExpression("userInfoLabel", userInfoLabel);
        }
        if (utilities != null) {
            component.setValueExpression("utilities", utilities);
        }
        if (userInfo != null) {
            component.setValueExpression("userInfo", userInfo);
        }
        if (productImageDescription != null) {
            component.setValueExpression("productImageDescription", productImageDescription);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (brandImageDescription != null) {
            component.setValueExpression("brandImageDescription", brandImageDescription);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (roleInfo != null) {
            component.setValueExpression("roleInfo", roleInfo);
        }
        if (notificationMsg != null) {
            component.setValueExpression("notificationMsg", notificationMsg);
        }
        if (alarmCounts != null) {
            component.setValueExpression("alarmCounts", alarmCounts);
        }
        if (productImageWidth != null) {
            component.setValueExpression("productImageWidth", productImageWidth);
        }
        if (jobCount != null) {
            component.setValueExpression("jobCount", jobCount);
        }
     }


    /**
     * Set attribute corresponding to the "brandImageURL" property
     */
    private ValueExpression brandImageURL = null;
    public void setBrandImageURL (ValueExpression brandImageURL) {
        this.brandImageURL = brandImageURL;
    }
     /**
     * Set attribute corresponding to the "brandImageHeight" property
     */
    private ValueExpression brandImageHeight = null;
    public void setBrandImageHeight (ValueExpression brandImageHeight) {
        this.brandImageHeight = brandImageHeight;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "dateTime" property
     */
    private ValueExpression dateTime = null;
    public void setDateTime (ValueExpression dateTime) {
        this.dateTime = dateTime;
    }
     /**
     * Set attribute corresponding to the "brandImageWidth" property
     */
    private ValueExpression brandImageWidth = null;
    public void setBrandImageWidth (ValueExpression brandImageWidth) {
        this.brandImageWidth = brandImageWidth;
    }
     /**
     * Set attribute corresponding to the "secondary" property
     */
    private ValueExpression secondary = null;
    public void setSecondary (ValueExpression secondary) {
        this.secondary = secondary;
    }
     /**
     * Set attribute corresponding to the "serverInfoLabel" property
     */
    private ValueExpression serverInfoLabel = null;
    public void setServerInfoLabel (ValueExpression serverInfoLabel) {
        this.serverInfoLabel = serverInfoLabel;
    }
     /**
     * Set attribute corresponding to the "serverInfo" property
     */
    private ValueExpression serverInfo = null;
    public void setServerInfo (ValueExpression serverInfo) {
        this.serverInfo = serverInfo;
    }
     /**
     * Set attribute corresponding to the "productImageHeight" property
     */
    private ValueExpression productImageHeight = null;
    public void setProductImageHeight (ValueExpression productImageHeight) {
        this.productImageHeight = productImageHeight;
    }
     /**
     * Set attribute corresponding to the "roleInfoLabel" property
     */
    private ValueExpression roleInfoLabel = null;
    public void setRoleInfoLabel (ValueExpression roleInfoLabel) {
        this.roleInfoLabel = roleInfoLabel;
    }
      /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
      /**
     * Set attribute corresponding to the "productImageURL" property
     */
    private ValueExpression productImageURL = null;
    public void setProductImageURL (ValueExpression productImageURL) {
        this.productImageURL = productImageURL;
    }
     /**
     * Set attribute corresponding to the "userInfoLabel" property
     */
    private ValueExpression userInfoLabel = null;
    public void setUserInfoLabel (ValueExpression userInfoLabel) {
        this.userInfoLabel = userInfoLabel;
    }
     /**
     * Set attribute corresponding to the "utilities" property
     */
    private ValueExpression utilities = null;
    public void setUtilities (ValueExpression utilities) {
        this.utilities = utilities;
    }
      /**
     * Set attribute corresponding to the "userInfo" property
     */
    private ValueExpression userInfo = null;
    public void setUserInfo (ValueExpression userInfo) {
        this.userInfo = userInfo;
    }
     /**
     * Set attribute corresponding to the "productImageDescription" property
     */
    private ValueExpression productImageDescription = null;
    public void setProductImageDescription (ValueExpression productImageDescription) {
        this.productImageDescription = productImageDescription;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "brandImageDescription" property
     */
    private ValueExpression brandImageDescription = null;
    public void setBrandImageDescription (ValueExpression brandImageDescription) {
        this.brandImageDescription = brandImageDescription;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "roleInfo" property
     */
    private ValueExpression roleInfo = null;
    public void setRoleInfo (ValueExpression roleInfo) {
        this.roleInfo = roleInfo;
    }
     /**
     * Set attribute corresponding to the "notificationMsg" property
     */
    private ValueExpression notificationMsg = null;
    public void setNotificationMsg (ValueExpression notificationMsg) {
        this.notificationMsg = notificationMsg;
    }
     /**
     * Set attribute corresponding to the "alarmCounts" property
     */
    private ValueExpression alarmCounts = null;
    public void setAlarmCounts (ValueExpression alarmCounts) {
        this.alarmCounts = alarmCounts;
    }
     /**
     * Set attribute corresponding to the "productImageWidth" property
     */
    private ValueExpression productImageWidth = null;
    public void setProductImageWidth (ValueExpression productImageWidth) {
        this.productImageWidth = productImageWidth;
    }
     /**
     * Set attribute corresponding to the "jobCount" property
     */
    private ValueExpression jobCount = null;
    public void setJobCount (ValueExpression jobCount) {
        this.jobCount = jobCount;
    }

}
