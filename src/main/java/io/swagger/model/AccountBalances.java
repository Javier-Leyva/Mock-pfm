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
 * Data structure containing information related to different balances.
 */
@ApiModel(description = "Data structure containing information related to different balances.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class AccountBalances   {
  @JsonProperty("current")
  private Object current = null;

  @JsonProperty("withholding")
  private Object withholding = null;

  @JsonProperty("available")
  private Object available = null;

  @JsonProperty("overdraft")
  private Object overdraft = null;

  @JsonProperty("overdraftUsed")
  private Object overdraftUsed = null;

  public AccountBalances current(Object current) {
    this.current = current;
    return this;
  }

  /**
   * Actual account balance at the query moment.
   * @return current
  **/
  @ApiModelProperty(value = "Actual account balance at the query moment.")


  public Object getCurrent() {
    return current;
  }

  public void setCurrent(Object current) {
    this.current = current;
  }

  public AccountBalances withholding(Object withholding) {
    this.withholding = withholding;
    return this;
  }

  /**
   * Sum of all active withholdings on the account. This balance decreases the available balance. 
   * @return withholding
  **/
  @ApiModelProperty(value = "Sum of all active withholdings on the account. This balance decreases the available balance. ")


  public Object getWithholding() {
    return withholding;
  }

  public void setWithholding(Object withholding) {
    this.withholding = withholding;
  }

  public AccountBalances available(Object available) {
    this.available = available;
    return this;
  }

  /**
   * Current balance plus overdraft balance less withholding balance less pending to authorize and less pending to consolidate.
   * @return available
  **/
  @ApiModelProperty(value = "Current balance plus overdraft balance less withholding balance less pending to authorize and less pending to consolidate.")


  public Object getAvailable() {
    return available;
  }

  public void setAvailable(Object available) {
    this.available = available;
  }

  public AccountBalances overdraft(Object overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Accumulated active overdraft balances. This balance increases the available balance.
   * @return overdraft
  **/
  @ApiModelProperty(value = "Accumulated active overdraft balances. This balance increases the available balance.")


  public Object getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Object overdraft) {
    this.overdraft = overdraft;
  }

  public AccountBalances overdraftUsed(Object overdraftUsed) {
    this.overdraftUsed = overdraftUsed;
    return this;
  }

  /**
   * Used overdraft balances.
   * @return overdraftUsed
  **/
  @ApiModelProperty(value = "Used overdraft balances.")


  public Object getOverdraftUsed() {
    return overdraftUsed;
  }

  public void setOverdraftUsed(Object overdraftUsed) {
    this.overdraftUsed = overdraftUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBalances accountBalances = (AccountBalances) o;
    return Objects.equals(this.current, accountBalances.current) &&
        Objects.equals(this.withholding, accountBalances.withholding) &&
        Objects.equals(this.available, accountBalances.available) &&
        Objects.equals(this.overdraft, accountBalances.overdraft) &&
        Objects.equals(this.overdraftUsed, accountBalances.overdraftUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, withholding, available, overdraft, overdraftUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBalances {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    withholding: ").append(toIndentedString(withholding)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    overdraftUsed: ").append(toIndentedString(overdraftUsed)).append("\n");
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

