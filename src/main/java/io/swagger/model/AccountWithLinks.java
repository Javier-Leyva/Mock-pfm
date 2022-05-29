package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import io.swagger.model.AccountTransactionsListLink;
import io.swagger.model.AccoutDetailsLink;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing account information and interest links.
 */
@ApiModel(description = "Data structure containing account information and interest links.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class AccountWithLinks   {
  @JsonProperty("account")
  private Account account = null;

  @JsonProperty("accountDetailsLink")
  private AccoutDetailsLink accountDetailsLink = null;

  @JsonProperty("transactionsListLink")
  private AccountTransactionsListLink transactionsListLink = null;

  public AccountWithLinks account(Account account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public AccountWithLinks accountDetailsLink(AccoutDetailsLink accountDetailsLink) {
    this.accountDetailsLink = accountDetailsLink;
    return this;
  }

  /**
   * Get accountDetailsLink
   * @return accountDetailsLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccoutDetailsLink getAccountDetailsLink() {
    return accountDetailsLink;
  }

  public void setAccountDetailsLink(AccoutDetailsLink accountDetailsLink) {
    this.accountDetailsLink = accountDetailsLink;
  }

  public AccountWithLinks transactionsListLink(AccountTransactionsListLink transactionsListLink) {
    this.transactionsListLink = transactionsListLink;
    return this;
  }

  /**
   * Get transactionsListLink
   * @return transactionsListLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountTransactionsListLink getTransactionsListLink() {
    return transactionsListLink;
  }

  public void setTransactionsListLink(AccountTransactionsListLink transactionsListLink) {
    this.transactionsListLink = transactionsListLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountWithLinks accountWithLinks = (AccountWithLinks) o;
    return Objects.equals(this.account, accountWithLinks.account) &&
        Objects.equals(this.accountDetailsLink, accountWithLinks.accountDetailsLink) &&
        Objects.equals(this.transactionsListLink, accountWithLinks.transactionsListLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, accountDetailsLink, transactionsListLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountWithLinks {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    accountDetailsLink: ").append(toIndentedString(accountDetailsLink)).append("\n");
    sb.append("    transactionsListLink: ").append(toIndentedString(transactionsListLink)).append("\n");
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

