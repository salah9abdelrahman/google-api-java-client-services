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

package com.google.api.services.bigquery.model;

/**
 * Evaluation metrics of a model. These are either computed on all training data or just the eval
 * data based on whether eval data was used during training. These are not present for imported
 * models.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EvaluationMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Populated for binary classification/classifier models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BinaryClassificationMetrics binaryClassificationMetrics;

  /**
   * [Beta] Populated for clustering models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusteringMetrics clusteringMetrics;

  /**
   * Populated for multi-class classification/classifier models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MultiClassClassificationMetrics multiClassClassificationMetrics;

  /**
   * Populated for regression models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RegressionMetrics regressionMetrics;

  /**
   * Populated for binary classification/classifier models.
   * @return value or {@code null} for none
   */
  public BinaryClassificationMetrics getBinaryClassificationMetrics() {
    return binaryClassificationMetrics;
  }

  /**
   * Populated for binary classification/classifier models.
   * @param binaryClassificationMetrics binaryClassificationMetrics or {@code null} for none
   */
  public EvaluationMetrics setBinaryClassificationMetrics(BinaryClassificationMetrics binaryClassificationMetrics) {
    this.binaryClassificationMetrics = binaryClassificationMetrics;
    return this;
  }

  /**
   * [Beta] Populated for clustering models.
   * @return value or {@code null} for none
   */
  public ClusteringMetrics getClusteringMetrics() {
    return clusteringMetrics;
  }

  /**
   * [Beta] Populated for clustering models.
   * @param clusteringMetrics clusteringMetrics or {@code null} for none
   */
  public EvaluationMetrics setClusteringMetrics(ClusteringMetrics clusteringMetrics) {
    this.clusteringMetrics = clusteringMetrics;
    return this;
  }

  /**
   * Populated for multi-class classification/classifier models.
   * @return value or {@code null} for none
   */
  public MultiClassClassificationMetrics getMultiClassClassificationMetrics() {
    return multiClassClassificationMetrics;
  }

  /**
   * Populated for multi-class classification/classifier models.
   * @param multiClassClassificationMetrics multiClassClassificationMetrics or {@code null} for none
   */
  public EvaluationMetrics setMultiClassClassificationMetrics(MultiClassClassificationMetrics multiClassClassificationMetrics) {
    this.multiClassClassificationMetrics = multiClassClassificationMetrics;
    return this;
  }

  /**
   * Populated for regression models.
   * @return value or {@code null} for none
   */
  public RegressionMetrics getRegressionMetrics() {
    return regressionMetrics;
  }

  /**
   * Populated for regression models.
   * @param regressionMetrics regressionMetrics or {@code null} for none
   */
  public EvaluationMetrics setRegressionMetrics(RegressionMetrics regressionMetrics) {
    this.regressionMetrics = regressionMetrics;
    return this;
  }

  @Override
  public EvaluationMetrics set(String fieldName, Object value) {
    return (EvaluationMetrics) super.set(fieldName, value);
  }

  @Override
  public EvaluationMetrics clone() {
    return (EvaluationMetrics) super.clone();
  }

}
