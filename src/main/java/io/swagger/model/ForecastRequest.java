package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ForecastCategoriesRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ForecastRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class ForecastRequest   {
  @JsonProperty("id")
  private Double id = null;

  @JsonProperty("global")
  private Double global = null;

  @JsonProperty("categories")
  @Valid
  private List<ForecastCategoriesRequest> categories = null;

  public ForecastRequest id(Double id) {
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

  public ForecastRequest global(Double global) {
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

  public ForecastRequest categories(List<ForecastCategoriesRequest> categories) {
    this.categories = categories;
    return this;
  }

  public ForecastRequest addCategoriesItem(ForecastCategoriesRequest categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<ForecastCategoriesRequest>();
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

  public List<ForecastCategoriesRequest> getCategories() {
    return categories;
  }

  public void setCategories(List<ForecastCategoriesRequest> categories) {
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
    ForecastRequest forecastRequest = (ForecastRequest) o;
    return Objects.equals(this.id, forecastRequest.id) &&
        Objects.equals(this.global, forecastRequest.global) &&
        Objects.equals(this.categories, forecastRequest.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, global, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

