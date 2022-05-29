package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountBalances;
import io.swagger.model.StatusInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing account information
 */
@ApiModel(description = "Data structure containing account information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class Account   {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("accountIdentification")
  private Object accountIdentification = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  @JsonProperty("contract")
  private Object contract = null;

  @JsonProperty("statusInfo")
  private StatusInfo statusInfo = null;

  @JsonProperty("balances")
  private AccountBalances balances = null;

  @JsonProperty("bankId")
  private String bankId = null;

  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account number.  The value uses the format defined in 'accountIdType'.
   * @return accountId
  **/
  @ApiModelProperty(example = "9012781018079", value = "Account number.  The value uses the format defined in 'accountIdType'.")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Account accountIdentification(Object accountIdentification) {
    this.accountIdentification = accountIdentification;
    return this;
  }

  /**
   * Data structure containing information related to account identification
   * @return accountIdentification
  **/
  @ApiModelProperty(value = "Data structure containing information related to account identification")


  public Object getAccountIdentification() {
    return accountIdentification;
  }

  public void setAccountIdentification(Object accountIdentification) {
    this.accountIdentification = accountIdentification;
  }

  public Account channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
    this.channelAccessAgreementInformation = channelAccessAgreementInformation;
    return this;
  }

  /**
   * Data structure containing information for a global position.
   * @return channelAccessAgreementInformation
  **/
  @ApiModelProperty(value = "Data structure containing information for a global position.")


  public Object getChannelAccessAgreementInformation() {
    return channelAccessAgreementInformation;
  }

  public void setChannelAccessAgreementInformation(Object channelAccessAgreementInformation) {
    this.channelAccessAgreementInformation = channelAccessAgreementInformation;
  }

  public Account contract(Object contract) {
    this.contract = contract;
    return this;
  }

  /**
   * Data structure containing contract information
   * @return contract
  **/
  @ApiModelProperty(value = "Data structure containing contract information")


  public Object getContract() {
    return contract;
  }

  public void setContract(Object contract) {
    this.contract = contract;
  }

  public Account statusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Get statusInfo
   * @return statusInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StatusInfo getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(StatusInfo statusInfo) {
    this.statusInfo = statusInfo;
  }

  public Account balances(AccountBalances balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountBalances getBalances() {
    return balances;
  }

  public void setBalances(AccountBalances balances) {
    this.balances = balances;
  }

  public Account bankId(String bankId) {
    this.bankId = bankId;
    return this;
  }

  /**
   * Unique bank ID
   * @return bankId
  **/
  @ApiModelProperty(value = "Unique bank ID")


  public String getBankId() {
    return bankId;
  }

  public void setBankId(String bankId) {
    this.bankId = bankId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.accountIdentification, account.accountIdentification) &&
        Objects.equals(this.channelAccessAgreementInformation, account.channelAccessAgreementInformation) &&
        Objects.equals(this.contract, account.contract) &&
        Objects.equals(this.statusInfo, account.statusInfo) &&
        Objects.equals(this.balances, account.balances) &&
        Objects.equals(this.bankId, account.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountIdentification, channelAccessAgreementInformation, contract, statusInfo, balances, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountIdentification: ").append(toIndentedString(accountIdentification)).append("\n");
    sb.append("    channelAccessAgreementInformation: ").append(toIndentedString(channelAccessAgreementInformation)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
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

