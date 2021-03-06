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
 * A collection of stack frames, which can be truncated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Trace API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StackFrames extends com.google.api.client.json.GenericJson {

  /**
   * The number of stack frames that were dropped because there were too many stack frames. If this
   * value is 0, then no stack frames were dropped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer droppedFramesCount;

  /**
   * Stack frames in this call stack.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StackFrame> frame;

  static {
    // hack to force ProGuard to consider StackFrame used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(StackFrame.class);
  }

  /**
   * The number of stack frames that were dropped because there were too many stack frames. If this
   * value is 0, then no stack frames were dropped.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDroppedFramesCount() {
    return droppedFramesCount;
  }

  /**
   * The number of stack frames that were dropped because there were too many stack frames. If this
   * value is 0, then no stack frames were dropped.
   * @param droppedFramesCount droppedFramesCount or {@code null} for none
   */
  public StackFrames setDroppedFramesCount(java.lang.Integer droppedFramesCount) {
    this.droppedFramesCount = droppedFramesCount;
    return this;
  }

  /**
   * Stack frames in this call stack.
   * @return value or {@code null} for none
   */
  public java.util.List<StackFrame> getFrame() {
    return frame;
  }

  /**
   * Stack frames in this call stack.
   * @param frame frame or {@code null} for none
   */
  public StackFrames setFrame(java.util.List<StackFrame> frame) {
    this.frame = frame;
    return this;
  }

  @Override
  public StackFrames set(String fieldName, Object value) {
    return (StackFrames) super.set(fieldName, value);
  }

  @Override
  public StackFrames clone() {
    return (StackFrames) super.clone();
  }

}
