package projetws.api.apicovid19app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import projetws.api.apicovid19app.entity.LieuMedical;
import projetws.api.apicovid19app.repository.LieuMedicalRepository;

import java.util.List;

@Service
public class LieuMedicalService {


    private LieuMedicalRepository lieuMedicalRepository;
    public LieuMedicalService(LieuMedicalRepository lieuMedicalRepository) {
        this.lieuMedicalRepository = lieuMedicalRepository;
    }

    public ResponseEntity<LieuMedical> createLieuMedical(LieuMedical lieuMedical){
        LieuMedical lieuMedical1 = lieuMedicalRepository.save(lieuMedical);
        return new ResponseEntity<>(lieuMedical1, HttpStatus.CREATED);
    }

    public List<LieuMedical> getAllLieuxMedicaux() {
        return lieuMedicalRepository.findAll();
    }
}
