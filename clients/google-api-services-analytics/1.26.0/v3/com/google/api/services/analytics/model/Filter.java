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

package com.google.api.services.analytics.model;

/**
 * JSON template for an Analytics account filter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Filter extends com.google.api.client.json.GenericJson {

  /**
   * Account ID to which this filter belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * Details for the filter of the type ADVANCED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvancedDetails advancedDetails;

  /**
   * Time this filter was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime created;

  /**
   * Details for the filter of the type EXCLUDE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterExpression excludeDetails;

  /**
   * Filter ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Details for the filter of the type INCLUDE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FilterExpression includeDetails;

  /**
   * Resource type for Analytics filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Details for the filter of the type LOWER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LowercaseDetails lowercaseDetails;

  /**
   * Name of this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Parent link for this filter. Points to the account to which this filter belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParentLink parentLink;

  /**
   * Details for the filter of the type SEARCH_AND_REPLACE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SearchAndReplaceDetails searchAndReplaceDetails;

  /**
   * Link for this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE,
   * SEARCH_AND_REPLACE and ADVANCED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Time this filter was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * Details for the filter of the type UPPER.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UppercaseDetails uppercaseDetails;

  /**
   * Account ID to which this filter belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * Account ID to which this filter belongs.
   * @param accountId accountId or {@code null} for none
   */
  public Filter setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Details for the filter of the type ADVANCED.
   * @return value or {@code null} for none
   */
  public AdvancedDetails getAdvancedDetails() {
    return advancedDetails;
  }

  /**
   * Details for the filter of the type ADVANCED.
   * @param advancedDetails advancedDetails or {@code null} for none
   */
  public Filter setAdvancedDetails(AdvancedDetails advancedDetails) {
    this.advancedDetails = advancedDetails;
    return this;
  }

  /**
   * Time this filter was created.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreated() {
    return created;
  }

  /**
   * Time this filter was created.
   * @param created created or {@code null} for none
   */
  public Filter setCreated(com.google.api.client.util.DateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Details for the filter of the type EXCLUDE.
   * @return value or {@code null} for none
   */
  public FilterExpression getExcludeDetails() {
    return excludeDetails;
  }

  /**
   * Details for the filter of the type EXCLUDE.
   * @param excludeDetails excludeDetails or {@code null} for none
   */
  public Filter setExcludeDetails(FilterExpression excludeDetails) {
    this.excludeDetails = excludeDetails;
    return this;
  }

  /**
   * Filter ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Filter ID.
   * @param id id or {@code null} for none
   */
  public Filter setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Details for the filter of the type INCLUDE.
   * @return value or {@code null} for none
   */
  public FilterExpression getIncludeDetails() {
    return includeDetails;
  }

  /**
   * Details for the filter of the type INCLUDE.
   * @param includeDetails includeDetails or {@code null} for none
   */
  public Filter setIncludeDetails(FilterExpression includeDetails) {
    this.includeDetails = includeDetails;
    return this;
  }

  /**
   * Resource type for Analytics filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for Analytics filter.
   * @param kind kind or {@code null} for none
   */
  public Filter setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Details for the filter of the type LOWER.
   * @return value or {@code null} for none
   */
  public LowercaseDetails getLowercaseDetails() {
    return lowercaseDetails;
  }

  /**
   * Details for the filter of the type LOWER.
   * @param lowercaseDetails lowercaseDetails or {@code null} for none
   */
  public Filter setLowercaseDetails(LowercaseDetails lowercaseDetails) {
    this.lowercaseDetails = lowercaseDetails;
    return this;
  }

  /**
   * Name of this filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this filter.
   * @param name name or {@code null} for none
   */
  public Filter setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Parent link for this filter. Points to the account to which this filter belongs.
   * @return value or {@code null} for none
   */
  public ParentLink getParentLink() {
    return parentLink;
  }

  /**
   * Parent link for this filter. Points to the account to which this filter belongs.
   * @param parentLink parentLink or {@code null} for none
   */
  public Filter setParentLink(ParentLink parentLink) {
    this.parentLink = parentLink;
    return this;
  }

  /**
   * Details for the filter of the type SEARCH_AND_REPLACE.
   * @return value or {@code null} for none
   */
  public SearchAndReplaceDetails getSearchAndReplaceDetails() {
    return searchAndReplaceDetails;
  }

  /**
   * Details for the filter of the type SEARCH_AND_REPLACE.
   * @param searchAndReplaceDetails searchAndReplaceDetails or {@code null} for none
   */
  public Filter setSearchAndReplaceDetails(SearchAndReplaceDetails searchAndReplaceDetails) {
    this.searchAndReplaceDetails = searchAndReplaceDetails;
    return this;
  }

  /**
   * Link for this filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link for this filter.
   * @param selfLink selfLink or {@code null} for none
   */
  public Filter setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE,
   * SEARCH_AND_REPLACE and ADVANCED.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE,
   * SEARCH_AND_REPLACE and ADVANCED.
   * @param type type or {@code null} for none
   */
  public Filter setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Time this filter was last modified.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * Time this filter was last modified.
   * @param updated updated or {@code null} for none
   */
  public Filter setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Details for the filter of the type UPPER.
   * @return value or {@code null} for none
   */
  public UppercaseDetails getUppercaseDetails() {
    return uppercaseDetails;
  }

  /**
   * Details for the filter of the type UPPER.
   * @param uppercaseDetails uppercaseDetails or {@code null} for none
   */
  public Filter setUppercaseDetails(UppercaseDetails uppercaseDetails) {
    this.uppercaseDetails = uppercaseDetails;
    return this;
  }

  @Override
  public Filter set(String fieldName, Object value) {
    return (Filter) super.set(fieldName, value);
  }

  @Override
  public Filter clone() {
    return (Filter) super.clone();
  }

  /**
   * Details for the filter of the type ADVANCED.
   */
  public static final class AdvancedDetails extends com.google.api.client.json.GenericJson {

    /**
     * Indicates if the filter expressions are case sensitive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean caseSensitive;

    /**
     * Expression to extract from field A.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String extractA;

    /**
     * Expression to extract from field B.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String extractB;

    /**
     * Field A.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String fieldA;

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer fieldAIndex;

    /**
     * Indicates if field A is required to match.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean fieldARequired;

    /**
     * Field B.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String fieldB;

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer fieldBIndex;

    /**
     * Indicates if field B is required to match.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean fieldBRequired;

    /**
     * Expression used to construct the output value.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String outputConstructor;

    /**
     * Output field.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String outputToField;

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer outputToFieldIndex;

    /**
     * Indicates if the existing value of the output field, if any, should be overridden by the output
     * expression.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean overrideOutputField;

    /**
     * Indicates if the filter expressions are case sensitive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCaseSensitive() {
      return caseSensitive;
    }

    /**
     * Indicates if the filter expressions are case sensitive.
     * @param caseSensitive caseSensitive or {@code null} for none
     */
    public AdvancedDetails setCaseSensitive(java.lang.Boolean caseSensitive) {
      this.caseSensitive = caseSensitive;
      return this;
    }

    /**
     * Expression to extract from field A.
     * @return value or {@code null} for none
     */
    public java.lang.String getExtractA() {
      return extractA;
    }

    /**
     * Expression to extract from field A.
     * @param extractA extractA or {@code null} for none
     */
    public AdvancedDetails setExtractA(java.lang.String extractA) {
      this.extractA = extractA;
      return this;
    }

    /**
     * Expression to extract from field B.
     * @return value or {@code null} for none
     */
    public java.lang.String getExtractB() {
      return extractB;
    }

    /**
     * Expression to extract from field B.
     * @param extractB extractB or {@code null} for none
     */
    public AdvancedDetails setExtractB(java.lang.String extractB) {
      this.extractB = extractB;
      return this;
    }

    /**
     * Field A.
     * @return value or {@code null} for none
     */
    public java.lang.String getFieldA() {
      return fieldA;
    }

    /**
     * Field A.
     * @param fieldA fieldA or {@code null} for none
     */
    public AdvancedDetails setFieldA(java.lang.String fieldA) {
      this.fieldA = fieldA;
      return this;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getFieldAIndex() {
      return fieldAIndex;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @param fieldAIndex fieldAIndex or {@code null} for none
     */
    public AdvancedDetails setFieldAIndex(java.lang.Integer fieldAIndex) {
      this.fieldAIndex = fieldAIndex;
      return this;
    }

    /**
     * Indicates if field A is required to match.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getFieldARequired() {
      return fieldARequired;
    }

    /**
     * Indicates if field A is required to match.
     * @param fieldARequired fieldARequired or {@code null} for none
     */
    public AdvancedDetails setFieldARequired(java.lang.Boolean fieldARequired) {
      this.fieldARequired = fieldARequired;
      return this;
    }

    /**
     * Field B.
     * @return value or {@code null} for none
     */
    public java.lang.String getFieldB() {
      return fieldB;
    }

    /**
     * Field B.
     * @param fieldB fieldB or {@code null} for none
     */
    public AdvancedDetails setFieldB(java.lang.String fieldB) {
      this.fieldB = fieldB;
      return this;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getFieldBIndex() {
      return fieldBIndex;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @param fieldBIndex fieldBIndex or {@code null} for none
     */
    public AdvancedDetails setFieldBIndex(java.lang.Integer fieldBIndex) {
      this.fieldBIndex = fieldBIndex;
      return this;
    }

    /**
     * Indicates if field B is required to match.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getFieldBRequired() {
      return fieldBRequired;
    }

    /**
     * Indicates if field B is required to match.
     * @param fieldBRequired fieldBRequired or {@code null} for none
     */
    public AdvancedDetails setFieldBRequired(java.lang.Boolean fieldBRequired) {
      this.fieldBRequired = fieldBRequired;
      return this;
    }

    /**
     * Expression used to construct the output value.
     * @return value or {@code null} for none
     */
    public java.lang.String getOutputConstructor() {
      return outputConstructor;
    }

    /**
     * Expression used to construct the output value.
     * @param outputConstructor outputConstructor or {@code null} for none
     */
    public AdvancedDetails setOutputConstructor(java.lang.String outputConstructor) {
      this.outputConstructor = outputConstructor;
      return this;
    }

    /**
     * Output field.
     * @return value or {@code null} for none
     */
    public java.lang.String getOutputToField() {
      return outputToField;
    }

    /**
     * Output field.
     * @param outputToField outputToField or {@code null} for none
     */
    public AdvancedDetails setOutputToField(java.lang.String outputToField) {
      this.outputToField = outputToField;
      return this;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getOutputToFieldIndex() {
      return outputToFieldIndex;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @param outputToFieldIndex outputToFieldIndex or {@code null} for none
     */
    public AdvancedDetails setOutputToFieldIndex(java.lang.Integer outputToFieldIndex) {
      this.outputToFieldIndex = outputToFieldIndex;
      return this;
    }

    /**
     * Indicates if the existing value of the output field, if any, should be overridden by the output
     * expression.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getOverrideOutputField() {
      return overrideOutputField;
    }

    /**
     * Indicates if the existing value of the output field, if any, should be overridden by the output
     * expression.
     * @param overrideOutputField overrideOutputField or {@code null} for none
     */
    public AdvancedDetails setOverrideOutputField(java.lang.Boolean overrideOutputField) {
      this.overrideOutputField = overrideOutputField;
      return this;
    }

    @Override
    public AdvancedDetails set(String fieldName, Object value) {
      return (AdvancedDetails) super.set(fieldName, value);
    }

    @Override
    public AdvancedDetails clone() {
      return (AdvancedDetails) super.clone();
    }

  }

  /**
   * Details for the filter of the type LOWER.
   */
  public static final class LowercaseDetails extends com.google.api.client.json.GenericJson {

    /**
     * Field to use in the filter.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String field;

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer fieldIndex;

    /**
     * Field to use in the filter.
     * @return value or {@code null} for none
     */
    public java.lang.String getField() {
      return field;
    }

    /**
     * Field to use in the filter.
     * @param field field or {@code null} for none
     */
    public LowercaseDetails setField(java.lang.String field) {
      this.field = field;
      return this;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getFieldIndex() {
      return fieldIndex;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @param fieldIndex fieldIndex or {@code null} for none
     */
    public LowercaseDetails setFieldIndex(java.lang.Integer fieldIndex) {
      this.fieldIndex = fieldIndex;
      return this;
    }

    @Override
    public LowercaseDetails set(String fieldName, Object value) {
      return (LowercaseDetails) super.set(fieldName, value);
    }

    @Override
    public LowercaseDetails clone() {
      return (LowercaseDetails) super.clone();
    }

  }

  /**
   * Parent link for this filter. Points to the account to which this filter belongs.
   */
  public static final class ParentLink extends com.google.api.client.json.GenericJson {

    /**
     * Link to the account to which this filter belongs.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String href;

    /**
     * Value is "analytics#account".
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String type;

    /**
     * Link to the account to which this filter belongs.
     * @return value or {@code null} for none
     */
    public java.lang.String getHref() {
      return href;
    }

    /**
     * Link to the account to which this filter belongs.
     * @param href href or {@code null} for none
     */
    public ParentLink setHref(java.lang.String href) {
      this.href = href;
      return this;
    }

    /**
     * Value is "analytics#account".
     * @return value or {@code null} for none
     */
    public java.lang.String getType() {
      return type;
    }

    /**
     * Value is "analytics#account".
     * @param type type or {@code null} for none
     */
    public ParentLink setType(java.lang.String type) {
      this.type = type;
      return this;
    }

    @Override
    public ParentLink set(String fieldName, Object value) {
      return (ParentLink) super.set(fieldName, value);
    }

    @Override
    public ParentLink clone() {
      return (ParentLink) super.clone();
    }

  }

  /**
   * Details for the filter of the type SEARCH_AND_REPLACE.
   */
  public static final class SearchAndReplaceDetails extends com.google.api.client.json.GenericJson {

    /**
     * Determines if the filter is case sensitive.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean caseSensitive;

    /**
     * Field to use in the filter.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String field;

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer fieldIndex;

    /**
     * Term to replace the search term with.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String replaceString;

    /**
     * Term to search.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String searchString;

    /**
     * Determines if the filter is case sensitive.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getCaseSensitive() {
      return caseSensitive;
    }

    /**
     * Determines if the filter is case sensitive.
     * @param caseSensitive caseSensitive or {@code null} for none
     */
    public SearchAndReplaceDetails setCaseSensitive(java.lang.Boolean caseSensitive) {
      this.caseSensitive = caseSensitive;
      return this;
    }

    /**
     * Field to use in the filter.
     * @return value or {@code null} for none
     */
    public java.lang.String getField() {
      return field;
    }

    /**
     * Field to use in the filter.
     * @param field field or {@code null} for none
     */
    public SearchAndReplaceDetails setField(java.lang.String field) {
      this.field = field;
      return this;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getFieldIndex() {
      return fieldIndex;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @param fieldIndex fieldIndex or {@code null} for none
     */
    public SearchAndReplaceDetails setFieldIndex(java.lang.Integer fieldIndex) {
      this.fieldIndex = fieldIndex;
      return this;
    }

    /**
     * Term to replace the search term with.
     * @return value or {@code null} for none
     */
    public java.lang.String getReplaceString() {
      return replaceString;
    }

    /**
     * Term to replace the search term with.
     * @param replaceString replaceString or {@code null} for none
     */
    public SearchAndReplaceDetails setReplaceString(java.lang.String replaceString) {
      this.replaceString = replaceString;
      return this;
    }

    /**
     * Term to search.
     * @return value or {@code null} for none
     */
    public java.lang.String getSearchString() {
      return searchString;
    }

    /**
     * Term to search.
     * @param searchString searchString or {@code null} for none
     */
    public SearchAndReplaceDetails setSearchString(java.lang.String searchString) {
      this.searchString = searchString;
      return this;
    }

    @Override
    public SearchAndReplaceDetails set(String fieldName, Object value) {
      return (SearchAndReplaceDetails) super.set(fieldName, value);
    }

    @Override
    public SearchAndReplaceDetails clone() {
      return (SearchAndReplaceDetails) super.clone();
    }

  }

  /**
   * Details for the filter of the type UPPER.
   */
  public static final class UppercaseDetails extends com.google.api.client.json.GenericJson {

    /**
     * Field to use in the filter.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String field;

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Integer fieldIndex;

    /**
     * Field to use in the filter.
     * @return value or {@code null} for none
     */
    public java.lang.String getField() {
      return field;
    }

    /**
     * Field to use in the filter.
     * @param field field or {@code null} for none
     */
    public UppercaseDetails setField(java.lang.String field) {
      this.field = field;
      return this;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @return value or {@code null} for none
     */
    public java.lang.Integer getFieldIndex() {
      return fieldIndex;
    }

    /**
     * The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION.
     * @param fieldIndex fieldIndex or {@code null} for none
     */
    public UppercaseDetails setFieldIndex(java.lang.Integer fieldIndex) {
      this.fieldIndex = fieldIndex;
      return this;
    }

    @Override
    public UppercaseDetails set(String fieldName, Object value) {
      return (UppercaseDetails) super.set(fieldName, value);
    }

    @Override
    public UppercaseDetails clone() {
      return (UppercaseDetails) super.clone();
    }

  }
}