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

import org.opensaml.common.impl.AbstractSAMLObjectBuilder;
import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml2.core.OneTimeUse;

/**
 * Builder for {@link org.opensaml.saml2.core.impl.OneTimeUseImpl} objects.
 */
public class OneTimeUseBuilder extends AbstractSAMLObjectBuilder<OneTimeUse> {

    /** Constructor */
    public OneTimeUseBuilder() {

    }

    /** {@inheritDoc} */
    public OneTimeUse buildObject() {
        return buildObject(SAMLConstants.SAML20_NS, OneTimeUse.DEFAULT_ELEMENT_LOCAL_NAME, SAMLConstants.SAML20_PREFIX);
    }

    /** {@inheritDoc} */
    public OneTimeUse buildObject(String namespaceURI, String localName, String namespacePrefix) {
        return new OneTimeUseImpl(namespaceURI, localName, namespacePrefix);
    }
}