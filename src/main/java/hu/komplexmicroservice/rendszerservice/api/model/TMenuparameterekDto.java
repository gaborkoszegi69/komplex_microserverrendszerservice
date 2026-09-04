package hu.komplexmicroservice.rendszerservice.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.*;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * TMenuparameterekDto
 */

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T18:20:09.809915324+02:00[Europe/Budapest]")
public class TMenuparameterekDto {

  @JsonProperty("menuprm_id")
  private Long menuprmId = null;

  @JsonProperty("menuprm_menu_id")
  private Long menuprmMenuId = null;

  @JsonProperty("menuprm_name")
  private String menuprmName = null;

  @JsonProperty("menuprm_value")
  private String menuprmValue = null;

  @JsonProperty("menuprm_letre_felh_nev")
  private String menuprmLetreFelhNev = null;

  @JsonProperty("menuprm_letre_dat")
  private String menuprmLetreDat = null;

}

