package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing aggregated information from the account balances.
 */
@ApiModel(description = "Data structure containing aggregated information from the account balances.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class AccountTotalBalances   {
  @JsonProperty("totalCurrent")
  private Amount totalCurrent = null;

  @JsonProperty("totalWithholding")
  private Amount totalWithholding = null;

  @JsonProperty("totalAvailable")
  private Amount totalAvailable = null;

  public AccountTotalBalances totalCurrent(Amount totalCurrent) {
    this.totalCurrent = totalCurrent;
    return this;
  }

  /**
   * Get totalCurrent
   * @return totalCurrent
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTotalCurrent() {
    return totalCurrent;
  }

  public void setTotalCurrent(Amount totalCurrent) {
    this.totalCurrent = totalCurrent;
  }

  public AccountTotalBalances totalWithholding(Amount totalWithholding) {
    this.totalWithholding = totalWithholding;
    return this;
  }

  /**
   * Get totalWithholding
   * @return totalWithholding
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTotalWithholding() {
    return totalWithholding;
  }

  public void setTotalWithholding(Amount totalWithholding) {
    this.totalWithholding = totalWithholding;
  }

  public AccountTotalBalances totalAvailable(Amount totalAvailable) {
    this.totalAvailable = totalAvailable;
    return this;
  }

  /**
   * Get totalAvailable
   * @return totalAvailable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getTotalAvailable() {
    return totalAvailable;
  }

  public void setTotalAvailable(Amount totalAvailable) {
    this.totalAvailable = totalAvailable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTotalBalances accountTotalBalances = (AccountTotalBalances) o;
    return Objects.equals(this.totalCurrent, accountTotalBalances.totalCurrent) &&
        Objects.equals(this.totalWithholding, accountTotalBalances.totalWithholding) &&
        Objects.equals(this.totalAvailable, accountTotalBalances.totalAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCurrent, totalWithholding, totalAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTotalBalances {\n");
    
    sb.append("    totalCurrent: ").append(toIndentedString(totalCurrent)).append("\n");
    sb.append("    totalWithholding: ").append(toIndentedString(totalWithholding)).append("\n");
    sb.append("    totalAvailable: ").append(toIndentedString(totalAvailable)).append("\n");
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

