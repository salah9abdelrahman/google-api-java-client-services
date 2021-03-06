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

package com.google.api.services.appengine.model;

/**
 * Target scaling by request utilization. Only applicable for VM runtimes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RequestUtilization extends com.google.api.client.json.GenericJson {

  /**
   * Target number of concurrent requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetConcurrentRequests;

  /**
   * Target requests per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetRequestCountPerSec;

  /**
   * Target number of concurrent requests.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetConcurrentRequests() {
    return targetConcurrentRequests;
  }

  /**
   * Target number of concurrent requests.
   * @param targetConcurrentRequests targetConcurrentRequests or {@code null} for none
   */
  public RequestUtilization setTargetConcurrentRequests(java.lang.Integer targetConcurrentRequests) {
    this.targetConcurrentRequests = targetConcurrentRequests;
    return this;
  }

  /**
   * Target requests per second.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetRequestCountPerSec() {
    return targetRequestCountPerSec;
  }

  /**
   * Target requests per second.
   * @param targetRequestCountPerSec targetRequestCountPerSec or {@code null} for none
   */
  public RequestUtilization setTargetRequestCountPerSec(java.lang.Integer targetRequestCountPerSec) {
    this.targetRequestCountPerSec = targetRequestCountPerSec;
    return this;
  }

  @Override
  public RequestUtilization set(String fieldName, Object value) {
    return (RequestUtilization) super.set(fieldName, value);
  }

  @Override
  public RequestUtilization clone() {
    return (RequestUtilization) super.clone();
  }

}
