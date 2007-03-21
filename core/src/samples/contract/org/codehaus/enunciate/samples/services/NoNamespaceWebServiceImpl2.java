/*
 * Copyright 2006 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.samples.services;

import javax.jws.WebService;

/**
 * @author Ryan Heaton
 */
@WebService (
  endpointInterface = "org.codehaus.enunciate.samples.services.NoNamespaceWebService"
)
public class NoNamespaceWebServiceImpl2 implements NoNamespaceWebService {

  public boolean myImplicitlyPublicMethod() {
    return false;
  }

  public boolean myExplicitlyPublicMethod() {
    return false;
  }

  public boolean myExcludedPublicMethod() {
    return false;
  }
}