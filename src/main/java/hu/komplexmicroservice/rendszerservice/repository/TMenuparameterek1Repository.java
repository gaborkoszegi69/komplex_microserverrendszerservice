package hu.komplexmicroservice.rendszerservice.repository;

import hu.komplexmicroservice.rendszerservice.model.QTMenuparameterek1;
import hu.komplexmicroservice.rendszerservice.model.TMenuparameterek1;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TMenuparameterek1Repository   extends JpaRepository<TMenuparameterek1, Long>,
        JpaSpecificationExecutor<TMenuparameterek1>,
        QuerydslPredicateExecutor<TMenuparameterek1>,
        QuerydslBinderCustomizer<QTMenuparameterek1> {

    @Override
    default void customize(QuerydslBindings bindings, QTMenuparameterek1 TMenuparameterek1) {
        bindings.bind(TMenuparameterek1.menuprm_name).first((path, value) -> path.startsWithIgnoreCase(value));
    }
    @NativeQuery("SELECT Menuparameterek.* FROM \"01_sys\".get_menuparameterek_1 (:menuId) Menuparameterek")
    List<TMenuparameterek1> findByMenuId(int menuId);
}
