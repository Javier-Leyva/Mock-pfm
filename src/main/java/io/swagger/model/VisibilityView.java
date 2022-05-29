package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountsViewInformation;
import io.swagger.model.CardsViewInformation;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing all the information related to the PFM view.
 */
@ApiModel(description = "Data structure containing all the information related to the PFM view.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class VisibilityView   {
  @JsonProperty("accountsView")
  private AccountsViewInformation accountsView = null;

  @JsonProperty("cardsView")
  private CardsViewInformation cardsView = null;

  public VisibilityView accountsView(AccountsViewInformation accountsView) {
    this.accountsView = accountsView;
    return this;
  }

  /**
   * Get accountsView
   * @return accountsView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public AccountsViewInformation getAccountsView() {
    return accountsView;
  }

  public void setAccountsView(AccountsViewInformation accountsView) {
    this.accountsView = accountsView;
  }

  public VisibilityView cardsView(CardsViewInformation cardsView) {
    this.cardsView = cardsView;
    return this;
  }

  /**
   * Get cardsView
   * @return cardsView
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CardsViewInformation getCardsView() {
    return cardsView;
  }

  public void setCardsView(CardsViewInformation cardsView) {
    this.cardsView = cardsView;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisibilityView visibilityView = (VisibilityView) o;
    return Objects.equals(this.accountsView, visibilityView.accountsView) &&
        Objects.equals(this.cardsView, visibilityView.cardsView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountsView, cardsView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisibilityView {\n");
    
    sb.append("    accountsView: ").append(toIndentedString(accountsView)).append("\n");
    sb.append("    cardsView: ").append(toIndentedString(cardsView)).append("\n");
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

