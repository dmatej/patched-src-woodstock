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
 * ToggleActionListener.java
 *
 * Created on August 23, 2006, 3:56 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package com.sun.webui.jsf.event;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import com.sun.webui.jsf.component.TreeNode;
import com.sun.webui.jsf.component.Tree;
import java.io.Serializable;

/**
 *
 * @author deep, John Yeary
 */
public class ToggleActionListener implements ActionListener, Serializable {

    private static final long serialVersionUID = -6635913171312578091L;

    public void processAction(ActionEvent event) {

        UIComponent comp = event.getComponent();
        /*LogUtil.info("CLICK ACTION FROM: " +
        comp.getClass().getName() + " with id " + comp.getId());
         */
        boolean flag = false;
        if (!comp.getId().endsWith("turner")) {
            flag = true;
        }
        while (comp != null && !(comp instanceof TreeNode)) {
            comp = comp.getParent();
        }

        if (comp != null) {
            FacesContext context = FacesContext.getCurrentInstance();
            TreeNode node = (TreeNode) comp;
            Tree root = TreeNode.getAbsoluteRoot(comp);
            if (flag) {
                root.setSelected(node.getId());
            }
            // Queue the TreeNodeToggleEvent. This will
            // enable control to flow thru tree nodes's
            // broadcast method where it can be checked
            // if the tree node has an actionListenerExpression
            // associated with it and if so invoke it.
            // This also gives the correct impression of the
            // actionEvent being fired from the treeNode as
            // opposed to the hyperlink representing the
            // toggle icon.
            node.queueEvent(new TreeNodeToggleEvent(node));
        }

    }
}
