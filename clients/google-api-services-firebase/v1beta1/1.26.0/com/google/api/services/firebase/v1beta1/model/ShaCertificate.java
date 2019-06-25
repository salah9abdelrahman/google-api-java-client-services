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

package com.google.api.services.firebase.v1beta1.model;

/**
 * A SHA-1 or SHA-256 certificate associated with the AndroidApp.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShaCertificate extends com.google.api.client.json.GenericJson {

  /**
   * The SHA certificate type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certType;

  /**
   * The fully qualified resource name of the `sha-key`, in the format:
   * projects/projectId/androidApps/appId/sha/shaHash
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The certificate hash for the App.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shaHash;

  /**
   * The SHA certificate type.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertType() {
    return certType;
  }

  /**
   * The SHA certificate type.
   * @param certType certType or {@code null} for none
   */
  public ShaCertificate setCertType(java.lang.String certType) {
    this.certType = certType;
    return this;
  }

  /**
   * The fully qualified resource name of the `sha-key`, in the format:
   * projects/projectId/androidApps/appId/sha/shaHash
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The fully qualified resource name of the `sha-key`, in the format:
   * projects/projectId/androidApps/appId/sha/shaHash
   * @param name name or {@code null} for none
   */
  public ShaCertificate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The certificate hash for the App.
   * @return value or {@code null} for none
   */
  public java.lang.String getShaHash() {
    return shaHash;
  }

  /**
   * The certificate hash for the App.
   * @param shaHash shaHash or {@code null} for none
   */
  public ShaCertificate setShaHash(java.lang.String shaHash) {
    this.shaHash = shaHash;
    return this;
  }

  @Override
  public ShaCertificate set(String fieldName, Object value) {
    return (ShaCertificate) super.set(fieldName, value);
  }

  @Override
  public ShaCertificate clone() {
    return (ShaCertificate) super.clone();
  }

}