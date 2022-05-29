package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ForecastCategoriesDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ForecastDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class ForecastDto   {
  @JsonProperty("id")
  private Double id = null;

  @JsonProperty("lower")
  private Double lower = null;

  @JsonProperty("upper")
  private Double upper = null;

  @JsonProperty("global")
  private Double global = null;

  @JsonProperty("categories")
  @Valid
  private List<ForecastCategoriesDto> categories = null;

  public ForecastDto id(Double id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Double getId() {
    return id;
  }

  public void setId(Double id) {
    this.id = id;
  }

  public ForecastDto lower(Double lower) {
    this.lower = lower;
    return this;
  }

  /**
   * Get lower
   * @return lower
  **/
  @ApiModelProperty(value = "")


  public Double getLower() {
    return lower;
  }

  public void setLower(Double lower) {
    this.lower = lower;
  }

  public ForecastDto upper(Double upper) {
    this.upper = upper;
    return this;
  }

  /**
   * Get upper
   * @return upper
  **/
  @ApiModelProperty(value = "")


  public Double getUpper() {
    return upper;
  }

  public void setUpper(Double upper) {
    this.upper = upper;
  }

  public ForecastDto global(Double global) {
    this.global = global;
    return this;
  }

  /**
   * Get global
   * @return global
  **/
  @ApiModelProperty(value = "")


  public Double getGlobal() {
    return global;
  }

  public void setGlobal(Double global) {
    this.global = global;
  }

  public ForecastDto categories(List<ForecastCategoriesDto> categories) {
    this.categories = categories;
    return this;
  }

  public ForecastDto addCategoriesItem(ForecastCategoriesDto categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<ForecastCategoriesDto>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ForecastCategoriesDto> getCategories() {
    return categories;
  }

  public void setCategories(List<ForecastCategoriesDto> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastDto forecastDto = (ForecastDto) o;
    return Objects.equals(this.id, forecastDto.id) &&
        Objects.equals(this.lower, forecastDto.lower) &&
        Objects.equals(this.upper, forecastDto.upper) &&
        Objects.equals(this.global, forecastDto.global) &&
        Objects.equals(this.categories, forecastDto.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lower, upper, global, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

