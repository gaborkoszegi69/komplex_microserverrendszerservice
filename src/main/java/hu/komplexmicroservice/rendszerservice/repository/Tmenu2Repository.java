package hu.komplexmicroservice.rendszerservice.repository;

import hu.komplexmicroservice.rendszerservice.model.QTMenu2;
import hu.komplexmicroservice.rendszerservice.model.TMenu2;
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

public interface Tmenu2Repository   extends JpaRepository<TMenu2, Long>,
        JpaSpecificationExecutor<TMenu2>,
        QuerydslPredicateExecutor<TMenu2>,
        QuerydslBinderCustomizer<QTMenu2> {

    @Override
    default void customize(QuerydslBindings bindings, QTMenu2 tMenu2) {
        bindings.bind(tMenu2.menu_title).first((path, value) -> path.startsWithIgnoreCase(value));

    }


    @NativeQuery("SELECT  menu.* From \"01_sys\".get_menu_web_1  ( null::public.a_uuid_id_mut) menu ")
    public List<TMenu2> findTmenu2All();

    @NativeQuery("SELECT  menu.* FROM \"01_sys\".get_menu_web_1  ( null::public.a_uuid_id_mut) menu ")
    List<TMenu2> findAllWithTmenu2s(Pageable pageable);

    @NativeQuery("SELECT  menu.* FROM \"01_sys\".get_menu_web_1  ( null::public.a_uuid_id_mut) menu WHERE menu.menu_id IN :ids")
    List<TMenu2> findByIdWithArrivals(List<Long> ids);

    @NativeQuery("SELECT  menu.* FROM \"01_sys\".get_menu_web_1  ( null::public.a_uuid_id_mut) menu WHERE menu.menu_id IN :ids")
    List<TMenu2> findByIdWithDepartures(List<Long> ids, Sort sort);
    @NativeQuery("SELECT menu FROM \"01_sys\".get_menu_web_1  ( :id::public.a_uuid_id_mut) menu ")
    public List<TMenu2> findTMenu2ById(long id);
}

