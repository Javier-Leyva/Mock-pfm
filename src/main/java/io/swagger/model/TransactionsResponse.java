package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Amount;
import io.swagger.model.TransactionDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransactionsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class TransactionsResponse   {
  @JsonProperty("transactionsTotal")
  private BigDecimal transactionsTotal = null;

  @JsonProperty("amountTotal")
  private Amount amountTotal = null;

  @JsonProperty("list")
  @Valid
  private List<TransactionDto> _list = null;

  @JsonProperty("_links")
  private Object links = null;

  public TransactionsResponse transactionsTotal(BigDecimal transactionsTotal) {
    this.transactionsTotal = transactionsTotal;
    return this;
  }

  /**
   * Total number of transactions not considering pagination.
   * @return transactionsTotal
  **/
  @ApiModelProperty(value = "Total number of transactions not considering pagination.")

  @Valid

  public BigDecimal getTransactionsTotal() {
    return transactionsTotal;
  }

  public void setTransactionsTotal(BigDecimal transactionsTotal) {
    this.transactionsTotal = transactionsTotal;
  }

  public TransactionsResponse amountTotal(Amount amountTotal) {
    this.amountTotal = amountTotal;
    return this;
  }

  /**
   * Get amountTotal
   * @return amountTotal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Amount getAmountTotal() {
    return amountTotal;
  }

  public void setAmountTotal(Amount amountTotal) {
    this.amountTotal = amountTotal;
  }

  public TransactionsResponse _list(List<TransactionDto> _list) {
    this._list = _list;
    return this;
  }

  public TransactionsResponse addListItem(TransactionDto _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<TransactionDto>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Array of TransactionDto
   * @return _list
  **/
  @ApiModelProperty(value = "Array of TransactionDto")

  @Valid

  public List<TransactionDto> getList() {
    return _list;
  }

  public void setList(List<TransactionDto> _list) {
    this._list = _list;
  }

  public TransactionsResponse links(Object links) {
    this.links = links;
    return this;
  }

  /**
   * Pagination browsing links
   * @return links
  **/
  @ApiModelProperty(example = "{\"_first\":{\"href\":\"http://www.host.com/crm/pfm/view/category/transactions?_offset=1\"},\"_next\":{\"href\":\"http://www.host.com/crm/pfm/view/category/transactions?_offset=3\"},\"_prev\":{\"href\":\"http://www.host.com/crm/pfm/view/category/transactions?_offset=1\"},\"_last\":{\"href\":\"http://www.host.com/crm/pfm/view/category/transactions?_offset=99\"}}", value = "Pagination browsing links")


  public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsResponse transactionsResponse = (TransactionsResponse) o;
    return Objects.equals(this.transactionsTotal, transactionsResponse.transactionsTotal) &&
        Objects.equals(this.amountTotal, transactionsResponse.amountTotal) &&
        Objects.equals(this._list, transactionsResponse._list) &&
        Objects.equals(this.links, transactionsResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionsTotal, amountTotal, _list, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsResponse {\n");
    
    sb.append("    transactionsTotal: ").append(toIndentedString(transactionsTotal)).append("\n");
    sb.append("    amountTotal: ").append(toIndentedString(amountTotal)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

