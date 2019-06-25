/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.testing.model;

/**
 * The currently provided software environment on the devices under test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProvidedSoftwareCatalog extends com.google.api.client.json.GenericJson {

  /**
   * A string representing the current version of Android Test Orchestrator that is provided by
   * TestExecutionService. Example: "1.0.2 beta".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orchestratorVersion;

  /**
   * A string representing the current version of Android Test Orchestrator that is provided by
   * TestExecutionService. Example: "1.0.2 beta".
   * @return value or {@code null} for none
   */
  public java.lang.String getOrchestratorVersion() {
    return orchestratorVersion;
  }

  /**
   * A string representing the current version of Android Test Orchestrator that is provided by
   * TestExecutionService. Example: "1.0.2 beta".
   * @param orchestratorVersion orchestratorVersion or {@code null} for none
   */
  public ProvidedSoftwareCatalog setOrchestratorVersion(java.lang.String orchestratorVersion) {
    this.orchestratorVersion = orchestratorVersion;
    return this;
  }

  @Override
  public ProvidedSoftwareCatalog set(String fieldName, Object value) {
    return (ProvidedSoftwareCatalog) super.set(fieldName, value);
  }

  @Override
  public ProvidedSoftwareCatalog clone() {
    return (ProvidedSoftwareCatalog) super.clone();
  }

}
