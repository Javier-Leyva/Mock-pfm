package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import io.swagger.model.CardBalances;
import io.swagger.model.Expiration;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing card details
 */
@ApiModel(description = "Data structure containing card details")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class Card   {
  @JsonProperty("cardId")
  private String cardId = null;

  @JsonProperty("cardIdentification")
  private Object cardIdentification = null;

  @JsonProperty("channelAccessAgreementInformation")
  private Object channelAccessAgreementInformation = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("typeCode")
  private String typeCode = null;

  @JsonProperty("typeDescription")
  private String typeDescription = null;

  @JsonProperty("isOperable")
  private Boolean isOperable = null;

  @JsonProperty("embossing")
  private Object embossing = null;

  @JsonProperty("embossing2")
  private Object embossing2 = null;

  @JsonProperty("isRoamingActive")
  private Boolean isRoamingActive = null;

  @JsonProperty("isWalletAllowed")
  private Boolean isWalletAllowed = null;

  @JsonProperty("statusInfo")
  private Object statusInfo = null;

  @JsonProperty("expiration")
  private Expiration expiration = null;

  @JsonProperty("balances")
  private CardBalances balances = null;

  @JsonProperty("creditLimit")
  private Amount creditLimit = null;

  @JsonProperty("bankId")
  private String bankId = null;

  public Card cardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Card ID that is used to uniquely identify the card in card-related operations. For internal use, the value does not require tokenization.  The value is usually the same as the card number.
   * @return cardId
  **/
  @ApiModelProperty(example = "4547420008209985", value = "Card ID that is used to uniquely identify the card in card-related operations. For internal use, the value does not require tokenization.  The value is usually the same as the card number.")


  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public Card cardIdentification(Object cardIdentification) {
    this.cardIdentification = cardIdentification;
    return this;
  }

  /**
   * Data structure containing identification information for a card
   * @return cardIdentification
  **/
  @ApiModelProperty(value = "Data structure containing identification information for a card")


  public Object getCardIdentification() {
    return cardIdentification;
  }

  public void setCardIdentification(Object cardIdentification) {
    this.cardIdentification = cardIdentification;
  }

  public Card channelAccessAgreementInformation(Object channelAccessAgreementInformation) {
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

  public Card type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Card type that defines the operations for which it can be used
   * @return type
  **/
  @ApiModelProperty(example = "CREDIT CARD", value = "Card type that defines the operations for which it can be used")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Card typeCode(String typeCode) {
    this.typeCode = typeCode;
    return this;
  }

  /**
   * Card type code
   * @return typeCode
  **/
  @ApiModelProperty(example = "01", value = "Card type code")


  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public Card typeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
    return this;
  }

  /**
   * Card type description
   * @return typeDescription
  **/
  @ApiModelProperty(example = "Visa Oro 123", value = "Card type description")


  public String getTypeDescription() {
    return typeDescription;
  }

  public void setTypeDescription(String typeDescription) {
    this.typeDescription = typeDescription;
  }

  public Card isOperable(Boolean isOperable) {
    this.isOperable = isOperable;
    return this;
  }

  /**
   * Whether the card is operable and that the customer can use it
   * @return isOperable
  **/
  @ApiModelProperty(example = "true", value = "Whether the card is operable and that the customer can use it")


  public Boolean isIsOperable() {
    return isOperable;
  }

  public void setIsOperable(Boolean isOperable) {
    this.isOperable = isOperable;
  }

  public Card embossing(Object embossing) {
    this.embossing = embossing;
    return this;
  }

  /**
   * Data structure containing information embossed on the card
   * @return embossing
  **/
  @ApiModelProperty(value = "Data structure containing information embossed on the card")


  public Object getEmbossing() {
    return embossing;
  }

  public void setEmbossing(Object embossing) {
    this.embossing = embossing;
  }

  public Card embossing2(Object embossing2) {
    this.embossing2 = embossing2;
    return this;
  }

  /**
   * Data structure containing information embossed on the card. Poland requies a second field (emboss2) just for long names when emboss1 is not enought
   * @return embossing2
  **/
  @ApiModelProperty(value = "Data structure containing information embossed on the card. Poland requies a second field (emboss2) just for long names when emboss1 is not enought")


  public Object getEmbossing2() {
    return embossing2;
  }

  public void setEmbossing2(Object embossing2) {
    this.embossing2 = embossing2;
  }

  public Card isRoamingActive(Boolean isRoamingActive) {
    this.isRoamingActive = isRoamingActive;
    return this;
  }

  /**
   * Whether roaming is enabled
   * @return isRoamingActive
  **/
  @ApiModelProperty(example = "true", value = "Whether roaming is enabled")


  public Boolean isIsRoamingActive() {
    return isRoamingActive;
  }

  public void setIsRoamingActive(Boolean isRoamingActive) {
    this.isRoamingActive = isRoamingActive;
  }

  public Card isWalletAllowed(Boolean isWalletAllowed) {
    this.isWalletAllowed = isWalletAllowed;
    return this;
  }

  /**
   * Whether the card can be used with wallet apps
   * @return isWalletAllowed
  **/
  @ApiModelProperty(example = "true", value = "Whether the card can be used with wallet apps")


  public Boolean isIsWalletAllowed() {
    return isWalletAllowed;
  }

  public void setIsWalletAllowed(Boolean isWalletAllowed) {
    this.isWalletAllowed = isWalletAllowed;
  }

  public Card statusInfo(Object statusInfo) {
    this.statusInfo = statusInfo;
    return this;
  }

  /**
   * Data structure containing information about the status of an item
   * @return statusInfo
  **/
  @ApiModelProperty(value = "Data structure containing information about the status of an item")


  public Object getStatusInfo() {
    return statusInfo;
  }

  public void setStatusInfo(Object statusInfo) {
    this.statusInfo = statusInfo;
  }

  public Card expiration(Expiration expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Expiration getExpiration() {
    return expiration;
  }

  public void setExpiration(Expiration expiration) {
    this.expiration = expiration;
  }

  public Card balances(CardBalances balances) {
    this.balances = balances;
    return this;
  }

  /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardBalances getBalances() {
    return balances;
  }

  public void setBalances(CardBalances balances) {
    this.balances = balances;
  }

  public Card creditLimit(Amount creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * Get creditLimit
   * @return creditLimit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Amount creditLimit) {
    this.creditLimit = creditLimit;
  }

  public Card bankId(String bankId) {
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
    Card card = (Card) o;
    return Objects.equals(this.cardId, card.cardId) &&
        Objects.equals(this.cardIdentification, card.cardIdentification) &&
        Objects.equals(this.channelAccessAgreementInformation, card.channelAccessAgreementInformation) &&
        Objects.equals(this.type, card.type) &&
        Objects.equals(this.typeCode, card.typeCode) &&
        Objects.equals(this.typeDescription, card.typeDescription) &&
        Objects.equals(this.isOperable, card.isOperable) &&
        Objects.equals(this.embossing, card.embossing) &&
        Objects.equals(this.embossing2, card.embossing2) &&
        Objects.equals(this.isRoamingActive, card.isRoamingActive) &&
        Objects.equals(this.isWalletAllowed, card.isWalletAllowed) &&
        Objects.equals(this.statusInfo, card.statusInfo) &&
        Objects.equals(this.expiration, card.expiration) &&
        Objects.equals(this.balances, card.balances) &&
        Objects.equals(this.creditLimit, card.creditLimit) &&
        Objects.equals(this.bankId, card.bankId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardId, cardIdentification, channelAccessAgreementInformation, type, typeCode, typeDescription, isOperable, embossing, embossing2, isRoamingActive, isWalletAllowed, statusInfo, expiration, balances, creditLimit, bankId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    cardIdentification: ").append(toIndentedString(cardIdentification)).append("\n");
    sb.append("    channelAccessAgreementInformation: ").append(toIndentedString(channelAccessAgreementInformation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    typeDescription: ").append(toIndentedString(typeDescription)).append("\n");
    sb.append("    isOperable: ").append(toIndentedString(isOperable)).append("\n");
    sb.append("    embossing: ").append(toIndentedString(embossing)).append("\n");
    sb.append("    embossing2: ").append(toIndentedString(embossing2)).append("\n");
    sb.append("    isRoamingActive: ").append(toIndentedString(isRoamingActive)).append("\n");
    sb.append("    isWalletAllowed: ").append(toIndentedString(isWalletAllowed)).append("\n");
    sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
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

