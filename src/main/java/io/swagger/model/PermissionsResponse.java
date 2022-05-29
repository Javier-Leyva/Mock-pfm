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
 * PermissionsResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-29T14:50:26.211Z")


public class PermissionsResponse   {
  @JsonProperty("application")
  private String application = null;

  @JsonProperty("redirect")
  private String redirect = null;

  public PermissionsResponse application(String application) {
    this.application = application;
    return this;
  }

  /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(value = "")


  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public PermissionsResponse redirect(String redirect) {
    this.redirect = redirect;
    return this;
  }

  /**
   * Get redirect
   * @return redirect
  **/
  @ApiModelProperty(value = "")


  public String getRedirect() {
    return redirect;
  }

  public void setRedirect(String redirect) {
    this.redirect = redirect;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionsResponse permissionsResponse = (PermissionsResponse) o;
    return Objects.equals(this.application, permissionsResponse.application) &&
        Objects.equals(this.redirect, permissionsResponse.redirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application, redirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionsResponse {\n");
    
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
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

