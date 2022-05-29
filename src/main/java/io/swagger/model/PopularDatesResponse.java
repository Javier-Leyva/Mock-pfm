package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PopularDateDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PopularDatesResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class PopularDatesResponse   {
  @JsonProperty("list")
  @Valid
  private List<PopularDateDto> _list = null;

  public PopularDatesResponse _list(List<PopularDateDto> _list) {
    this._list = _list;
    return this;
  }

  public PopularDatesResponse addListItem(PopularDateDto _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<PopularDateDto>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Array of PopularDates.
   * @return _list
  **/
  @ApiModelProperty(value = "Array of PopularDates.")

  @Valid

  public List<PopularDateDto> getList() {
    return _list;
  }

  public void setList(List<PopularDateDto> _list) {
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
    PopularDatesResponse popularDatesResponse = (PopularDatesResponse) o;
    return Objects.equals(this._list, popularDatesResponse._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopularDatesResponse {\n");
    
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

