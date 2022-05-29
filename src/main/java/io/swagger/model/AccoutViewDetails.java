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
 * Data structure containing account information
 */
@ApiModel(description = "Data structure containing account information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class AccoutViewDetails   {
  @JsonProperty("bankId")
  private String bankId = null;

  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  public AccoutViewDetails bankId(String bankId) {
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

  public AccoutViewDetails accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account number.  The value uses the format defined in 'accountIdType'.
   * @return accountId
  **/
  @ApiModelProperty(example = "abcdefghijklmnopqrstuvwxyz", value = "Account number.  The value uses the format defined in 'accountIdType'.")


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccoutViewDetails channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccoutViewDetails accoutViewDetails = (AccoutViewDetails) o;
    return Objects.equals(this.bankId, accoutViewDetails.bankId) &&
        Objects.equals(this.accountId, accoutViewDetails.accountId) &&
        Objects.equals(this.channelAccessAgreementInformation, accoutViewDetails.channelAccessAgreementInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankId, accountId, channelAccessAgreementInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccoutViewDetails {\n");
    
    sb.append("    bankId: ").append(toIndentedString(bankId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    channelAccessAgreementInformation: ").append(toIndentedString(channelAccessAgreementInformation)).append("\n");
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

