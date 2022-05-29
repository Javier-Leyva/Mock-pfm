package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccoutViewDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing account information
 */
@ApiModel(description = "Data structure containing account information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class AccountsViewInformation   {
  @JsonProperty("presentationOrderPoducts")
  private Integer presentationOrderPoducts = null;

  @JsonProperty("accounts")
  @Valid
  private List<AccoutViewDetails> accounts = null;

  public AccountsViewInformation presentationOrderPoducts(Integer presentationOrderPoducts) {
    this.presentationOrderPoducts = presentationOrderPoducts;
    return this;
  }

  /**
   * Get presentationOrderPoducts
   * @return presentationOrderPoducts
  **/
  @ApiModelProperty(value = "")


  public Integer getPresentationOrderPoducts() {
    return presentationOrderPoducts;
  }

  public void setPresentationOrderPoducts(Integer presentationOrderPoducts) {
    this.presentationOrderPoducts = presentationOrderPoducts;
  }

  public AccountsViewInformation accounts(List<AccoutViewDetails> accounts) {
    this.accounts = accounts;
    return this;
  }

  public AccountsViewInformation addAccountsItem(AccoutViewDetails accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<AccoutViewDetails>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Array of accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "Array of accounts")

  @Valid

  public List<AccoutViewDetails> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccoutViewDetails> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsViewInformation accountsViewInformation = (AccountsViewInformation) o;
    return Objects.equals(this.presentationOrderPoducts, accountsViewInformation.presentationOrderPoducts) &&
        Objects.equals(this.accounts, accountsViewInformation.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationOrderPoducts, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsViewInformation {\n");
    
    sb.append("    presentationOrderPoducts: ").append(toIndentedString(presentationOrderPoducts)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

