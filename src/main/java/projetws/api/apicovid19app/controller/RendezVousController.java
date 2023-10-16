package projetws.api.apicovid19app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetws.api.apicovid19app.entity.RendezVous;
import projetws.api.apicovid19app.services.RendezVousService;

@RestController
@RequestMapping(path = "RendezVous")
public class RendezVousController {

    private RendezVousService rendezVousService;

    public RendezVousController(RendezVousService rendezVousService) {
        this.rendezVousService = rendezVousService;
    }

    @PostMapping
    public ResponseEntity<RendezVous> createRendezVous(@RequestBody RendezVous rendezVous) {
        // Ton service doit gérer la création de RendezVous et de Patient en même temps
        RendezVous savedRendezVous = rendezVousService.createRendezVous(rendezVous);
        return new ResponseEntity<>(savedRendezVous, HttpStatus.CREATED);
    }

}
