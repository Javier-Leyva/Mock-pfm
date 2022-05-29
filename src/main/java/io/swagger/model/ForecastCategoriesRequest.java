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
 * ForecastCategoriesRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class ForecastCategoriesRequest   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("forecast")
  private Double forecast = null;

  public ForecastCategoriesRequest category(String category) {
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

  public ForecastCategoriesRequest forecast(Double forecast) {
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
    ForecastCategoriesRequest forecastCategoriesRequest = (ForecastCategoriesRequest) o;
    return Objects.equals(this.category, forecastCategoriesRequest.category) &&
        Objects.equals(this.forecast, forecastCategoriesRequest.forecast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, forecast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastCategoriesRequest {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

