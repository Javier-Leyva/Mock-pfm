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
 * ForecastCategoriesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class ForecastCategoriesDto   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("lower")
  private Double lower = null;

  @JsonProperty("upper")
  private Double upper = null;

  @JsonProperty("forecast")
  private Double forecast = null;

  public ForecastCategoriesDto category(String category) {
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

  public ForecastCategoriesDto lower(Double lower) {
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

  public ForecastCategoriesDto upper(Double upper) {
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

  public ForecastCategoriesDto forecast(Double forecast) {
    this.forecast = forecast;
    return this;
  }

  /**
   * Get forecast
   * @return forecast
  **/
  @ApiModelProperty(value = "")


  public Double getForecast() {
    return forecast;
  }

  public void setForecast(Double forecast) {
    this.forecast = forecast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastCategoriesDto forecastCategoriesDto = (ForecastCategoriesDto) o;
    return Objects.equals(this.category, forecastCategoriesDto.category) &&
        Objects.equals(this.lower, forecastCategoriesDto.lower) &&
        Objects.equals(this.upper, forecastCategoriesDto.upper) &&
        Objects.equals(this.forecast, forecastCategoriesDto.forecast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, lower, upper, forecast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastCategoriesDto {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
    sb.append("    forecast: ").append(toIndentedString(forecast)).append("\n");
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

