package ads.org.gestcamionsservices.services;

import ads.org.gestcamionsservices.entities.Camion;
import ads.org.gestcamionsservices.repositories.CamionRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CamionService {
    @Autowired
    private CamionRepository camionRepository;


    public Iterable<Camion> getAllCamions(){
        return camionRepository.findAll();
    }

    public Camion getCamionById(Long id){
        return  camionRepository.findById(id).orElse(null);
    }



    }





