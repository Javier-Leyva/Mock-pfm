package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Card;
import io.swagger.model.CardDetailsLink;
import io.swagger.model.CardStatementsListLink;
import io.swagger.model.CardTransactionsListLink;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing card information and interest links.
 */
@ApiModel(description = "Data structure containing card information and interest links.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class CardWithLinks   {
  @JsonProperty("card")
  private Card card = null;

  @JsonProperty("cardDetailsLink")
  private CardDetailsLink cardDetailsLink = null;

  @JsonProperty("statementsListLink")
  private CardStatementsListLink statementsListLink = null;

  @JsonProperty("transactionsListLink")
  private CardTransactionsListLink transactionsListLink = null;

  public CardWithLinks card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public CardWithLinks cardDetailsLink(CardDetailsLink cardDetailsLink) {
    this.cardDetailsLink = cardDetailsLink;
    return this;
  }

  /**
   * Get cardDetailsLink
   * @return cardDetailsLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardDetailsLink getCardDetailsLink() {
    return cardDetailsLink;
  }

  public void setCardDetailsLink(CardDetailsLink cardDetailsLink) {
    this.cardDetailsLink = cardDetailsLink;
  }

  public CardWithLinks statementsListLink(CardStatementsListLink statementsListLink) {
    this.statementsListLink = statementsListLink;
    return this;
  }

  /**
   * Get statementsListLink
   * @return statementsListLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardStatementsListLink getStatementsListLink() {
    return statementsListLink;
  }

  public void setStatementsListLink(CardStatementsListLink statementsListLink) {
    this.statementsListLink = statementsListLink;
  }

  public CardWithLinks transactionsListLink(CardTransactionsListLink transactionsListLink) {
    this.transactionsListLink = transactionsListLink;
    return this;
  }

  /**
   * Get transactionsListLink
   * @return transactionsListLink
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardTransactionsListLink getTransactionsListLink() {
    return transactionsListLink;
  }

  public void setTransactionsListLink(CardTransactionsListLink transactionsListLink) {
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
    CardWithLinks cardWithLinks = (CardWithLinks) o;
    return Objects.equals(this.card, cardWithLinks.card) &&
        Objects.equals(this.cardDetailsLink, cardWithLinks.cardDetailsLink) &&
        Objects.equals(this.statementsListLink, cardWithLinks.statementsListLink) &&
        Objects.equals(this.transactionsListLink, cardWithLinks.transactionsListLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, cardDetailsLink, statementsListLink, transactionsListLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardWithLinks {\n");
    
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    cardDetailsLink: ").append(toIndentedString(cardDetailsLink)).append("\n");
    sb.append("    statementsListLink: ").append(toIndentedString(statementsListLink)).append("\n");
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

