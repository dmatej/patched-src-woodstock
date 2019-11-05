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

/**
 * A default list of options, for components which are always in multiple
 * select mode.
 *
 * @author gjmurphy, John Yeary
 */
public class MultipleSelectOptionsList extends DefaultOptionsList {

    private static final long serialVersionUID = -6465497882261933314L;

    /** Creates a new instance of MultipleSelectOptionsList */
    public MultipleSelectOptionsList() {
        super();
        super.setMultiple(true);
    }

    //FIXME Is this is missing an implementation?
    @Override
    public void setMultiple(boolean isMultiple) {
    }
}
