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

import org.opensaml.saml2.metadata.KeyDescriptor;
import org.opensaml.xml.XMLObject;
import org.opensaml.xml.validation.ValidationException;
import org.opensaml.xml.validation.Validator;

/**
 * Checks {@link org.opensaml.saml2.metadata.KeyDescriptor} for Schema compliance.
 */
public class KeyDescriptorSchemaValidator implements Validator {

    /** Constructor */
    public KeyDescriptorSchemaValidator() {

    }

    /*
     * @see org.opensaml.xml.validation.Validator#validate(org.opensaml.xml.XMLObject)
     */
    public void validate(XMLObject xmlObject) throws ValidationException {
        KeyDescriptor keyDescriptor = (KeyDescriptor) xmlObject;
        validateKeyInfo(keyDescriptor);
    }

    /**
     * Checks that KeyInfo is present.
     * 
     * @param keyDescriptor
     * @throws ValidationException
     */
    protected void validateKeyInfo(KeyDescriptor keyDescriptor) throws ValidationException {
        if (keyDescriptor.getKeyInfo()==null) {
            throw new ValidationException("KeyInfo required");
        }
    }
}