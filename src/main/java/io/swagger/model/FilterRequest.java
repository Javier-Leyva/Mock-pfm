package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ProductRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * FilterRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class FilterRequest   {
  @JsonProperty("dateFrom")
  private String dateFrom = null;

  @JsonProperty("dateTo")
  private String dateTo = null;

  @JsonProperty("scale")
  private String scale = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("type")
  private Integer type = null;

  @JsonProperty("rangeFrom")
  private Double rangeFrom = null;

  @JsonProperty("rangeTo")
  private Double rangeTo = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("products")
  @Valid
  private List<ProductRequest> products = null;

  @JsonProperty("subCategory")
  @Valid
  private List<String> subCategory = null;

  public FilterRequest dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Get dateFrom
   * @return dateFrom
  **/
  @ApiModelProperty(value = "")


  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }

  public FilterRequest dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Get dateTo
   * @return dateTo
  **/
  @ApiModelProperty(value = "")


  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }

  public FilterRequest scale(String scale) {
    this.scale = scale;
    return this;
  }

  /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(value = "")


  public String getScale() {
    return scale;
  }

  public void setScale(String scale) {
    this.scale = scale;
  }

  public FilterRequest category(String category) {
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

  public FilterRequest type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public FilterRequest rangeFrom(Double rangeFrom) {
    this.rangeFrom = rangeFrom;
    return this;
  }

  /**
   * Get rangeFrom
   * @return rangeFrom
  **/
  @ApiModelProperty(value = "")


  public Double getRangeFrom() {
    return rangeFrom;
  }

  public void setRangeFrom(Double rangeFrom) {
    this.rangeFrom = rangeFrom;
  }

  public FilterRequest rangeTo(Double rangeTo) {
    this.rangeTo = rangeTo;
    return this;
  }

  /**
   * Get rangeTo
   * @return rangeTo
  **/
  @ApiModelProperty(value = "")


  public Double getRangeTo() {
    return rangeTo;
  }

  public void setRangeTo(Double rangeTo) {
    this.rangeTo = rangeTo;
  }

  public FilterRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public FilterRequest products(List<ProductRequest> products) {
    this.products = products;
    return this;
  }

  public FilterRequest addProductsItem(ProductRequest productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<ProductRequest>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductRequest> getProducts() {
    return products;
  }

  public void setProducts(List<ProductRequest> products) {
    this.products = products;
  }

  public FilterRequest subCategory(List<String> subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  public FilterRequest addSubCategoryItem(String subCategoryItem) {
    if (this.subCategory == null) {
      this.subCategory = new ArrayList<String>();
    }
    this.subCategory.add(subCategoryItem);
    return this;
  }

  /**
   * Get subCategory
   * @return subCategory
  **/
  @ApiModelProperty(value = "")


  public List<String> getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(List<String> subCategory) {
    this.subCategory = subCategory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterRequest filterRequest = (FilterRequest) o;
    return Objects.equals(this.dateFrom, filterRequest.dateFrom) &&
        Objects.equals(this.dateTo, filterRequest.dateTo) &&
        Objects.equals(this.scale, filterRequest.scale) &&
        Objects.equals(this.category, filterRequest.category) &&
        Objects.equals(this.type, filterRequest.type) &&
        Objects.equals(this.rangeFrom, filterRequest.rangeFrom) &&
        Objects.equals(this.rangeTo, filterRequest.rangeTo) &&
        Objects.equals(this.text, filterRequest.text) &&
        Objects.equals(this.products, filterRequest.products) &&
        Objects.equals(this.subCategory, filterRequest.subCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, scale, category, type, rangeFrom, rangeTo, text, products, subCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterRequest {\n");
    
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rangeFrom: ").append(toIndentedString(rangeFrom)).append("\n");
    sb.append("    rangeTo: ").append(toIndentedString(rangeTo)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
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

