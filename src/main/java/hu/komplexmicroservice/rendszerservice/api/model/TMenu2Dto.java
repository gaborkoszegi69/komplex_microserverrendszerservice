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

  @JsonProperty("menu_id")
  private Long menuId = null;

  @JsonProperty("menu_gyoker")
  private Long menuGyoker = null;

  @JsonProperty("menu_gyokersorrend")
  private Long menuGyokersorrend = null;

  @JsonProperty("menu_title")
  private String menuTitle = null;

  @JsonProperty("menu_link")
  private String menuLink = null;

  @JsonProperty("menu_parentid")
  private Long menuParentid = null;

  @JsonProperty("menu_letre_felh_nev")
  private String menuLetreFelhNev = null;

  @JsonProperty("menu_letre_dat")
  private String menuLetreDat = null;

  @JsonProperty("menu_action")
  private String menuAction = null;

  @JsonProperty("menu_sorrend")
  private Long menuSorrend = null;

  @JsonProperty("menu_image_index")
  private Long menuImageIndex = null;

  @JsonProperty("menu_shortcut")
  private String menuShortcut = null;

  @JsonProperty("menu_hlevel")
  private Long menuHlevel = null;

  @JsonProperty("szrpfnk_uj_eng")
  private Boolean szrpfnkUjEng = null;

  @JsonProperty("szrpfnk_modositas_eng")
  private Boolean szrpfnkModositasEng = null;

  @JsonProperty("szrpfnk_visible_engs")
  private Boolean szrpfnkVisibleEngs = null;


}

