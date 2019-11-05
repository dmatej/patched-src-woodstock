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

public class TableTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.Table";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.Table";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        summary = null;
        onClick = null;
        visible = null;
        extraTitleHtml = null;
        onKeyPress = null;
        selectMultipleButtonOnClick = null;
        augmentTitle = null;
        tabIndex = null;
        selectMultipleButton = null;
        cellPadding = null;
        preferencesPanelFocusId = null;
        deselectMultipleButtonOnClick = null;
        onKeyDown = null;
        onMouseOver = null;
        onKeyUp = null;
        width = null;
        styleClass = null;
        rendered = null;
        onMouseMove = null;
        onMouseDown = null;
        filterText = null;
        onMouseOut = null;
        footerText = null;
        deselectSingleButtonOnClick = null;
        title = null;
        onMouseUp = null;
        extraActionBottomHtml = null;
        style = null;
        lite = null;
        extraActionTopHtml = null;
        extraFooterHtml = null;
        hiddenSelectedRows = null;
        itemsText = null;
        sortPanelFocusId = null;
        paginationControls = null;
        toolTip = null;
        deselectMultipleButton = null;
        cellSpacing = null;
        onDblClick = null;
        clearSortButton = null;
        paginateButton = null;
        filterPanelFocusId = null;
        filterId = null;
        deselectSingleButton = null;
        extraPanelHtml = null;
        sortPanelToggleButton = null;
    }

    /**
     * Transfer tag attribute values to component properties.
     */
    protected void setProperties(UIComponent component) {
        super.setProperties(component);

        if (summary != null) {
            component.setValueExpression("summary", summary);
        }
        if (onClick != null) {
            component.setValueExpression("onClick", onClick);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (extraTitleHtml != null) {
            component.setValueExpression("extraTitleHtml", extraTitleHtml);
        }
        if (onKeyPress != null) {
            component.setValueExpression("onKeyPress", onKeyPress);
        }
        if (selectMultipleButtonOnClick != null) {
            component.setValueExpression("selectMultipleButtonOnClick", selectMultipleButtonOnClick);
        }
        if (augmentTitle != null) {
            component.setValueExpression("augmentTitle", augmentTitle);
        }
        if (tabIndex != null) {
            component.setValueExpression("tabIndex", tabIndex);
        }
        if (selectMultipleButton != null) {
            component.setValueExpression("selectMultipleButton", selectMultipleButton);
        }
        if (cellPadding != null) {
            component.setValueExpression("cellPadding", cellPadding);
        }
        if (preferencesPanelFocusId != null) {
            component.setValueExpression("preferencesPanelFocusId", preferencesPanelFocusId);
        }
        if (deselectMultipleButtonOnClick != null) {
            component.setValueExpression("deselectMultipleButtonOnClick", deselectMultipleButtonOnClick);
        }
        if (onKeyDown != null) {
            component.setValueExpression("onKeyDown", onKeyDown);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
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
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (onMouseMove != null) {
            component.setValueExpression("onMouseMove", onMouseMove);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (filterText != null) {
            component.setValueExpression("filterText", filterText);
        }
        if (onMouseOut != null) {
            component.setValueExpression("onMouseOut", onMouseOut);
        }
        if (footerText != null) {
            component.setValueExpression("footerText", footerText);
        }
        if (deselectSingleButtonOnClick != null) {
            component.setValueExpression("deselectSingleButtonOnClick", deselectSingleButtonOnClick);
        }
        if (title != null) {
            component.setValueExpression("title", title);
        }
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (extraActionBottomHtml != null) {
            component.setValueExpression("extraActionBottomHtml", extraActionBottomHtml);
        }
        if (style != null) {
            component.setValueExpression("style", style);
        }
        if (lite != null) {
            component.setValueExpression("lite", lite);
        }
        if (extraActionTopHtml != null) {
            component.setValueExpression("extraActionTopHtml", extraActionTopHtml);
        }
        if (extraFooterHtml != null) {
            component.setValueExpression("extraFooterHtml", extraFooterHtml);
        }
        if (hiddenSelectedRows != null) {
            component.setValueExpression("hiddenSelectedRows", hiddenSelectedRows);
        }
        if (itemsText != null) {
            component.setValueExpression("itemsText", itemsText);
        }
        if (sortPanelFocusId != null) {
            component.setValueExpression("sortPanelFocusId", sortPanelFocusId);
        }
        if (paginationControls != null) {
            component.setValueExpression("paginationControls", paginationControls);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (deselectMultipleButton != null) {
            component.setValueExpression("deselectMultipleButton", deselectMultipleButton);
        }
        if (cellSpacing != null) {
            component.setValueExpression("cellSpacing", cellSpacing);
        }
        if (onDblClick != null) {
            component.setValueExpression("onDblClick", onDblClick);
        }
        if (clearSortButton != null) {
            component.setValueExpression("clearSortButton", clearSortButton);
        }
        if (paginateButton != null) {
            component.setValueExpression("paginateButton", paginateButton);
        }
        if (filterPanelFocusId != null) {
            component.setValueExpression("filterPanelFocusId", filterPanelFocusId);
        }
        if (filterId != null) {
            component.setValueExpression("filterId", filterId);
        }
        if (deselectSingleButton != null) {
            component.setValueExpression("deselectSingleButton", deselectSingleButton);
        }
        if (extraPanelHtml != null) {
            component.setValueExpression("extraPanelHtml", extraPanelHtml);
        }
        if (sortPanelToggleButton != null) {
            component.setValueExpression("sortPanelToggleButton", sortPanelToggleButton);
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
     * Set attribute corresponding to the "onClick" property
     */
    private ValueExpression onClick = null;
    public void setOnClick (ValueExpression onClick) {
        this.onClick = onClick;
    }
     /**
     * Set attribute corresponding to the "visible" property
     */
    private ValueExpression visible = null;
    public void setVisible (ValueExpression visible) {
        this.visible = visible;
    }
     /**
     * Set attribute corresponding to the "extraTitleHtml" property
     */
    private ValueExpression extraTitleHtml = null;
    public void setExtraTitleHtml (ValueExpression extraTitleHtml) {
        this.extraTitleHtml = extraTitleHtml;
    }
     /**
     * Set attribute corresponding to the "onKeyPress" property
     */
    private ValueExpression onKeyPress = null;
    public void setOnKeyPress (ValueExpression onKeyPress) {
        this.onKeyPress = onKeyPress;
    }
     /**
     * Set attribute corresponding to the "selectMultipleButtonOnClick" property
     */
    private ValueExpression selectMultipleButtonOnClick = null;
    public void setSelectMultipleButtonOnClick (ValueExpression selectMultipleButtonOnClick) {
        this.selectMultipleButtonOnClick = selectMultipleButtonOnClick;
    }
     /**
     * Set attribute corresponding to the "augmentTitle" property
     */
    private ValueExpression augmentTitle = null;
    public void setAugmentTitle (ValueExpression augmentTitle) {
        this.augmentTitle = augmentTitle;
    }
     /**
     * Set attribute corresponding to the "tabIndex" property
     */
    private ValueExpression tabIndex = null;
    public void setTabIndex (ValueExpression tabIndex) {
        this.tabIndex = tabIndex;
    }
     /**
     * Set attribute corresponding to the "selectMultipleButton" property
     */
    private ValueExpression selectMultipleButton = null;
    public void setSelectMultipleButton (ValueExpression selectMultipleButton) {
        this.selectMultipleButton = selectMultipleButton;
    }
     /**
     * Set attribute corresponding to the "cellPadding" property
     */
    private ValueExpression cellPadding = null;
    public void setCellPadding (ValueExpression cellPadding) {
        this.cellPadding = cellPadding;
    }
     /**
     * Set attribute corresponding to the "preferencesPanelFocusId" property
     */
    private ValueExpression preferencesPanelFocusId = null;
    public void setPreferencesPanelFocusId (ValueExpression preferencesPanelFocusId) {
        this.preferencesPanelFocusId = preferencesPanelFocusId;
    }
        /**
     * Set attribute corresponding to the "deselectMultipleButtonOnClick" property
     */
    private ValueExpression deselectMultipleButtonOnClick = null;
    public void setDeselectMultipleButtonOnClick (ValueExpression deselectMultipleButtonOnClick) {
        this.deselectMultipleButtonOnClick = deselectMultipleButtonOnClick;
    }
     /**
     * Set attribute corresponding to the "onKeyDown" property
     */
    private ValueExpression onKeyDown = null;
    public void setOnKeyDown (ValueExpression onKeyDown) {
        this.onKeyDown = onKeyDown;
    }
     /**
     * Set attribute corresponding to the "onMouseOver" property
     */
    private ValueExpression onMouseOver = null;
    public void setOnMouseOver (ValueExpression onMouseOver) {
        this.onMouseOver = onMouseOver;
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
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "filterText" property
     */
    private ValueExpression filterText = null;
    public void setFilterText (ValueExpression filterText) {
        this.filterText = filterText;
    }
     /**
     * Set attribute corresponding to the "onMouseOut" property
     */
    private ValueExpression onMouseOut = null;
    public void setOnMouseOut (ValueExpression onMouseOut) {
        this.onMouseOut = onMouseOut;
    }
     /**
     * Set attribute corresponding to the "footerText" property
     */
    private ValueExpression footerText = null;
    public void setFooterText (ValueExpression footerText) {
        this.footerText = footerText;
    }
     /**
     * Set attribute corresponding to the "deselectSingleButtonOnClick" property
     */
    private ValueExpression deselectSingleButtonOnClick = null;
    public void setDeselectSingleButtonOnClick (ValueExpression deselectSingleButtonOnClick) {
        this.deselectSingleButtonOnClick = deselectSingleButtonOnClick;
    }
      /**
     * Set attribute corresponding to the "title" property
     */
    private ValueExpression title = null;
    public void setTitle (ValueExpression title) {
        this.title = title;
    }
     /**
     * Set attribute corresponding to the "onMouseUp" property
     */
    private ValueExpression onMouseUp = null;
    public void setOnMouseUp (ValueExpression onMouseUp) {
        this.onMouseUp = onMouseUp;
    }
     /**
     * Set attribute corresponding to the "extraActionBottomHtml" property
     */
    private ValueExpression extraActionBottomHtml = null;
    public void setExtraActionBottomHtml (ValueExpression extraActionBottomHtml) {
        this.extraActionBottomHtml = extraActionBottomHtml;
    }
     /**
     * Set attribute corresponding to the "style" property
     */
    private ValueExpression style = null;
    public void setStyle (ValueExpression style) {
        this.style = style;
    }
     /**
     * Set attribute corresponding to the "lite" property
     */
    private ValueExpression lite = null;
    public void setLite (ValueExpression lite) {
        this.lite = lite;
    }
     /**
     * Set attribute corresponding to the "extraActionTopHtml" property
     */
    private ValueExpression extraActionTopHtml = null;
    public void setExtraActionTopHtml (ValueExpression extraActionTopHtml) {
        this.extraActionTopHtml = extraActionTopHtml;
    }
     /**
     * Set attribute corresponding to the "extraFooterHtml" property
     */
    private ValueExpression extraFooterHtml = null;
    public void setExtraFooterHtml (ValueExpression extraFooterHtml) {
        this.extraFooterHtml = extraFooterHtml;
    }
     /**
     * Set attribute corresponding to the "hiddenSelectedRows" property
     */
    private ValueExpression hiddenSelectedRows = null;
    public void setHiddenSelectedRows (ValueExpression hiddenSelectedRows) {
        this.hiddenSelectedRows = hiddenSelectedRows;
    }
     /**
     * Set attribute corresponding to the "itemsText" property
     */
    private ValueExpression itemsText = null;
    public void setItemsText (ValueExpression itemsText) {
        this.itemsText = itemsText;
    }
     /**
     * Set attribute corresponding to the "sortPanelFocusId" property
     */
    private ValueExpression sortPanelFocusId = null;
    public void setSortPanelFocusId (ValueExpression sortPanelFocusId) {
        this.sortPanelFocusId = sortPanelFocusId;
    }
     /**
     * Set attribute corresponding to the "paginationControls" property
     */
    private ValueExpression paginationControls = null;
    public void setPaginationControls (ValueExpression paginationControls) {
        this.paginationControls = paginationControls;
    }
     /**
     * Set attribute corresponding to the "toolTip" property
     */
    private ValueExpression toolTip = null;
    public void setToolTip (ValueExpression toolTip) {
        this.toolTip = toolTip;
    }
     /**
     * Set attribute corresponding to the "deselectMultipleButton" property
     */
    private ValueExpression deselectMultipleButton = null;
    public void setDeselectMultipleButton (ValueExpression deselectMultipleButton) {
        this.deselectMultipleButton = deselectMultipleButton;
    }
     /**
     * Set attribute corresponding to the "cellSpacing" property
     */
    private ValueExpression cellSpacing = null;
    public void setCellSpacing (ValueExpression cellSpacing) {
        this.cellSpacing = cellSpacing;
    }
     /**
     * Set attribute corresponding to the "onDblClick" property
     */
    private ValueExpression onDblClick = null;
    public void setOnDblClick (ValueExpression onDblClick) {
        this.onDblClick = onDblClick;
    }
      /**
     * Set attribute corresponding to the "clearSortButton" property
     */
    private ValueExpression clearSortButton = null;
    public void setClearSortButton (ValueExpression clearSortButton) {
        this.clearSortButton = clearSortButton;
    }
     /**
     * Set attribute corresponding to the "paginateButton" property
     */
    private ValueExpression paginateButton = null;
    public void setPaginateButton (ValueExpression paginateButton) {
        this.paginateButton = paginateButton;
    }
     /**
     * Set attribute corresponding to the "filterPanelFocusId" property
     */
    private ValueExpression filterPanelFocusId = null;
    public void setFilterPanelFocusId (ValueExpression filterPanelFocusId) {
        this.filterPanelFocusId = filterPanelFocusId;
    }
     /**
     * Set attribute corresponding to the "filterId" property
     */
    private ValueExpression filterId = null;
    public void setFilterId (ValueExpression filterId) {
        this.filterId = filterId;
    }
     /**
     * Set attribute corresponding to the "deselectSingleButton" property
     */
    private ValueExpression deselectSingleButton = null;
    public void setDeselectSingleButton (ValueExpression deselectSingleButton) {
        this.deselectSingleButton = deselectSingleButton;
    }
     /**
     * Set attribute corresponding to the "extraPanelHtml" property
     */
    private ValueExpression extraPanelHtml = null;
    public void setExtraPanelHtml (ValueExpression extraPanelHtml) {
        this.extraPanelHtml = extraPanelHtml;
    }
     /**
     * Set attribute corresponding to the "sortPanelToggleButton" property
     */
    private ValueExpression sortPanelToggleButton = null;
    public void setSortPanelToggleButton (ValueExpression sortPanelToggleButton) {
        this.sortPanelToggleButton = sortPanelToggleButton;
    }

}
