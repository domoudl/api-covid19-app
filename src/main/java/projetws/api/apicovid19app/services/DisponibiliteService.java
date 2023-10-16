package projetws.api.apicovid19app.services;

import org.springframework.stereotype.Service;
import projetws.api.apicovid19app.entity.Disponibilite;
import projetws.api.apicovid19app.repository.DisponibiliteRepository;

import java.util.List;

@Service
public class DisponibiliteService {

    private DisponibiliteRepository disponibiliteRepository;

    public DisponibiliteService(DisponibiliteRepository disponibiliteRepository) {
        this.disponibiliteRepository = disponibiliteRepository;
    }

    public List<Disponibilite> getAllDisponibilite() {
        return disponibiliteRepository.findAll();
    }

}
