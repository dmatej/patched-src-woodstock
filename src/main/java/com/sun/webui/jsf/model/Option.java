/*
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License).  You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the license at
 * https://woodstock.dev.java.net/public/CDDLv1.0.html.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at https://woodstock.dev.java.net/public/CDDLv1.0.html.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * you own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Copyright 2007 Sun Microsystems, Inc. All rights reserved.
 */
package com.sun.webui.jsf.model;

import javax.faces.model.SelectItem;

/**
 * <p>Model bean that represents a selectable choice in a selection
 * component such as <code>Menu</code>, <code>RadioButtonGroup</code>,
 * etc.
 * </p>
 */
public class Option extends SelectItem {

    private static final long serialVersionUID = -2164172320702956584L;
    private String image;
    // Zero is a valid width and height
    //
    private int imageWidth = -1;
    private int imageHeight = -1;
    private String imageAlt;
    private String tooltip;

    /**
     * Create an instance of Selection.
     */
    public Option() {
        super();
    }

    /**
     * Create an instance of Selection.
     */
    public Option(Object value) {
        super(value, null);
    }

    /**
     * Create an instance of Selection.
     */
    public Option(Object value, String label) {
        super(value, label);
    }

    /**
     * Create an instance of Selection.
     */
    public Option(Object value, String label, String description) {
        super(value, label, description);
    }

    /**
     * Create an instance of Selection.
     */
    public Option(Object value, String label, String description, boolean disabled) {
        super(value, label, description, disabled);
    }

    /**
     * Get the image resource path.
     */
    public String getImage() {
        return image;
    }

    /**
     * Set an image resource path
     * Used for an image in a radio button for example.
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Get the image width.
     */
    public int getImageWidth() {
        return imageWidth;
    }

    /**
     * Set an image resource path
     * Used for an image in a radio button for example.
     */
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * Get the image height.
     */
    public int getImageHeight() {
        return imageHeight;
    }

    /**
     * Set an image resource path
     * Used for an image in a radio button for example.
     */
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     * Get the alternate text for the image.
     */
    public String getImageAlt() {
        return imageAlt;
    }

    /**
     * Set the alternate text for the image.
     */
    public void setImageAlt(String imageAlt) {
        this.imageAlt = imageAlt;
    }

    /**
     * Get the tooltip for this instance.
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * Set the tooltip for this instance.
     */
    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }
}
