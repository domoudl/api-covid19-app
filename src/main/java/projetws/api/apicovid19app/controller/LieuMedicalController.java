package projetws.api.apicovid19app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetws.api.apicovid19app.entity.LieuMedical;
import projetws.api.apicovid19app.services.LieuMedicalService;

import java.util.List;

@RestController
@RequestMapping(path = "LieuMedical")
public class LieuMedicalController {


    private LieuMedicalService lieuMedicalService;

    public LieuMedicalController(LieuMedicalService lieuMedicalService) {
        this.lieuMedicalService = lieuMedicalService;
    }

    @PostMapping
    public ResponseEntity<LieuMedical> createLieuMedical(@RequestBody LieuMedical lieuMedical) {
        return lieuMedicalService.createLieuMedical(lieuMedical);
    }

    @GetMapping
    public List<LieuMedical> getAllLieuxMedicaux() {
        return lieuMedicalService.getAllLieuxMedicaux();
    }
}
