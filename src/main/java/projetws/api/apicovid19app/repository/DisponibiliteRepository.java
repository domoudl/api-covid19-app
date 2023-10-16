package projetws.api.apicovid19app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetws.api.apicovid19app.entity.Disponibilite;

public interface DisponibiliteRepository extends JpaRepository<Disponibilite,Integer> {
}
