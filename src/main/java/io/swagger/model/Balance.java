package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Numerical representation of the net increases and decreases in an account at a specific point in time.
 */
@ApiModel(description = "Numerical representation of the net increases and decreases in an account at a specific point in time.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class Balance   {
  @JsonProperty("amount")
  private Amount amount = null;

  @JsonProperty("lastUpdateDate")
  private LocalDate lastUpdateDate = null;

  public Balance amount(Amount amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  public Balance lastUpdateDate(LocalDate lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

  /**
   * Balance last update date. The value uses the complete data format defined in ISO 8601: 'YYYY-MM-DD' Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)
   * @return lastUpdateDate
  **/
  @ApiModelProperty(example = "2020-12-01", value = "Balance last update date. The value uses the complete data format defined in ISO 8601: 'YYYY-MM-DD' Where: - YYYY: 4-digit year - MM: 2-digit month (for example, 01 = January) - DD: 2-digit day of the month (01 through 31)")

  @Valid

  public LocalDate getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(LocalDate lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.amount, balance.amount) &&
        Objects.equals(this.lastUpdateDate, balance.lastUpdateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, lastUpdateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
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

