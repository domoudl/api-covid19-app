package projetws.api.apicovid19app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetws.api.apicovid19app.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
