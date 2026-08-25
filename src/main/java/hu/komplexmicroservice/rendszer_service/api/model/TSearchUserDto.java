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
 * TSearchUserDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T20:07:01.862170223+02:00[Europe/Budapest]")
public class TSearchUserDto {

  @JsonProperty("userid")
  private JsonNullable<Object> userid = JsonNullable.undefined();

  public TSearchUserDto userid(Object userid) {
    this.userid = JsonNullable.of(userid);
    return this;
  }

  /**
   * Get userid
   * @return userid
  */
  
  @Schema(name = "userid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getUserid() {
    return userid;
  }

  public void setUserid(JsonNullable<Object> userid) {
    this.userid = userid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TSearchUserDto tsearchUserDto = (TSearchUserDto) o;
    return equalsNullable(this.userid, tsearchUserDto.userid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(userid));
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
    sb.append("class TSearchUserDto {\n");
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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

