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

package com.google.api.services.dataproc.v1beta2.model;

/**
 * The workflow graph.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkflowGraph extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The workflow nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WorkflowNode> nodes;

  static {
    // hack to force ProGuard to consider WorkflowNode used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(WorkflowNode.class);
  }

  /**
   * Output only. The workflow nodes.
   * @return value or {@code null} for none
   */
  public java.util.List<WorkflowNode> getNodes() {
    return nodes;
  }

  /**
   * Output only. The workflow nodes.
   * @param nodes nodes or {@code null} for none
   */
  public WorkflowGraph setNodes(java.util.List<WorkflowNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  @Override
  public WorkflowGraph set(String fieldName, Object value) {
    return (WorkflowGraph) super.set(fieldName, value);
  }

  @Override
  public WorkflowGraph clone() {
    return (WorkflowGraph) super.clone();
  }

}
