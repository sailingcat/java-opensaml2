/*
 * Copyright [2005] [University Corporation for Advanced Internet Development, Inc.]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * 
 */
package org.opensaml.saml2.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.opensaml.common.SAMLObject;
import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml2.core.Attribute;
import org.opensaml.saml2.core.AttributeQuery;
import org.opensaml.xml.util.XMLObjectChildrenList;

/**
 * Concrete implementation of {@link org.opensaml.saml2.core.AttributeQuery}
 */
public class AttributeQueryImpl extends SubjectQueryImpl implements AttributeQuery {
    
    /** Attribute child elements */
    private XMLObjectChildrenList<Attribute> attributes;

    /**
     * Constructor
     *
     */
    public AttributeQueryImpl() {
        super(SAMLConstants.SAML20P_NS, AttributeQuery.LOCAL_NAME);
        setElementNamespacePrefix(SAMLConstants.SAML20P_PREFIX);
        attributes = new XMLObjectChildrenList<Attribute>(this);
    }

    /**
     * @see org.opensaml.saml2.core.AttributeQuery#getAttributes()
     */
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * @see org.opensaml.saml2.core.impl.SubjectQueryImpl#getOrderedChildren()
     */
    public List<SAMLObject> getOrderedChildren() {
        ArrayList<SAMLObject> children = new ArrayList<SAMLObject>();
        
        if (super.getOrderedChildren() != null)
            children.addAll(super.getOrderedChildren());
        children.addAll(attributes);
        
        if (children.size() == 0)
            return null;
        
        return Collections.unmodifiableList(children);
        
    }
    
    

}