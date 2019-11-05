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
/*
 * IntervalListener.java
 *
 * Created on September 30, 2005, 1:53 PM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */
package com.sun.webui.jsf.event;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import com.sun.webui.jsf.component.Scheduler;
import java.io.Serializable;

/**
 *
 * @author avk, John Yeary
 */
public class SchedulerPreviewListener implements ActionListener, Serializable {

    private static final long serialVersionUID = -8944673873698745402L;

    public void processAction(ActionEvent event) {

        UIComponent comp = event.getComponent();
        while (comp != null && !(comp instanceof Scheduler)) {
            comp = comp.getParent();
        }
        if (comp != null) {

            FacesContext context = FacesContext.getCurrentInstance();
            ((Scheduler) comp).processValidators(FacesContext.getCurrentInstance());
            if (((Scheduler) comp).isValid()) {
                ((Scheduler) comp).getDatePicker().setValue(((Scheduler) comp).getValue());
                ((Scheduler) comp).getDatePicker().displayValue();
            }
            context.renderResponse();
        }
    }
}
