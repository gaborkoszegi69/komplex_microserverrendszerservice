package hu.komplexmicroservice.rendszerservice.web;
import hu.komplexmicroservice.rendszerservice.api.MenuControllerApi;
import hu.komplexmicroservice.rendszerservice.api.model.TMenu2Dto;
import hu.komplexmicroservice.rendszerservice.mapper.Menu2Mapper;
import hu.komplexmicroservice.rendszerservice.model.TMenu2;
import hu.komplexmicroservice.rendszerservice.repository.Tmenu2Repository;
import hu.komplexmicroservice.rendszerservice.service.RendszerService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.SortDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import static com.netflix.appinfo.EurekaAccept.full;

@RequiredArgsConstructor
@RestController
public class MenuController implements MenuControllerApi {

    private final NativeWebRequest nativeWebRequest;
    private final RendszerService rendszerServicer;
    private final Menu2Mapper menu2Mapper;
    private final Tmenu2Repository tmenu2Repository;
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
    public ResponseEntity<List<TMenu2Dto>> getMenuByUserId(
    @Parameter(name = "userid", description = "") @Valid @RequestParam(value = "userid", required = false) Long userid
    ) {
        List<hu.komplexmicroservice.rendszerservice.model.TMenu2> menu2s;
        List<TMenu2> TMenu2s = rendszerServicer.findById(userid);
        return ResponseEntity.ok(menu2Mapper.TMenu2sToDtos(TMenu2s));
    }

    private Pageable createPageable(String pageableConfigurerMethodName) {
        Method method;
        try {
            method = this.getClass().getMethod(pageableConfigurerMethodName, Pageable.class);
        } catch (NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        MethodParameter methodParameter = new MethodParameter(method, 0);
        ModelAndViewContainer mavContainer = null;
        WebDataBinderFactory binderFactory = null;
        Pageable pageable = pageableResolver.resolveArgument(methodParameter, mavContainer, nativeWebRequest, binderFactory);
        return pageable;
    }
}
