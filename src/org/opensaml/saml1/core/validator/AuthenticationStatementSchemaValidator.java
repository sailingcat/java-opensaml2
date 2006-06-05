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

package org.opensaml.saml1.core.validator;

import org.opensaml.saml1.core.AuthenticationStatement;
import org.opensaml.xml.util.DatatypeHelper;
import org.opensaml.xml.validation.ValidationException;

/**
 * Checks {@link org.opensaml.saml1.core.AuthenticationStatement} for Schema compliance.
 */
public class AuthenticationStatementSchemaValidator extends SubjectStatementSchemaValidator<AuthenticationStatement> {

    /*
     * @see org.opensaml.xml.validation.Validator#validate(org.opensaml.xml.XMLObject)
     */
    public void validate(AuthenticationStatement authenticationStatement) throws ValidationException {
        super.validate(authenticationStatement);
        // TODO separate out into distinct method

        if (DatatypeHelper.isEmpty(authenticationStatement.getAuthenticationMethod())) {
            throw new ValidationException("No authenticationStatement URI is null");
        }
        
        if (authenticationStatement.getAuthenticationInstant() == null) {
            throw new ValidationException("No authenticationInstant present");
        }
   }
}