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

public class TableRowGroupTag extends UIComponentELTag {

    /**
     * Returns the requested component type.
     */
    public String getComponentType() {
        return "com.sun.webui.jsf.TableRowGroup";
    }

    /**
     * Returns the requested renderer type.
     */
    public String getRendererType() {
        return "com.sun.webui.jsf.TableRowGroup";
    }

    /**
     * Release any allocated tag handler attributes.
     */
    public void release() {
        super.release();
        onClick = null;
        footerText = null;
        visible = null;
        onKeyPress = null;
        selectMultipleToggleButton = null;
        tableDataSorter = null;
        styleClasses = null;
        selected = null;
        groupToggleButton = null;
        onMouseUp = null;
        multipleColumnFooters = null;
        onKeyDown = null;
        extraFooterHtml = null;
        aboveColumnFooter = null;
        onMouseOver = null;
        sourceData = null;
        tableDataFilter = null;
        aboveColumnHeader = null;
        toolTip = null;
        onKeyUp = null;
        align = null;
        rendered = null;
        onDblClick = null;
        onMouseMove = null;
        rows = null;
        collapsed = null;
        onMouseDown = null;
        multipleTableColumnFooters = null;
        extraHeaderHtml = null;
        valign = null;
        sourceVar = null;
        first = null;
        headerText = null;
        emptyDataMsg = null;
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
        if (footerText != null) {
            component.setValueExpression("footerText", footerText);
        }
        if (visible != null) {
            component.setValueExpression("visible", visible);
        }
        if (onKeyPress != null) {
            component.setValueExpression("onKeyPress", onKeyPress);
        }
        if (selectMultipleToggleButton != null) {
            component.setValueExpression("selectMultipleToggleButton", selectMultipleToggleButton);
        }
        if (tableDataSorter != null) {
            component.setValueExpression("tableDataSorter", tableDataSorter);
        }
        if (styleClasses != null) {
            component.setValueExpression("styleClasses", styleClasses);
        }
        if (selected != null) {
            component.setValueExpression("selected", selected);
        }
        if (groupToggleButton != null) {
            component.setValueExpression("groupToggleButton", groupToggleButton);
        }
        if (onMouseUp != null) {
            component.setValueExpression("onMouseUp", onMouseUp);
        }
        if (multipleColumnFooters != null) {
            component.setValueExpression("multipleColumnFooters", multipleColumnFooters);
        }
        if (onKeyDown != null) {
            component.setValueExpression("onKeyDown", onKeyDown);
        }
        if (extraFooterHtml != null) {
            component.setValueExpression("extraFooterHtml", extraFooterHtml);
        }
        if (aboveColumnFooter != null) {
            component.setValueExpression("aboveColumnFooter", aboveColumnFooter);
        }
        if (onMouseOver != null) {
            component.setValueExpression("onMouseOver", onMouseOver);
        }
        if (sourceData != null) {
            component.setValueExpression("sourceData", sourceData);
        }
        if (tableDataFilter != null) {
            component.setValueExpression("tableDataFilter", tableDataFilter);
        }
        if (aboveColumnHeader != null) {
            component.setValueExpression("aboveColumnHeader", aboveColumnHeader);
        }
        if (toolTip != null) {
            component.setValueExpression("toolTip", toolTip);
        }
        if (onKeyUp != null) {
            component.setValueExpression("onKeyUp", onKeyUp);
        }
        if (align != null) {
            component.setValueExpression("align", align);
        }
        if (rendered != null) {
            component.setValueExpression("rendered", rendered);
        }
        if (onDblClick != null) {
            component.setValueExpression("onDblClick", onDblClick);
        }
        if (onMouseMove != null) {
            component.setValueExpression("onMouseMove", onMouseMove);
        }
        if (rows != null) {
            component.setValueExpression("rows", rows);
        }
        if (collapsed != null) {
            component.setValueExpression("collapsed", collapsed);
        }
        if (onMouseDown != null) {
            component.setValueExpression("onMouseDown", onMouseDown);
        }
        if (multipleTableColumnFooters != null) {
            component.setValueExpression("multipleTableColumnFooters", multipleTableColumnFooters);
        }
        if (extraHeaderHtml != null) {
            component.setValueExpression("extraHeaderHtml", extraHeaderHtml);
        }
        if (valign != null) {
            component.setValueExpression("valign", valign);
        }
        if (sourceVar != null) {
            component.setValueExpression("sourceVar", sourceVar);
        }
        if (first != null) {
            component.setValueExpression("first", first);
        }
        if (headerText != null) {
            component.setValueExpression("headerText", headerText);
        }
        if (emptyDataMsg != null) {
            component.setValueExpression("emptyDataMsg", emptyDataMsg);
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
     * Set attribute corresponding to the "selectMultipleToggleButton" property
     */
    private ValueExpression selectMultipleToggleButton = null;
    public void setSelectMultipleToggleButton (ValueExpression selectMultipleToggleButton) {
        this.selectMultipleToggleButton = selectMultipleToggleButton;
    }
       /**
     * Set attribute corresponding to the "tableDataSorter" property
     */
    private ValueExpression tableDataSorter = null;
    public void setTableDataSorter (ValueExpression tableDataSorter) {
        this.tableDataSorter = tableDataSorter;
    }
       /**
     * Set attribute corresponding to the "styleClasses" property
     */
    private ValueExpression styleClasses = null;
    public void setStyleClasses (ValueExpression styleClasses) {
        this.styleClasses = styleClasses;
    }
     /**
     * Set attribute corresponding to the "selected" property
     */
    private ValueExpression selected = null;
    public void setSelected (ValueExpression selected) {
        this.selected = selected;
    }
     /**
     * Set attribute corresponding to the "groupToggleButton" property
     */
    private ValueExpression groupToggleButton = null;
    public void setGroupToggleButton (ValueExpression groupToggleButton) {
        this.groupToggleButton = groupToggleButton;
    }
     /**
     * Set attribute corresponding to the "onMouseUp" property
     */
    private ValueExpression onMouseUp = null;
    public void setOnMouseUp (ValueExpression onMouseUp) {
        this.onMouseUp = onMouseUp;
    }
     /**
     * Set attribute corresponding to the "multipleColumnFooters" property
     */
    private ValueExpression multipleColumnFooters = null;
    public void setMultipleColumnFooters (ValueExpression multipleColumnFooters) {
        this.multipleColumnFooters = multipleColumnFooters;
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
     * Set attribute corresponding to the "aboveColumnFooter" property
     */
    private ValueExpression aboveColumnFooter = null;
    public void setAboveColumnFooter (ValueExpression aboveColumnFooter) {
        this.aboveColumnFooter = aboveColumnFooter;
    }
     /**
     * Set attribute corresponding to the "onMouseOver" property
     */
    private ValueExpression onMouseOver = null;
    public void setOnMouseOver (ValueExpression onMouseOver) {
        this.onMouseOver = onMouseOver;
    }
     /**
     * Set attribute corresponding to the "sourceData" property
     */
    private ValueExpression sourceData = null;
    public void setSourceData (ValueExpression sourceData) {
        this.sourceData = sourceData;
    }
     /**
     * Set attribute corresponding to the "tableDataFilter" property
     */
    private ValueExpression tableDataFilter = null;
    public void setTableDataFilter (ValueExpression tableDataFilter) {
        this.tableDataFilter = tableDataFilter;
    }
     /**
     * Set attribute corresponding to the "aboveColumnHeader" property
     */
    private ValueExpression aboveColumnHeader = null;
    public void setAboveColumnHeader (ValueExpression aboveColumnHeader) {
        this.aboveColumnHeader = aboveColumnHeader;
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
     * Set attribute corresponding to the "align" property
     */
    private ValueExpression align = null;
    public void setAlign (ValueExpression align) {
        this.align = align;
    }
     /**
     * Set attribute corresponding to the "rendered" property
     */
    private ValueExpression rendered = null;
    public void setRendered (ValueExpression rendered) {
        this.rendered = rendered;
    }
     /**
     * Set attribute corresponding to the "onDblClick" property
     */
    private ValueExpression onDblClick = null;
    public void setOnDblClick (ValueExpression onDblClick) {
        this.onDblClick = onDblClick;
    }
     /**
     * Set attribute corresponding to the "onMouseMove" property
     */
    private ValueExpression onMouseMove = null;
    public void setOnMouseMove (ValueExpression onMouseMove) {
        this.onMouseMove = onMouseMove;
    }
     /**
     * Set attribute corresponding to the "rows" property
     */
    private ValueExpression rows = null;
    public void setRows (ValueExpression rows) {
        this.rows = rows;
    }
     /**
     * Set attribute corresponding to the "collapsed" property
     */
    private ValueExpression collapsed = null;
    public void setCollapsed (ValueExpression collapsed) {
        this.collapsed = collapsed;
    }
     /**
     * Set attribute corresponding to the "onMouseDown" property
     */
    private ValueExpression onMouseDown = null;
    public void setOnMouseDown (ValueExpression onMouseDown) {
        this.onMouseDown = onMouseDown;
    }
     /**
     * Set attribute corresponding to the "multipleTableColumnFooters" property
     */
    private ValueExpression multipleTableColumnFooters = null;
    public void setMultipleTableColumnFooters (ValueExpression multipleTableColumnFooters) {
        this.multipleTableColumnFooters = multipleTableColumnFooters;
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
     * Set attribute corresponding to the "sourceVar" property
     */
    private ValueExpression sourceVar = null;
    public void setSourceVar (ValueExpression sourceVar) {
        this.sourceVar = sourceVar;
    }
     /**
     * Set attribute corresponding to the "first" property
     */
    private ValueExpression first = null;
    public void setFirst (ValueExpression first) {
        this.first = first;
    }
     /**
     * Set attribute corresponding to the "headerText" property
     */
    private ValueExpression headerText = null;
    public void setHeaderText (ValueExpression headerText) {
        this.headerText = headerText;
    }
     /**
     * Set attribute corresponding to the "emptyDataMsg" property
     */
    private ValueExpression emptyDataMsg = null;
    public void setEmptyDataMsg (ValueExpression emptyDataMsg) {
        this.emptyDataMsg = emptyDataMsg;
    }
     /**
     * Set attribute corresponding to the "onMouseOut" property
     */
    private ValueExpression onMouseOut = null;
    public void setOnMouseOut (ValueExpression onMouseOut) {
        this.onMouseOut = onMouseOut;
    }

}
