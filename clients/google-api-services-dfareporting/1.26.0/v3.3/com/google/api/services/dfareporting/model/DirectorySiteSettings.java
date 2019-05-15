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

package com.google.api.services.dfareporting.model;

/**
 * Directory Site Settings
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DirectorySiteSettings extends com.google.api.client.json.GenericJson {

  /**
   * Whether this directory site has disabled active view creatives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean activeViewOptOut;

  /**
   * Directory site Ad Manager settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DfpSettings dfpSettings;

  /**
   * Whether this site accepts in-stream video ads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean instreamVideoPlacementAccepted;

  /**
   * Whether this site accepts interstitial ads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean interstitialPlacementAccepted;

  /**
   * Whether this directory site has disabled active view creatives.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getActiveViewOptOut() {
    return activeViewOptOut;
  }

  /**
   * Whether this directory site has disabled active view creatives.
   * @param activeViewOptOut activeViewOptOut or {@code null} for none
   */
  public DirectorySiteSettings setActiveViewOptOut(java.lang.Boolean activeViewOptOut) {
    this.activeViewOptOut = activeViewOptOut;
    return this;
  }

  /**
   * Directory site Ad Manager settings.
   * @return value or {@code null} for none
   */
  public DfpSettings getDfpSettings() {
    return dfpSettings;
  }

  /**
   * Directory site Ad Manager settings.
   * @param dfpSettings dfpSettings or {@code null} for none
   */
  public DirectorySiteSettings setDfpSettings(DfpSettings dfpSettings) {
    this.dfpSettings = dfpSettings;
    return this;
  }

  /**
   * Whether this site accepts in-stream video ads.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInstreamVideoPlacementAccepted() {
    return instreamVideoPlacementAccepted;
  }

  /**
   * Whether this site accepts in-stream video ads.
   * @param instreamVideoPlacementAccepted instreamVideoPlacementAccepted or {@code null} for none
   */
  public DirectorySiteSettings setInstreamVideoPlacementAccepted(java.lang.Boolean instreamVideoPlacementAccepted) {
    this.instreamVideoPlacementAccepted = instreamVideoPlacementAccepted;
    return this;
  }

  /**
   * Whether this site accepts interstitial ads.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInterstitialPlacementAccepted() {
    return interstitialPlacementAccepted;
  }

  /**
   * Whether this site accepts interstitial ads.
   * @param interstitialPlacementAccepted interstitialPlacementAccepted or {@code null} for none
   */
  public DirectorySiteSettings setInterstitialPlacementAccepted(java.lang.Boolean interstitialPlacementAccepted) {
    this.interstitialPlacementAccepted = interstitialPlacementAccepted;
    return this;
  }

  @Override
  public DirectorySiteSettings set(String fieldName, Object value) {
    return (DirectorySiteSettings) super.set(fieldName, value);
  }

  @Override
  public DirectorySiteSettings clone() {
    return (DirectorySiteSettings) super.clone();
  }

}