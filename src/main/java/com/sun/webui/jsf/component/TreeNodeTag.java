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

public class TreeNodeTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.TreeNode";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.TreeNode";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        actionListenerExpression = null;
        text = null;
        visible = null;
        toolTip = null;
        styleClass = null;
        actionExpression = null;
        expanded = null;
        rendered = null;
        url = null;
        style = null;
        target = null;
        imageURL = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (actionListenerExpression != null) {
            try {
                component.getAttributes().put("actionListenerExpression", actionListenerExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (text != null) {
            component.setValueExpression("text", text);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (actionExpression != null) {
            try {
                component.getAttributes().put("actionExpression", actionExpression);
            } catch (ELException e) {
                throw new FacesException(e);
            }
        }
        if (expanded != null) {
            component.setValueExpression("expanded", expanded);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (url != null) {
            component.setValueExpression("url", url);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (target != null) {
            component.setValueExpression("target", target);
        }
        if (imageURL != null) {
            component.setValueExpression("imageURL", imageURL);
        }
     }


    /**
     * Set attribute corresponding to the "actionListenerExpression" property
     */
    private MethodExpression actionListenerExpression = null;
    public void setActionListenerExpression (MethodExpression actionListenerExpression) {
        this.actionListenerExpression = actionListenerExpression;
    }
     /**
     * Set attribute corresponding to the "text" property
     */
    private ValueExpression text = null;
    public void setText (ValueExpression text) {
        this.text = text;
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
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "actionExpression" property
     */
    private MethodExpression actionExpression = null;
    public void setActionExpression (MethodExpression actionExpression) {
        this.actionExpression = actionExpression;
    }
     /**
     * Set attribute corresponding to the "expanded" property
     */
    private ValueExpression expanded = null;
    public void setExpanded (ValueExpression expanded) {
        this.expanded = expanded;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "url" property
     */
    private ValueExpression url = null;
    public void setUrl (ValueExpression url) {
        this.url = url;
    }
      /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "target" property
     */
    private ValueExpression target = null;
    public void setTarget (ValueExpression target) {
        this.target = target;
    }
     /**
     * Set attribute corresponding to the "imageURL" property
     */
    private ValueExpression imageURL = null;
    public void setImageURL (ValueExpression imageURL) {
        this.imageURL = imageURL;
    }

}
