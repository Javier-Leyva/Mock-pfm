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
 * Data structure containing the expiration date
 */
@ApiModel(description = "Data structure containing the expiration date")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class Expiration   {
  @JsonProperty("month")
  private String month = null;

  @JsonProperty("year")
  private String year = null;

  public Expiration month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Month of expiry.  The value is a 2-digit month of the year.
   * @return month
  **/
  @ApiModelProperty(example = "05", value = "Month of expiry.  The value is a 2-digit month of the year.")


  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Expiration year(String year) {
    this.year = year;
    return this;
  }

  /**
   * Year of expiry.  The value is a 4-digit year.
   * @return year
  **/
  @ApiModelProperty(example = "2022", value = "Year of expiry.  The value is a 4-digit year.")


  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Expiration expiration = (Expiration) o;
    return Objects.equals(this.month, expiration.month) &&
        Objects.equals(this.year, expiration.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(month, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Expiration {\n");
    
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

