package hu.komplexmicroservice.rendszerservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CompositeType;

@Getter
@Setter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(schema="01_sys", name = "t_menu_2")
public class TMenu2 {
    @Id
    @GeneratedValue
    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(name = "menu_id")
    private Long menu_id;

    @Column(name = "rdbcon_host")
    private String rdbconHost;

    @Column(name = "menu_gyoker")
    private String menu_gyoker;

    @Column(name = "menu_gyokersorrend")
    private String menu_gyokersorrend;

    @Column(name = "menu_title")
    private String menu_title;

    @Column(name = "menu_link")
    private String menu_link;

    @Column(name = "menu_parentid")
    private Long menu_parentid;

    @Column(name = "menu_letre_felh_nev")
    private String menu_letre_felh_nev;

    @Column(name = "menu_letre_dat")
    private String menu_letre_dat;

    @Column(name = "menu_action")
    private String menu_action;

    @Column(name = "menu_sorrend")
    private Long menu_sorrend;

    @Column(name = "menu_image_index")
    private Long menu_image_index;

    @Column(name = "menu_shortcut")
    private String menu_shortcut;

    @Column(name = "menu_hlevel")
    private Long menu_hlevel;

    @Column(name = "szrpfnk_uj_eng")
    private Boolean szrpfnk_uj_eng;

    @Column(name = "szrpfnk_modositas_eng")
    private Boolean szrpfnk_modositas_eng;

    @Column(name = "szrpfnk_torles_eng")
    private Boolean szrpfnk_torles_eng;

    @Column(name = "szrpfnk_visible_eng")
    private Boolean szrpfnk_visible_eng;



}
