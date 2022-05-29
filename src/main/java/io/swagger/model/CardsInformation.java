package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CardWithLinks;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Data structure containing information broken down to card level.
 */
@ApiModel(description = "Data structure containing information broken down to card level.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class CardsInformation   {
  @JsonProperty("list")
  @Valid
  private List<CardWithLinks> _list = null;

  public CardsInformation _list(List<CardWithLinks> _list) {
    this._list = _list;
    return this;
  }

  public CardsInformation addListItem(CardWithLinks _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<CardWithLinks>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Array of cards.
   * @return _list
  **/
  @ApiModelProperty(value = "Array of cards.")

  @Valid

  public List<CardWithLinks> getList() {
    return _list;
  }

  public void setList(List<CardWithLinks> _list) {
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
    CardsInformation cardsInformation = (CardsInformation) o;
    return Objects.equals(this._list, cardsInformation._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardsInformation {\n");
    
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

