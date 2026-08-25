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
 * TSearchMenuparameterekDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T20:07:01.862170223+02:00[Europe/Budapest]")
public class TSearchMenuparameterekDto {

  @JsonProperty("menu_id")
  private JsonNullable<Object> menuId = JsonNullable.undefined();

  public TSearchMenuparameterekDto menuId(Object menuId) {
    this.menuId = JsonNullable.of(menuId);
    return this;
  }

  /**
   * Get menuId
   * @return menuId
  */
  
  @Schema(name = "menu_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuId() {
    return menuId;
  }

  public void setMenuId(JsonNullable<Object> menuId) {
    this.menuId = menuId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TSearchMenuparameterekDto tsearchMenuparameterekDto = (TSearchMenuparameterekDto) o;
    return equalsNullable(this.menuId, tsearchMenuparameterekDto.menuId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(menuId));
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
    sb.append("class TSearchMenuparameterekDto {\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
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

