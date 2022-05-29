package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountsInformation;
import io.swagger.model.CardsInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing all the information related to the customer position.
 */
@ApiModel(description = "Data structure containing all the information related to the customer position.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class GetAggregationsResponse   {
  @JsonProperty("accounts")
  private AccountsInformation accounts = null;

  @JsonProperty("cards")
  private CardsInformation cards = null;

  public GetAggregationsResponse accounts(AccountsInformation accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountsInformation getAccounts() {
    return accounts;
  }

  public void setAccounts(AccountsInformation accounts) {
    this.accounts = accounts;
  }

  public GetAggregationsResponse cards(CardsInformation cards) {
    this.cards = cards;
    return this;
  }

  /**
   * Get cards
   * @return cards
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardsInformation getCards() {
    return cards;
  }

  public void setCards(CardsInformation cards) {
    this.cards = cards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAggregationsResponse getAggregationsResponse = (GetAggregationsResponse) o;
    return Objects.equals(this.accounts, getAggregationsResponse.accounts) &&
        Objects.equals(this.cards, getAggregationsResponse.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, cards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAggregationsResponse {\n");
    
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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

