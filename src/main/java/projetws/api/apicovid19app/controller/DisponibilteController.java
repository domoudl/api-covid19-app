package projetws.api.apicovid19app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projetws.api.apicovid19app.entity.Disponibilite;
import projetws.api.apicovid19app.services.DisponibiliteService;

import java.util.List;

@RestController
@RequestMapping(path = "Disponibilite")
public class DisponibilteController {

    private DisponibiliteService disponibiliteService;

    public DisponibilteController(DisponibiliteService disponibiliteService) {
        this.disponibiliteService = disponibiliteService;
    }

    @GetMapping
    public List<Disponibilite> getAllDisponibilite() {
        return disponibiliteService.getAllDisponibilite();
    }

}
