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

public class TableColumnTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.TableColumn";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.TableColumn";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        onClick = null;
        sort = null;
        scope = null;
        footerText = null;
        visible = null;
        onKeyPress = null;
        emptyCell = null;
        noWrap = null;
        embeddedActions = null;
        descending = null;
        onMouseUp = null;
        height = null;
        style = null;
        rowHeader = null;
        spacerColumn = null;
        sortImageURL = null;
        selectId = null;
        onKeyDown = null;
        extraFooterHtml = null;
        onMouseOver = null;
        toolTip = null;
        onKeyUp = null;
        width = null;
        styleClass = null;
        align = null;
        extraTableFooterHtml = null;
        severity = null;
        rendered = null;
        onMouseMove = null;
        onDblClick = null;
        sortIcon = null;
        onMouseDown = null;
        alignKey = null;
        tableFooterText = null;
        extraHeaderHtml = null;
        valign = null;
        headerText = null;
        onMouseOut = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (onClick != null) {
            component.setValueExpression("onClick", onClick);
        }
        if (sort != null) {
            component.setValueExpression("sort", sort);
        }
        if (scope != null) {
            component.setValueExpression("scope", scope);
        }
        if (footerText != null) {
            component.setValueExpression("footerText", footerText);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (onKeyPress != null) {
            component.setValueExpression("onKeyPress", onKeyPress);
        }
        if (emptyCell != null) {
            component.setValueExpression("emptyCell", emptyCell);
        }
        if (noWrap != null) {
            component.setValueExpression("noWrap", noWrap);
        }
        if (embeddedActions != null) {
            component.setValueExpression("embeddedActions", embeddedActions);
        }
        if (descending != null) {
            component.setValueExpression("descending", descending);
        }
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (height != null) {
            component.setValueExpression("height", height);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (rowHeader != null) {
            component.setValueExpression("rowHeader", rowHeader);
        }
        if (spacerColumn != null) {
            component.setValueExpression("spacerColumn", spacerColumn);
        }
        if (sortImageURL != null) {
            component.setValueExpression("sortImageURL", sortImageURL);
        }
        if (selectId != null) {
            component.setValueExpression("selectId", selectId);
        }
        if (onKeyDown != null) {
            component.setValueExpression("onKeyDown", onKeyDown);
        }
        if (extraFooterHtml != null) {
            component.setValueExpression("extraFooterHtml", extraFooterHtml);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (onKeyUp != null) {
            component.setValueExpression("onKeyUp", onKeyUp);
        }
        if (width != null) {
            component.setValueExpression("width", width);
        }
        if (styleClass != null) {
            component.setValueExpression("styleClass", styleClass);
        }
        if (align != null) {
            component.setValueExpression("align", align);
        }
        if (extraTableFooterHtml != null) {
            component.setValueExpression("extraTableFooterHtml", extraTableFooterHtml);
        }
        if (severity != null) {
            component.setValueExpression("severity", severity);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (onMouseMove != null) {
            component.setValueExpression("onMouseMove", onMouseMove);
        }
        if (onDblClick != null) {
            component.setValueExpression("onDblClick", onDblClick);
        }
        if (sortIcon != null) {
            component.setValueExpression("sortIcon", sortIcon);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (alignKey != null) {
            component.setValueExpression("alignKey", alignKey);
        }
        if (tableFooterText != null) {
            component.setValueExpression("tableFooterText", tableFooterText);
        }
        if (extraHeaderHtml != null) {
            component.setValueExpression("extraHeaderHtml", extraHeaderHtml);
        }
        if (valign != null) {
            component.setValueExpression("valign", valign);
        }
        if (headerText != null) {
            component.setValueExpression("headerText", headerText);
        }
        if (onMouseOut != null) {
            component.setValueExpression("onMouseOut", onMouseOut);
        }
     }


     /**
     * Set attribute corresponding to the "onClick" property
     */
    private ValueExpression onClick = null;
    public void setOnClick (ValueExpression onClick) {
        this.onClick = onClick;
    }
     /**
     * Set attribute corresponding to the "sort" property
     */
    private ValueExpression sort = null;
    public void setSort (ValueExpression sort) {
        this.sort = sort;
    }
     /**
     * Set attribute corresponding to the "scope" property
     */
    private ValueExpression scope = null;
    public void setScope (ValueExpression scope) {
        this.scope = scope;
    }
     /**
     * Set attribute corresponding to the "footerText" property
     */
    private ValueExpression footerText = null;
    public void setFooterText (ValueExpression footerText) {
        this.footerText = footerText;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "onKeyPress" property
     */
    private ValueExpression onKeyPress = null;
    public void setOnKeyPress (ValueExpression onKeyPress) {
        this.onKeyPress = onKeyPress;
    }
      /**
     * Set attribute corresponding to the "emptyCell" property
     */
    private ValueExpression emptyCell = null;
    public void setEmptyCell (ValueExpression emptyCell) {
        this.emptyCell = emptyCell;
    }
      /**
     * Set attribute corresponding to the "noWrap" property
     */
    private ValueExpression noWrap = null;
    public void setNoWrap (ValueExpression noWrap) {
        this.noWrap = noWrap;
    }
     /**
     * Set attribute corresponding to the "embeddedActions" property
     */
    private ValueExpression embeddedActions = null;
    public void setEmbeddedActions (ValueExpression embeddedActions) {
        this.embeddedActions = embeddedActions;
    }
     /**
     * Set attribute corresponding to the "descending" property
     */
    private ValueExpression descending = null;
    public void setDescending (ValueExpression descending) {
        this.descending = descending;
    }
       /**
     * Set attribute corresponding to the "onMouseUp" property
     */
    private ValueExpression onMouseUp = null;
    public void setOnMouseUp (ValueExpression onMouseUp) {
        this.onMouseUp = onMouseUp;
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
     * Set attribute corresponding to the "rowHeader" property
     */
    private ValueExpression rowHeader = null;
    public void setRowHeader (ValueExpression rowHeader) {
        this.rowHeader = rowHeader;
    }
      /**
     * Set attribute corresponding to the "spacerColumn" property
     */
    private ValueExpression spacerColumn = null;
    public void setSpacerColumn (ValueExpression spacerColumn) {
        this.spacerColumn = spacerColumn;
    }
      /**
     * Set attribute corresponding to the "sortImageURL" property
     */
    private ValueExpression sortImageURL = null;
    public void setSortImageURL (ValueExpression sortImageURL) {
        this.sortImageURL = sortImageURL;
    }
     /**
     * Set attribute corresponding to the "selectId" property
     */
    private ValueExpression selectId = null;
    public void setSelectId (ValueExpression selectId) {
        this.selectId = selectId;
    }
     /**
     * Set attribute corresponding to the "onKeyDown" property
     */
    private ValueExpression onKeyDown = null;
    public void setOnKeyDown (ValueExpression onKeyDown) {
        this.onKeyDown = onKeyDown;
    }
     /**
     * Set attribute corresponding to the "extraFooterHtml" property
     */
    private ValueExpression extraFooterHtml = null;
    public void setExtraFooterHtml (ValueExpression extraFooterHtml) {
        this.extraFooterHtml = extraFooterHtml;
    }
      /**
     * Set attribute corresponding to the "onMouseOver" property
     */
    private ValueExpression onMouseOver = null;
    public void setOnMouseOver (ValueExpression onMouseOver) {
        this.onMouseOver = onMouseOver;
    }
     /**
     * Set attribute corresponding to the "toolTip" property
     */
    private ValueExpression toolTip = null;
    public void setToolTip (ValueExpression toolTip) {
        this.toolTip = toolTip;
    }
     /**
     * Set attribute corresponding to the "onKeyUp" property
     */
    private ValueExpression onKeyUp = null;
    public void setOnKeyUp (ValueExpression onKeyUp) {
        this.onKeyUp = onKeyUp;
    }
     /**
     * Set attribute corresponding to the "width" property
     */
    private ValueExpression width = null;
    public void setWidth (ValueExpression width) {
        this.width = width;
    }
     /**
     * Set attribute corresponding to the "styleClass" property
     */
    private ValueExpression styleClass = null;
    public void setStyleClass (ValueExpression styleClass) {
        this.styleClass = styleClass;
    }
     /**
     * Set attribute corresponding to the "align" property
     */
    private ValueExpression align = null;
    public void setAlign (ValueExpression align) {
        this.align = align;
    }
     /**
     * Set attribute corresponding to the "extraTableFooterHtml" property
     */
    private ValueExpression extraTableFooterHtml = null;
    public void setExtraTableFooterHtml (ValueExpression extraTableFooterHtml) {
        this.extraTableFooterHtml = extraTableFooterHtml;
    }
      /**
     * Set attribute corresponding to the "severity" property
     */
    private ValueExpression severity = null;
    public void setSeverity (ValueExpression severity) {
        this.severity = severity;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "onMouseMove" property
     */
    private ValueExpression onMouseMove = null;
    public void setOnMouseMove (ValueExpression onMouseMove) {
        this.onMouseMove = onMouseMove;
    }
     /**
     * Set attribute corresponding to the "onDblClick" property
     */
    private ValueExpression onDblClick = null;
    public void setOnDblClick (ValueExpression onDblClick) {
        this.onDblClick = onDblClick;
    }
     /**
     * Set attribute corresponding to the "sortIcon" property
     */
    private ValueExpression sortIcon = null;
    public void setSortIcon (ValueExpression sortIcon) {
        this.sortIcon = sortIcon;
    }
     /**
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "alignKey" property
     */
    private ValueExpression alignKey = null;
    public void setAlignKey (ValueExpression alignKey) {
        this.alignKey = alignKey;
    }
     /**
     * Set attribute corresponding to the "tableFooterText" property
     */
    private ValueExpression tableFooterText = null;
    public void setTableFooterText (ValueExpression tableFooterText) {
        this.tableFooterText = tableFooterText;
    }
     /**
     * Set attribute corresponding to the "extraHeaderHtml" property
     */
    private ValueExpression extraHeaderHtml = null;
    public void setExtraHeaderHtml (ValueExpression extraHeaderHtml) {
        this.extraHeaderHtml = extraHeaderHtml;
    }
     /**
     * Set attribute corresponding to the "valign" property
     */
    private ValueExpression valign = null;
    public void setValign (ValueExpression valign) {
        this.valign = valign;
    }
     /**
     * Set attribute corresponding to the "headerText" property
     */
    private ValueExpression headerText = null;
    public void setHeaderText (ValueExpression headerText) {
        this.headerText = headerText;
    }
     /**
     * Set attribute corresponding to the "onMouseOut" property
     */
    private ValueExpression onMouseOut = null;
    public void setOnMouseOut (ValueExpression onMouseOut) {
        this.onMouseOut = onMouseOut;
    }

}
