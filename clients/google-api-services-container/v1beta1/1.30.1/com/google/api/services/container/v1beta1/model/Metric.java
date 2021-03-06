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

package com.google.api.services.container.v1beta1.model;

/**
 * Progress metric is (string, int|float|string) pair.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Metric extends com.google.api.client.json.GenericJson {

  /**
   * For metrics with floating point value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double doubleValue;

  /**
   * For metrics with integer value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long intValue;

  /**
   * Required. Metric name, e.g., "nodes total", "percent done".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * For metrics with custom values (ratios, visual progress, etc.).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * For metrics with floating point value.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDoubleValue() {
    return doubleValue;
  }

  /**
   * For metrics with floating point value.
   * @param doubleValue doubleValue or {@code null} for none
   */
  public Metric setDoubleValue(java.lang.Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * For metrics with integer value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntValue() {
    return intValue;
  }

  /**
   * For metrics with integer value.
   * @param intValue intValue or {@code null} for none
   */
  public Metric setIntValue(java.lang.Long intValue) {
    this.intValue = intValue;
    return this;
  }

  /**
   * Required. Metric name, e.g., "nodes total", "percent done".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Metric name, e.g., "nodes total", "percent done".
   * @param name name or {@code null} for none
   */
  public Metric setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * For metrics with custom values (ratios, visual progress, etc.).
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * For metrics with custom values (ratios, visual progress, etc.).
   * @param stringValue stringValue or {@code null} for none
   */
  public Metric setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  @Override
  public Metric set(String fieldName, Object value) {
    return (Metric) super.set(fieldName, value);
  }

  @Override
  public Metric clone() {
    return (Metric) super.clone();
  }

}
