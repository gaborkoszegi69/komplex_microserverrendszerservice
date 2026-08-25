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
 * TMenu2Dto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-25T20:07:01.862170223+02:00[Europe/Budapest]")
public class TMenu2Dto {

  @JsonProperty("menu_id")
  private JsonNullable<Object> menuId = JsonNullable.undefined();

  @JsonProperty("menu_gyoker")
  private JsonNullable<Object> menuGyoker = JsonNullable.undefined();

  @JsonProperty("menu_gyokersorrend")
  private JsonNullable<Object> menuGyokersorrend = JsonNullable.undefined();

  @JsonProperty("menu_title")
  private JsonNullable<Object> menuTitle = JsonNullable.undefined();

  @JsonProperty("menu_link")
  private JsonNullable<Object> menuLink = JsonNullable.undefined();

  @JsonProperty("menu_parentid")
  private JsonNullable<Object> menuParentid = JsonNullable.undefined();

  @JsonProperty("menu_letre_felh_nev")
  private JsonNullable<Object> menuLetreFelhNev = JsonNullable.undefined();

  @JsonProperty("menu_letre_dat")
  private JsonNullable<Object> menuLetreDat = JsonNullable.undefined();

  @JsonProperty("menu_action")
  private JsonNullable<Object> menuAction = JsonNullable.undefined();

  @JsonProperty("menu_sorrend")
  private JsonNullable<Object> menuSorrend = JsonNullable.undefined();

  @JsonProperty("menu_image_index")
  private JsonNullable<Object> menuImageIndex = JsonNullable.undefined();

  @JsonProperty("menu_shortcut")
  private JsonNullable<Object> menuShortcut = JsonNullable.undefined();

  @JsonProperty("menu_hlevel")
  private JsonNullable<Object> menuHlevel = JsonNullable.undefined();

  @JsonProperty("szrpfnk_uj_eng")
  private JsonNullable<Object> szrpfnkUjEng = JsonNullable.undefined();

  @JsonProperty("szrpfnk_modositas_eng")
  private JsonNullable<Object> szrpfnkModositasEng = JsonNullable.undefined();

  @JsonProperty("szrpfnk_visible_engs")
  private JsonNullable<Object> szrpfnkVisibleEngs = JsonNullable.undefined();

  public TMenu2Dto menuId(Object menuId) {
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

  public TMenu2Dto menuGyoker(Object menuGyoker) {
    this.menuGyoker = JsonNullable.of(menuGyoker);
    return this;
  }

  /**
   * Get menuGyoker
   * @return menuGyoker
  */
  
  @Schema(name = "menu_gyoker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuGyoker() {
    return menuGyoker;
  }

  public void setMenuGyoker(JsonNullable<Object> menuGyoker) {
    this.menuGyoker = menuGyoker;
  }

  public TMenu2Dto menuGyokersorrend(Object menuGyokersorrend) {
    this.menuGyokersorrend = JsonNullable.of(menuGyokersorrend);
    return this;
  }

  /**
   * Get menuGyokersorrend
   * @return menuGyokersorrend
  */
  
  @Schema(name = "menu_gyokersorrend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuGyokersorrend() {
    return menuGyokersorrend;
  }

  public void setMenuGyokersorrend(JsonNullable<Object> menuGyokersorrend) {
    this.menuGyokersorrend = menuGyokersorrend;
  }

  public TMenu2Dto menuTitle(Object menuTitle) {
    this.menuTitle = JsonNullable.of(menuTitle);
    return this;
  }

  /**
   * Get menuTitle
   * @return menuTitle
  */
  
  @Schema(name = "menu_title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuTitle() {
    return menuTitle;
  }

  public void setMenuTitle(JsonNullable<Object> menuTitle) {
    this.menuTitle = menuTitle;
  }

  public TMenu2Dto menuLink(Object menuLink) {
    this.menuLink = JsonNullable.of(menuLink);
    return this;
  }

  /**
   * Get menuLink
   * @return menuLink
  */
  
  @Schema(name = "menu_link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuLink() {
    return menuLink;
  }

  public void setMenuLink(JsonNullable<Object> menuLink) {
    this.menuLink = menuLink;
  }

  public TMenu2Dto menuParentid(Object menuParentid) {
    this.menuParentid = JsonNullable.of(menuParentid);
    return this;
  }

  /**
   * Get menuParentid
   * @return menuParentid
  */
  
  @Schema(name = "menu_parentid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuParentid() {
    return menuParentid;
  }

  public void setMenuParentid(JsonNullable<Object> menuParentid) {
    this.menuParentid = menuParentid;
  }

  public TMenu2Dto menuLetreFelhNev(Object menuLetreFelhNev) {
    this.menuLetreFelhNev = JsonNullable.of(menuLetreFelhNev);
    return this;
  }

  /**
   * Get menuLetreFelhNev
   * @return menuLetreFelhNev
  */
  
  @Schema(name = "menu_letre_felh_nev", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuLetreFelhNev() {
    return menuLetreFelhNev;
  }

  public void setMenuLetreFelhNev(JsonNullable<Object> menuLetreFelhNev) {
    this.menuLetreFelhNev = menuLetreFelhNev;
  }

  public TMenu2Dto menuLetreDat(Object menuLetreDat) {
    this.menuLetreDat = JsonNullable.of(menuLetreDat);
    return this;
  }

  /**
   * Get menuLetreDat
   * @return menuLetreDat
  */
  
  @Schema(name = "menu_letre_dat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuLetreDat() {
    return menuLetreDat;
  }

  public void setMenuLetreDat(JsonNullable<Object> menuLetreDat) {
    this.menuLetreDat = menuLetreDat;
  }

  public TMenu2Dto menuAction(Object menuAction) {
    this.menuAction = JsonNullable.of(menuAction);
    return this;
  }

  /**
   * Get menuAction
   * @return menuAction
  */
  
  @Schema(name = "menu_action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuAction() {
    return menuAction;
  }

  public void setMenuAction(JsonNullable<Object> menuAction) {
    this.menuAction = menuAction;
  }

  public TMenu2Dto menuSorrend(Object menuSorrend) {
    this.menuSorrend = JsonNullable.of(menuSorrend);
    return this;
  }

  /**
   * Get menuSorrend
   * @return menuSorrend
  */
  
  @Schema(name = "menu_sorrend", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuSorrend() {
    return menuSorrend;
  }

  public void setMenuSorrend(JsonNullable<Object> menuSorrend) {
    this.menuSorrend = menuSorrend;
  }

  public TMenu2Dto menuImageIndex(Object menuImageIndex) {
    this.menuImageIndex = JsonNullable.of(menuImageIndex);
    return this;
  }

  /**
   * Get menuImageIndex
   * @return menuImageIndex
  */
  
  @Schema(name = "menu_image_index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuImageIndex() {
    return menuImageIndex;
  }

  public void setMenuImageIndex(JsonNullable<Object> menuImageIndex) {
    this.menuImageIndex = menuImageIndex;
  }

  public TMenu2Dto menuShortcut(Object menuShortcut) {
    this.menuShortcut = JsonNullable.of(menuShortcut);
    return this;
  }

  /**
   * Get menuShortcut
   * @return menuShortcut
  */
  
  @Schema(name = "menu_shortcut", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuShortcut() {
    return menuShortcut;
  }

  public void setMenuShortcut(JsonNullable<Object> menuShortcut) {
    this.menuShortcut = menuShortcut;
  }

  public TMenu2Dto menuHlevel(Object menuHlevel) {
    this.menuHlevel = JsonNullable.of(menuHlevel);
    return this;
  }

  /**
   * Get menuHlevel
   * @return menuHlevel
  */
  
  @Schema(name = "menu_hlevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getMenuHlevel() {
    return menuHlevel;
  }

  public void setMenuHlevel(JsonNullable<Object> menuHlevel) {
    this.menuHlevel = menuHlevel;
  }

  public TMenu2Dto szrpfnkUjEng(Object szrpfnkUjEng) {
    this.szrpfnkUjEng = JsonNullable.of(szrpfnkUjEng);
    return this;
  }

  /**
   * Get szrpfnkUjEng
   * @return szrpfnkUjEng
  */
  
  @Schema(name = "szrpfnk_uj_eng", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getSzrpfnkUjEng() {
    return szrpfnkUjEng;
  }

  public void setSzrpfnkUjEng(JsonNullable<Object> szrpfnkUjEng) {
    this.szrpfnkUjEng = szrpfnkUjEng;
  }

  public TMenu2Dto szrpfnkModositasEng(Object szrpfnkModositasEng) {
    this.szrpfnkModositasEng = JsonNullable.of(szrpfnkModositasEng);
    return this;
  }

  /**
   * Get szrpfnkModositasEng
   * @return szrpfnkModositasEng
  */
  
  @Schema(name = "szrpfnk_modositas_eng", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getSzrpfnkModositasEng() {
    return szrpfnkModositasEng;
  }

  public void setSzrpfnkModositasEng(JsonNullable<Object> szrpfnkModositasEng) {
    this.szrpfnkModositasEng = szrpfnkModositasEng;
  }

  public TMenu2Dto szrpfnkVisibleEngs(Object szrpfnkVisibleEngs) {
    this.szrpfnkVisibleEngs = JsonNullable.of(szrpfnkVisibleEngs);
    return this;
  }

  /**
   * Get szrpfnkVisibleEngs
   * @return szrpfnkVisibleEngs
  */
  
  @Schema(name = "szrpfnk_visible_engs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getSzrpfnkVisibleEngs() {
    return szrpfnkVisibleEngs;
  }

  public void setSzrpfnkVisibleEngs(JsonNullable<Object> szrpfnkVisibleEngs) {
    this.szrpfnkVisibleEngs = szrpfnkVisibleEngs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TMenu2Dto tmenu2Dto = (TMenu2Dto) o;
    return equalsNullable(this.menuId, tmenu2Dto.menuId) &&
        equalsNullable(this.menuGyoker, tmenu2Dto.menuGyoker) &&
        equalsNullable(this.menuGyokersorrend, tmenu2Dto.menuGyokersorrend) &&
        equalsNullable(this.menuTitle, tmenu2Dto.menuTitle) &&
        equalsNullable(this.menuLink, tmenu2Dto.menuLink) &&
        equalsNullable(this.menuParentid, tmenu2Dto.menuParentid) &&
        equalsNullable(this.menuLetreFelhNev, tmenu2Dto.menuLetreFelhNev) &&
        equalsNullable(this.menuLetreDat, tmenu2Dto.menuLetreDat) &&
        equalsNullable(this.menuAction, tmenu2Dto.menuAction) &&
        equalsNullable(this.menuSorrend, tmenu2Dto.menuSorrend) &&
        equalsNullable(this.menuImageIndex, tmenu2Dto.menuImageIndex) &&
        equalsNullable(this.menuShortcut, tmenu2Dto.menuShortcut) &&
        equalsNullable(this.menuHlevel, tmenu2Dto.menuHlevel) &&
        equalsNullable(this.szrpfnkUjEng, tmenu2Dto.szrpfnkUjEng) &&
        equalsNullable(this.szrpfnkModositasEng, tmenu2Dto.szrpfnkModositasEng) &&
        equalsNullable(this.szrpfnkVisibleEngs, tmenu2Dto.szrpfnkVisibleEngs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(menuId), hashCodeNullable(menuGyoker), hashCodeNullable(menuGyokersorrend), hashCodeNullable(menuTitle), hashCodeNullable(menuLink), hashCodeNullable(menuParentid), hashCodeNullable(menuLetreFelhNev), hashCodeNullable(menuLetreDat), hashCodeNullable(menuAction), hashCodeNullable(menuSorrend), hashCodeNullable(menuImageIndex), hashCodeNullable(menuShortcut), hashCodeNullable(menuHlevel), hashCodeNullable(szrpfnkUjEng), hashCodeNullable(szrpfnkModositasEng), hashCodeNullable(szrpfnkVisibleEngs));
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
    sb.append("class TMenu2Dto {\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    menuGyoker: ").append(toIndentedString(menuGyoker)).append("\n");
    sb.append("    menuGyokersorrend: ").append(toIndentedString(menuGyokersorrend)).append("\n");
    sb.append("    menuTitle: ").append(toIndentedString(menuTitle)).append("\n");
    sb.append("    menuLink: ").append(toIndentedString(menuLink)).append("\n");
    sb.append("    menuParentid: ").append(toIndentedString(menuParentid)).append("\n");
    sb.append("    menuLetreFelhNev: ").append(toIndentedString(menuLetreFelhNev)).append("\n");
    sb.append("    menuLetreDat: ").append(toIndentedString(menuLetreDat)).append("\n");
    sb.append("    menuAction: ").append(toIndentedString(menuAction)).append("\n");
    sb.append("    menuSorrend: ").append(toIndentedString(menuSorrend)).append("\n");
    sb.append("    menuImageIndex: ").append(toIndentedString(menuImageIndex)).append("\n");
    sb.append("    menuShortcut: ").append(toIndentedString(menuShortcut)).append("\n");
    sb.append("    menuHlevel: ").append(toIndentedString(menuHlevel)).append("\n");
    sb.append("    szrpfnkUjEng: ").append(toIndentedString(szrpfnkUjEng)).append("\n");
    sb.append("    szrpfnkModositasEng: ").append(toIndentedString(szrpfnkModositasEng)).append("\n");
    sb.append("    szrpfnkVisibleEngs: ").append(toIndentedString(szrpfnkVisibleEngs)).append("\n");
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

