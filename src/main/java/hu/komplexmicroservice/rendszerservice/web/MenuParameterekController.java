package hu.komplexmicroservice.rendszerservice.web;

import hu.komplexmicroservice.rendszerservice.api.MenuParameterekControllerApi;
import hu.komplexmicroservice.rendszerservice.mapper.Menuparameterek1Mapper;
import hu.komplexmicroservice.rendszerservice.model.TMenuparameterek1;
import hu.komplexmicroservice.rendszerservice.repository.TMenuparameterek1Repository;
import hu.komplexmicroservice.rendszerservice.service.RendszerService;
import hu.komplexmicroservice.rendszerservice.api.model.TMenuparameterekDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class MenuParameterekController implements MenuParameterekControllerApi {
    private final NativeWebRequest nativeWebRequest;
    private final RendszerService rendszerServicer;
    private final Menuparameterek1Mapper menuparameterek1Mapper;
    private final TMenuparameterek1Repository tMenuparameterek1Repository;
    private final PageableHandlerMethodArgumentResolver pageableResolver;
    private final MethodArgumentResolverHelper resolverHelper;
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.of(nativeWebRequest);
    }
    public void configPageable(@SortDefault("menu_title") Pageable pageable) {
        // This method is intentionally left empty. It serves as a placeholder for pageable configuration.
    }
    @Override
    public ResponseEntity<List<TMenuparameterekDto>> getmenuParameterek(int menuId) {
        List<TMenuparameterek1> TMenuparameterek1s = rendszerServicer.findByMenuId(menuId);
        return ResponseEntity.ok(menuparameterek1Mapper.TMenuparametereksToDtos(TMenuparameterek1s));
    }
}
