package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountTotalBalances;
import io.swagger.model.AccountWithLinks;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing aggregated information from the account balances and broken down to account level.
 */
@ApiModel(description = "Data structure containing aggregated information from the account balances and broken down to account level.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class AccountsInformation   {
  @JsonProperty("totalBalances")
  private AccountTotalBalances totalBalances = null;

  @JsonProperty("list")
  @Valid
  private List<AccountWithLinks> _list = null;

  public AccountsInformation totalBalances(AccountTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
    return this;
  }

  /**
   * Get totalBalances
   * @return totalBalances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountTotalBalances getTotalBalances() {
    return totalBalances;
  }

  public void setTotalBalances(AccountTotalBalances totalBalances) {
    this.totalBalances = totalBalances;
  }

  public AccountsInformation _list(List<AccountWithLinks> _list) {
    this._list = _list;
    return this;
  }

  public AccountsInformation addListItem(AccountWithLinks _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<AccountWithLinks>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Array of accounts.
   * @return _list
  **/
  @ApiModelProperty(value = "Array of accounts.")

  @Valid

  public List<AccountWithLinks> getList() {
    return _list;
  }

  public void setList(List<AccountWithLinks> _list) {
    this._list = _list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsInformation accountsInformation = (AccountsInformation) o;
    return Objects.equals(this.totalBalances, accountsInformation.totalBalances) &&
        Objects.equals(this._list, accountsInformation._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalBalances, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsInformation {\n");
    
    sb.append("    totalBalances: ").append(toIndentedString(totalBalances)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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

