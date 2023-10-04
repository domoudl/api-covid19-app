package projetws.api.apicovid19app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetws.api.apicovid19app.entity.LieuMedical;

public interface LieuMedicalRepository extends JpaRepository<LieuMedical,Integer> {
}
