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
package org.opensaml.saml1.core;

import org.opensaml.common.SAMLObject;

/**
 * Interface to define how a <code> NameIdentifier <\code> element behaves
 */
public interface NameIdentifier extends SAMLObject {
 
    /** Element name, no namespace. */
    public final static String LOCAL_NAME = "NameIdentifier";
    
    /** Name for the attribute which defines Name Qualifier */
    public final static String NAMEQUALIFIER_ATTRIB_NAME = "NameQualifier";
    
    /** Name for the attribute which defines Name Qualifier */
    public final static String FORMAT_ATTRIB_NAME = "Format";
    
    public String getNameQualifier();
    
    public void setNameQualifier(String nameQualifier);
    
    public String getFormat();
    
    public void setFormat(String format);
    
    public String getNameIdentifier();
    
    public void setNameIdentifier(String nameIdentifier);
}
