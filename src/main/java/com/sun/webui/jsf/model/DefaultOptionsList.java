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

import com.sun.webui.jsf.util.MessageUtil;

/** A default list of options, pre-populated with three default items.
 *
 * @author gjmurphy, John Yeary
 */
public class DefaultOptionsList extends OptionsList {

    private static final long serialVersionUID = -1377760857272606790L;

    public DefaultOptionsList() {
        String bundle = DefaultOptionsList.class.getPackage().getName() + ".Bundle";
        Option[] options = new Option[]{
            new Option("item1", MessageUtil.getMessage(bundle, "item1")), //NOI18N
            new Option("item2", MessageUtil.getMessage(bundle, "item2")), //NOI18N
            new Option("item3", MessageUtil.getMessage(bundle, "item3")) //NOI18N
        };
        this.setOptions(options);
    }
}
