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

package org.opensaml.saml1.core;

import java.util.List;

import org.opensaml.xml.IllegalAddException;

/**
 * This interface describes how ab object representing a SAML1 <code> AudienceRestrictionCondition </code> element will
 * behave.
 */
public interface AudienceRestrictionCondition extends Condition {

    /** Element name, no namespace. */
    public final static String LOCAL_NAME = "AudienceRestrictionCondition";

    /** Return all the audience elements */
    public List<Audience> getAudiences();

    /**
     * Add new Audience element to the elements
     * 
     * @throws IllegalAddException
     */
    public void addAudience(Audience audience) throws IllegalAddException;

    /** Remove a single Audience element */
    public void removeAudience(Audience audience);

    /** Remove several Audience elements */
    public void removeAudiences(List<Audience> audiences);

    /** Remove all audience elements from this object */
    public void removeAllAudiences();
}