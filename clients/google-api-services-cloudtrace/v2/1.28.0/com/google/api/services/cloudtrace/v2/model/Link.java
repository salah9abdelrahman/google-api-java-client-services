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

package com.google.api.services.cloudtrace.v2.model;

/**
 * A pointer from the current span to another span in the same trace or in a different trace. For
 * example, this can be used in batching operations, where a single batch handler processes multiple
 * requests from different traces or when the handler receives a request from a different project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Trace API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Link extends com.google.api.client.json.GenericJson {

  /**
   * A set of attributes on the link. You have have up to  32 attributes per link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Attributes attributes;

  /**
   * The [SPAN_ID] for a span within a trace.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spanId;

  /**
   * The [TRACE_ID] for a trace within a project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String traceId;

  /**
   * The relationship of the current span relative to the linked span.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * A set of attributes on the link. You have have up to  32 attributes per link.
   * @return value or {@code null} for none
   */
  public Attributes getAttributes() {
    return attributes;
  }

  /**
   * A set of attributes on the link. You have have up to  32 attributes per link.
   * @param attributes attributes or {@code null} for none
   */
  public Link setAttributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * The [SPAN_ID] for a span within a trace.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpanId() {
    return spanId;
  }

  /**
   * The [SPAN_ID] for a span within a trace.
   * @param spanId spanId or {@code null} for none
   */
  public Link setSpanId(java.lang.String spanId) {
    this.spanId = spanId;
    return this;
  }

  /**
   * The [TRACE_ID] for a trace within a project.
   * @return value or {@code null} for none
   */
  public java.lang.String getTraceId() {
    return traceId;
  }

  /**
   * The [TRACE_ID] for a trace within a project.
   * @param traceId traceId or {@code null} for none
   */
  public Link setTraceId(java.lang.String traceId) {
    this.traceId = traceId;
    return this;
  }

  /**
   * The relationship of the current span relative to the linked span.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The relationship of the current span relative to the linked span.
   * @param type type or {@code null} for none
   */
  public Link setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Link set(String fieldName, Object value) {
    return (Link) super.set(fieldName, value);
  }

  @Override
  public Link clone() {
    return (Link) super.clone();
  }

}