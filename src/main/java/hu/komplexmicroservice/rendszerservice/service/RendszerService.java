package hu.komplexmicroservice.rendszerservice.service;

import hu.komplexmicroservice.rendszerservice.model.TMenu2;
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
    public List<TMenu2> findTmenu2All() {
        return  tmenu2Repository.findTmenu2All();
    }
    @Transactional
    //	@Cacheable("pagedRendszerDbkapcsolatokWithRelationships")
    public List<TMenu2> findAllWithTmenu2s(Pageable pageable) {
//		List<Airport> airports = airportRepository.findAllWithAddressAndDepartures(pageable); --> in memory lapozás, minden sor bejön a DB-ből
//		airports = airportRepository.findAllWithArrivals(pageable);

        List<TMenu2> TMenu2s = tmenu2Repository.findAllWithTmenu2s(pageable);
        List<Long> TMenu2Ids = TMenu2s.stream().map(TMenu2::getMenu_id).toList();

        TMenu2s = tmenu2Repository.findByIdWithArrivals(TMenu2Ids);


        TMenu2s = tmenu2Repository.findByIdWithDepartures(TMenu2Ids, pageable.getSort());
        return TMenu2s;
    }
    public List<TMenu2> findById(Long id){
        return tmenu2Repository.findTMenu2ById(id);
    }
    public List<TMenu2> findByUserId(UUID userId){
        return tmenu2Repository.findByUserId(userId);
    }



}
