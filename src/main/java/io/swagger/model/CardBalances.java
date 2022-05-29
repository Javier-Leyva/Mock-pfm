package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Balance;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information about different card balances
 */
@ApiModel(description = "Data structure containing information about different card balances")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class CardBalances   {
  @JsonProperty("available")
  private Balance available = null;

  @JsonProperty("disposed")
  private Balance disposed = null;

  public CardBalances available(Balance available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Balance getAvailable() {
    return available;
  }

  public void setAvailable(Balance available) {
    this.available = available;
  }

  public CardBalances disposed(Balance disposed) {
    this.disposed = disposed;
    return this;
  }

  /**
   * Get disposed
   * @return disposed
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Balance getDisposed() {
    return disposed;
  }

  public void setDisposed(Balance disposed) {
    this.disposed = disposed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardBalances cardBalances = (CardBalances) o;
    return Objects.equals(this.available, cardBalances.available) &&
        Objects.equals(this.disposed, cardBalances.disposed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, disposed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardBalances {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    disposed: ").append(toIndentedString(disposed)).append("\n");
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

