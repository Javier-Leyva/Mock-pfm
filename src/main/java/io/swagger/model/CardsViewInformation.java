package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CardViewDetails;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing card information
 */
@ApiModel(description = "Data structure containing card information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class CardsViewInformation   {
  @JsonProperty("presentationOrderPoducts")
  private Integer presentationOrderPoducts = null;

  @JsonProperty("cards")
  @Valid
  private List<CardViewDetails> cards = null;

  public CardsViewInformation presentationOrderPoducts(Integer presentationOrderPoducts) {
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

  public CardsViewInformation cards(List<CardViewDetails> cards) {
    this.cards = cards;
    return this;
  }

  public CardsViewInformation addCardsItem(CardViewDetails cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<CardViewDetails>();
    }
    this.cards.add(cardsItem);
    return this;
  }

  /**
   * Array of cards
   * @return cards
  **/
  @ApiModelProperty(value = "Array of cards")

  @Valid

  public List<CardViewDetails> getCards() {
    return cards;
  }

  public void setCards(List<CardViewDetails> cards) {
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
    CardsViewInformation cardsViewInformation = (CardsViewInformation) o;
    return Objects.equals(this.presentationOrderPoducts, cardsViewInformation.presentationOrderPoducts) &&
        Objects.equals(this.cards, cardsViewInformation.cards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presentationOrderPoducts, cards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardsViewInformation {\n");
    
    sb.append("    presentationOrderPoducts: ").append(toIndentedString(presentationOrderPoducts)).append("\n");
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

