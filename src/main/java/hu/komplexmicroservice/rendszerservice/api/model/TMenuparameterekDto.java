package hu.komplexmicroservice.rendszer_service.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TMenuparameterekDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T13:25:12.357900610+02:00[Europe/Budapest]")
public class TMenuparameterekDto {

  @JsonProperty("menuprm_id")
  private JsonNullable<Object> menuprmId = JsonNullable.undefined();

  @JsonProperty("menuprm_menu_id")
  private JsonNullable<Object> menuprmMenuId = JsonNullable.undefined();

  @JsonProperty("menuprm_name")
  private JsonNullable<Object> menuprmName = JsonNullable.undefined();

  @JsonProperty("menuprm_value")
  private JsonNullable<Object> menuprmValue = JsonNullable.undefined();

  @JsonProperty("menuprm_letre_felh_nev")
  private JsonNullable<Object> menuprmLetreFelhNev = JsonNullable.undefined();

  @JsonProperty("menuprm_letre_dat")
  private JsonNullable<Object> menuprmLetreDat = JsonNullable.undefined();

  public TMenuparameterekDto menuprmId(Object menuprmId) {
    this.menuprmId = JsonNullable.of(menuprmId);
    return this;
  }

  /**
   * Get menuprmId
   * @return menuprmId
  */
  
  @Schema(name = "menuprm_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuprmId() {
    return menuprmId;
  }

  public void setMenuprmId(JsonNullable<Object> menuprmId) {
    this.menuprmId = menuprmId;
  }

  public TMenuparameterekDto menuprmMenuId(Object menuprmMenuId) {
    this.menuprmMenuId = JsonNullable.of(menuprmMenuId);
    return this;
  }

  /**
   * Get menuprmMenuId
   * @return menuprmMenuId
  */
  
  @Schema(name = "menuprm_menu_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuprmMenuId() {
    return menuprmMenuId;
  }

  public void setMenuprmMenuId(JsonNullable<Object> menuprmMenuId) {
    this.menuprmMenuId = menuprmMenuId;
  }

  public TMenuparameterekDto menuprmName(Object menuprmName) {
    this.menuprmName = JsonNullable.of(menuprmName);
    return this;
  }

  /**
   * Get menuprmName
   * @return menuprmName
  */
  
  @Schema(name = "menuprm_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuprmName() {
    return menuprmName;
  }

  public void setMenuprmName(JsonNullable<Object> menuprmName) {
    this.menuprmName = menuprmName;
  }

  public TMenuparameterekDto menuprmValue(Object menuprmValue) {
    this.menuprmValue = JsonNullable.of(menuprmValue);
    return this;
  }

  /**
   * Get menuprmValue
   * @return menuprmValue
  */
  
  @Schema(name = "menuprm_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuprmValue() {
    return menuprmValue;
  }

  public void setMenuprmValue(JsonNullable<Object> menuprmValue) {
    this.menuprmValue = menuprmValue;
  }

  public TMenuparameterekDto menuprmLetreFelhNev(Object menuprmLetreFelhNev) {
    this.menuprmLetreFelhNev = JsonNullable.of(menuprmLetreFelhNev);
    return this;
  }

  /**
   * Get menuprmLetreFelhNev
   * @return menuprmLetreFelhNev
  */
  
  @Schema(name = "menuprm_letre_felh_nev", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuprmLetreFelhNev() {
    return menuprmLetreFelhNev;
  }

  public void setMenuprmLetreFelhNev(JsonNullable<Object> menuprmLetreFelhNev) {
    this.menuprmLetreFelhNev = menuprmLetreFelhNev;
  }

  public TMenuparameterekDto menuprmLetreDat(Object menuprmLetreDat) {
    this.menuprmLetreDat = JsonNullable.of(menuprmLetreDat);
    return this;
  }

  /**
   * Get menuprmLetreDat
   * @return menuprmLetreDat
  */
  
  @Schema(name = "menuprm_letre_dat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuprmLetreDat() {
    return menuprmLetreDat;
  }

  public void setMenuprmLetreDat(JsonNullable<Object> menuprmLetreDat) {
    this.menuprmLetreDat = menuprmLetreDat;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TMenuparameterekDto tmenuparameterekDto = (TMenuparameterekDto) o;
    return equalsNullable(this.menuprmId, tmenuparameterekDto.menuprmId) &&
        equalsNullable(this.menuprmMenuId, tmenuparameterekDto.menuprmMenuId) &&
        equalsNullable(this.menuprmName, tmenuparameterekDto.menuprmName) &&
        equalsNullable(this.menuprmValue, tmenuparameterekDto.menuprmValue) &&
        equalsNullable(this.menuprmLetreFelhNev, tmenuparameterekDto.menuprmLetreFelhNev) &&
        equalsNullable(this.menuprmLetreDat, tmenuparameterekDto.menuprmLetreDat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(menuprmId), hashCodeNullable(menuprmMenuId), hashCodeNullable(menuprmName), hashCodeNullable(menuprmValue), hashCodeNullable(menuprmLetreFelhNev), hashCodeNullable(menuprmLetreDat));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TMenuparameterekDto {\n");
    sb.append("    menuprmId: ").append(toIndentedString(menuprmId)).append("\n");
    sb.append("    menuprmMenuId: ").append(toIndentedString(menuprmMenuId)).append("\n");
    sb.append("    menuprmName: ").append(toIndentedString(menuprmName)).append("\n");
    sb.append("    menuprmValue: ").append(toIndentedString(menuprmValue)).append("\n");
    sb.append("    menuprmLetreFelhNev: ").append(toIndentedString(menuprmLetreFelhNev)).append("\n");
    sb.append("    menuprmLetreDat: ").append(toIndentedString(menuprmLetreDat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

