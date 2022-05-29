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
 * ProductDataDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class ProductDataDto   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("contractNumber")
  private String contractNumber = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("contractCode")
  private String contractCode = null;

  @JsonProperty("balance")
  private String balance = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("cardType")
  private String cardType = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("productName")
  private String productName = null;

  @JsonProperty("lastUpdate")
  private String lastUpdate = null;

  @JsonProperty("selected")
  private Boolean selected = null;

  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("statusCode")
  private String statusCode = null;

  public ProductDataDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductDataDto contractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
    return this;
  }

  /**
   * Get contractNumber
   * @return contractNumber
  **/
  @ApiModelProperty(value = "")


  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }

  public ProductDataDto iban(String iban) {
    this.iban = iban;
    return this;
  }

  /**
   * Get iban
   * @return iban
  **/
  @ApiModelProperty(value = "")


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public ProductDataDto contractCode(String contractCode) {
    this.contractCode = contractCode;
    return this;
  }

  /**
   * Get contractCode
   * @return contractCode
  **/
  @ApiModelProperty(value = "")


  public String getContractCode() {
    return contractCode;
  }

  public void setContractCode(String contractCode) {
    this.contractCode = contractCode;
  }

  public ProductDataDto balance(String balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")


  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public ProductDataDto currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public ProductDataDto cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(value = "")


  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public ProductDataDto cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public ProductDataDto productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(value = "")


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ProductDataDto lastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")


  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ProductDataDto selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * Get selected
   * @return selected
  **/
  @ApiModelProperty(value = "")


  public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public ProductDataDto enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ProductDataDto statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")


  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDataDto productDataDto = (ProductDataDto) o;
    return Objects.equals(this.id, productDataDto.id) &&
        Objects.equals(this.contractNumber, productDataDto.contractNumber) &&
        Objects.equals(this.iban, productDataDto.iban) &&
        Objects.equals(this.contractCode, productDataDto.contractCode) &&
        Objects.equals(this.balance, productDataDto.balance) &&
        Objects.equals(this.currency, productDataDto.currency) &&
        Objects.equals(this.cardType, productDataDto.cardType) &&
        Objects.equals(this.cardNumber, productDataDto.cardNumber) &&
        Objects.equals(this.productName, productDataDto.productName) &&
        Objects.equals(this.lastUpdate, productDataDto.lastUpdate) &&
        Objects.equals(this.selected, productDataDto.selected) &&
        Objects.equals(this.enabled, productDataDto.enabled) &&
        Objects.equals(this.statusCode, productDataDto.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contractNumber, iban, contractCode, balance, currency, cardType, cardNumber, productName, lastUpdate, selected, enabled, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDataDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    contractCode: ").append(toIndentedString(contractCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

