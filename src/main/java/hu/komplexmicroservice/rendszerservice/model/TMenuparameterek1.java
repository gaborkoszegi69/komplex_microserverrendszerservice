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
public class TMenuparameterek1 {
    @Id
    @GeneratedValue
    @ToString.Include
    @EqualsAndHashCode.Include
    @Column(name = "menuprm_id")
    private Long menuprm_id;
    @Column(name = "menuprm_menu_id")
    private Long menuprm_menu_id;
    @Column(name = "menuprm_name")
    private String menuprm_name;
    @Column(name = "menuprm_value")
    private String menuprm_value;
    @Column(name = "menuprm_letre_felh_nev")
    private String menuprm_letrefelhnev;
    @Column(name = "menuprm_letre_dat")
    private String menuprm_letredat;
}

