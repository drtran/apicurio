package com.drtran.apicurio.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HumanReviewItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-10-03T05:12:02.173-04:00[America/New_York]")

public class HumanReviewItem   {
  @JsonProperty("stix_id")
  private String stixId = null;

  @JsonProperty("field_name")
  private String fieldName = null;

  @JsonProperty("field_value")
  private String fieldValue = null;

  public HumanReviewItem stixId(String stixId) {
    this.stixId = stixId;
    return this;
  }

  /**
   * Get stixId
   * @return stixId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStixId() {
    return stixId;
  }

  public void setStixId(String stixId) {
    this.stixId = stixId;
  }

  public HumanReviewItem fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public HumanReviewItem fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

  /**
   * Get fieldValue
   * @return fieldValue
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HumanReviewItem humanReviewItem = (HumanReviewItem) o;
    return Objects.equals(this.stixId, humanReviewItem.stixId) &&
        Objects.equals(this.fieldName, humanReviewItem.fieldName) &&
        Objects.equals(this.fieldValue, humanReviewItem.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stixId, fieldName, fieldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HumanReviewItem {\n");
    
    sb.append("    stixId: ").append(toIndentedString(stixId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

