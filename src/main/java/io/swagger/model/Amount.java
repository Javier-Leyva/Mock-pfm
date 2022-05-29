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
 * Data structure containing amount details
 */
@ApiModel(description = "Data structure containing amount details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class Amount   {
  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public Amount amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount.  The value uses the data format defined in ISO 20022 and has a maximum of 18 digits, of which 5 can be decimals, separated by a point.  Range value is between -1.0E13 and 1.0E13
   * @return amount
  **/
  @ApiModelProperty(example = "99.95", required = true, value = "Amount.  The value uses the data format defined in ISO 20022 and has a maximum of 18 digits, of which 5 can be decimals, separated by a point.  Range value is between -1.0E13 and 1.0E13")
  @NotNull


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Amount currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code.  The value is in the alpha-3 format defined in ISO 4217 (https://www.iso.org/iso-4217-currency-codes.html).
   * @return currency
  **/
  @ApiModelProperty(example = "MXN", required = true, value = "Currency code.  The value is in the alpha-3 format defined in ISO 4217 (https://www.iso.org/iso-4217-currency-codes.html).")
  @NotNull

@Pattern(regexp="(^.{3}$)") @Size(min=3,max=3) 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Amount amount = (Amount) o;
    return Objects.equals(this.amount, amount.amount) &&
        Objects.equals(this.currency, amount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Amount {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

