package projetws.api.apicovid19app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetws.api.apicovid19app.entity.RendezVous;

public interface RendezVousRepository extends JpaRepository<RendezVous,Integer> {
}
