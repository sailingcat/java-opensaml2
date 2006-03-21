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

package org.opensaml.saml2.metadata.validator;

import org.opensaml.saml2.metadata.EntityDescriptor;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.validation.ValidationException;
import org.opensaml.xml.validation.Validator;

/**
 * Checks {@link org.opensaml.saml2.metadata.EntityDescriptor} for Spec compliance.
 */
public class EntityDescriptorSpecValidator implements Validator {

    /** Constructor */
    public EntityDescriptorSpecValidator() {

    }

    /*
     * @see org.opensaml.xml.validation.Validator#validate(org.opensaml.xml.XMLObject)
     */
    public void validate(XMLObject xmlObject) throws ValidationException {
        EntityDescriptor entityDescriptor = (EntityDescriptor) xmlObject;
        validateRoot(entityDescriptor);
    }

    /**
     * Checks that at least either Valid Until or Cache Duration is present when Entity Descriptor is root element.
     * 
     * @param entityDescriptor
     * @throws ValidationException
     */
    protected void validateRoot(EntityDescriptor entityDescriptor) throws ValidationException {
        if (entityDescriptor.getParent() == null && entityDescriptor.getValidUntil() == null
                && entityDescriptor.getCacheDuration() == null) {
            throw new ValidationException("Must have either ValidUntil or CacheDuration when is root element.");
        }
    }
}