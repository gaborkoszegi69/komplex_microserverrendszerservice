package hu.komplexmicroservice.rendszerservice.service;

import hu.komplexmicroservice.rendszerservice.model.TMenu2;
import hu.komplexmicroservice.rendszerservice.model.TMenuparameterek1;
import hu.komplexmicroservice.rendszerservice.repository.TMenuparameterek1Repository;
import hu.komplexmicroservice.rendszerservice.repository.Tmenu2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.ContentHandler;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RendszerService {
    @Autowired
    private Tmenu2Repository tmenu2Repository;
    @Autowired
    private TMenuparameterek1Repository tmenuparameterek1Repository;

    @Transactional
    public List<TMenu2> findByUserId(UUID userId){
        return tmenu2Repository.findByUserId(userId);

    }
    @Transactional
    public List<TMenuparameterek1> findByMenuId(int menuId){
        return tmenuparameterek1Repository.findByMenuId(menuId);
    }
}
