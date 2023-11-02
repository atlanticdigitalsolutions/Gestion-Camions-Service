package ads.org.gestcamionsservices.controllers;

import ads.org.gestcamionsservices.Interface.IcamionService;
import ads.org.gestcamionsservices.entities.Camion;
import ads.org.gestcamionsservices.services.CamionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamionController {
    @Autowired
    private CamionService camionService;

    @GetMapping("/camions")
    public Iterable<Camion>  getAllCamions(){
        return camionService.getAllCamions();
    }

    @GetMapping("/camions/{id}")
    public Camion getCamionById(@PathVariable Long id){
        return camionService.getCamionById(id);
    }


}
