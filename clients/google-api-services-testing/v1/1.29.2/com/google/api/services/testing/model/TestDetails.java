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
 * Additional details about the progress of the running test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestDetails extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If the TestState is ERROR, then this string will contain human-readable details
   * about the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * Output only. Human-readable, detailed descriptions of the test's progress. For example:
   * "Provisioning a device", "Starting Test".
   *
   * During the course of execution new data may be appended to the end of progress_messages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> progressMessages;

  /**
   * Output only. If the TestState is ERROR, then this string will contain human-readable details
   * about the error.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Output only. If the TestState is ERROR, then this string will contain human-readable details
   * about the error.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public TestDetails setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Output only. Human-readable, detailed descriptions of the test's progress. For example:
   * "Provisioning a device", "Starting Test".
   *
   * During the course of execution new data may be appended to the end of progress_messages.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProgressMessages() {
    return progressMessages;
  }

  /**
   * Output only. Human-readable, detailed descriptions of the test's progress. For example:
   * "Provisioning a device", "Starting Test".
   *
   * During the course of execution new data may be appended to the end of progress_messages.
   * @param progressMessages progressMessages or {@code null} for none
   */
  public TestDetails setProgressMessages(java.util.List<java.lang.String> progressMessages) {
    this.progressMessages = progressMessages;
    return this;
  }

  @Override
  public TestDetails set(String fieldName, Object value) {
    return (TestDetails) super.set(fieldName, value);
  }

  @Override
  public TestDetails clone() {
    return (TestDetails) super.clone();
  }

}
