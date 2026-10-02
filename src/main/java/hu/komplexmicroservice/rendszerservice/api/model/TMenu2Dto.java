package hu.komplexmicroservice.rendszerservice.api.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import lombok.*;
import java.util.*;
import jakarta.annotation.Generated;

/**
 * TMenu2Dto
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
public class TMenu2Dto {

  private Long menu_id;

  private String menu_gyoker;

  private Long menu_gyokersorrend;

  private String menu_title;

  private String menu_link;

  private Long menu_parentid;

  private String menu_letre_felh_nev;

  private String menu_letre_dat;

  private String menu_action;

  private Long menu_sorrend;

  private Long menu_image_index;

  private String menu_shortcut;

  private Long menu_hlevel;

  private Boolean szrpfnk_uj_eng;

  private Boolean szrpfnk_modositas_eng;

  private Boolean szrpfnk_torles_eng;

  private Boolean szrpfnk_visible_eng;
}

