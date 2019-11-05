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
package com.sun.webui.jsf.renderkit.ajax;

import com.sun.faces.annotation.Renderer;
import com.sun.webui.jsf.component.ProgressBar;
import java.io.IOException;
import java.util.Map;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class responds to Ajax requests made to ProgressBar components.
 */
@Renderer(@Renderer.Renders(rendererType = "com.sun.webui.jsf.ajax.ProgressBar",
componentFamily = "com.sun.webui.jsf.ProgressBar"))
public class ProgressBarRenderer extends javax.faces.render.Renderer {

    /**
     * Decode the component component
     *
     * @param context The FacesContext associated with this request
     * @param component The ProgressBar component to decode
     */
    @Override
    public void decode(FacesContext context, UIComponent component) {
        if (context == null || component == null) {
            throw new NullPointerException();
        }

        String id = component.getClientId(context);
        Map params = context.getExternalContext().getRequestParameterMap();

        String buttonId = id + "_" + "controlType"; //NOI18N

        Object valueObject = params.get(buttonId);
        String value = null;
        if (valueObject != null) {
            value = ((String) valueObject).trim();
            ProgressBar progressBar = (ProgressBar) component;

            if (ProgressBar.TASK_STOPPED.equals(value)) {
                progressBar.setTaskState(ProgressBar.TASK_STOPPED);
            } else if (ProgressBar.TASK_PAUSED.equals(value)) {
                progressBar.setTaskState(ProgressBar.TASK_PAUSED);
            } else if (ProgressBar.TASK_RESUMED.equals(value)) {
                progressBar.setTaskState(ProgressBar.TASK_RESUMED);
            } else if (ProgressBar.TASK_CANCELED.equals(value)) {
                progressBar.setTaskState(ProgressBar.TASK_CANCELED);
            }
        }
    }

    /**
     * Render the beginning of the specified UIComponent to the output stream or
     * writer associated with the response we are creating.
     *
     * @param context FacesContext for the current request.
     * @param component UIComponent to be rendered.
     *
     * @exception IOException if an input/output error occurs.
     * @exception NullPointerException if context or component is null.
     */
    @Override
    public void encodeBegin(FacesContext context, UIComponent component)
            throws IOException {
        // Do nothing...
    }

    /**
     * Render the children of the specified UIComponent to the output stream or
     * writer associated with the response we are creating.
     *
     * @param context FacesContext for the current request.
     * @param component UIComponent to be rendered.
     *
     * @exception IOException if an input/output error occurs.
     * @exception NullPointerException if context or component is null.
     */
    @Override
    public void encodeChildren(FacesContext context, UIComponent component)
            throws IOException {
        // Do nothing...
    }

    /**
     * Render the ending of the specified UIComponent to the output stream or
     * writer associated with the response we are creating.
     *
     * @param context FacesContext for the current request.
     * @param component UIComponent to be rendered.
     *
     * @exception IOException if an input/output error occurs.
     * @exception NullPointerException if context or component is null.
     */
    @Override
    public void encodeEnd(FacesContext context, UIComponent component)
            throws IOException {
        if (context == null || component == null) {
            throw new NullPointerException();
        }
        if (!component.isRendered()) {
            return;
        }

        ProgressBar progressBar = (ProgressBar) component;
        int progress = progressBar.getProgress();

        String status = progressBar.getStatus();
        String topText = progressBar.getDescription();
        String logMessage = progressBar.getLogMessage();
        String failedStateText = progressBar.getFailedStateText();

        // Top text facet.
        UIComponent topTextFacet = component.getFacet(ProgressBar.TOPTEXT_FACET);
        if (topTextFacet != null) {
            topText = null;
        }
        UIComponent bottomTextFacet = component.getFacet(ProgressBar.BOTTOMTEXT_FACET);
        if (bottomTextFacet != null) {
            status = null;
        }

        String taskState = progressBar.getTaskState();

        try {
            JSONObject json = new JSONObject();
            json.put("taskState", taskState);
            json.put("progress", String.valueOf(progress));
            json.put("status", status);
            json.put("topText", topText);
            json.put("logMessage", logMessage);
            json.put("failedStateText", failedStateText);
            json.write(context.getResponseWriter());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}

