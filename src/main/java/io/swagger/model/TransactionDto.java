package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class TransactionDto   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("productNumber")
  private String productNumber = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("total")
  private String total = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("subCategory")
  private String subCategory = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("parentId")
  private String parentId = null;

  public TransactionDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TransactionDto productNumber(String productNumber) {
    this.productNumber = productNumber;
    return this;
  }

  /**
   * Get productNumber
   * @return productNumber
  **/
  @ApiModelProperty(value = "")


  public String getProductNumber() {
    return productNumber;
  }

  public void setProductNumber(String productNumber) {
    this.productNumber = productNumber;
  }

  public TransactionDto date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public TransactionDto total(String total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")


  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }

  public TransactionDto description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransactionDto currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TransactionDto subCategory(String subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  /**
   * Get subCategory
   * @return subCategory
  **/
  @ApiModelProperty(value = "")


  public String getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }

  public TransactionDto category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TransactionDto productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public TransactionDto parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(value = "")


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDto transactionDto = (TransactionDto) o;
    return Objects.equals(this.type, transactionDto.type) &&
        Objects.equals(this.productNumber, transactionDto.productNumber) &&
        Objects.equals(this.date, transactionDto.date) &&
        Objects.equals(this.total, transactionDto.total) &&
        Objects.equals(this.description, transactionDto.description) &&
        Objects.equals(this.currency, transactionDto.currency) &&
        Objects.equals(this.subCategory, transactionDto.subCategory) &&
        Objects.equals(this.category, transactionDto.category) &&
        Objects.equals(this.productType, transactionDto.productType) &&
        Objects.equals(this.parentId, transactionDto.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, productNumber, date, total, description, currency, subCategory, category, productType, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    productNumber: ").append(toIndentedString(productNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

