package projetws.api.apicovid19app.services;

import org.springframework.stereotype.Service;
import projetws.api.apicovid19app.entity.Patient;
import projetws.api.apicovid19app.repository.PatientRepository;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


//    public Patient findPatientByNomAndNumeroTelephone(String nom, String numeroTelephone) {
//        return patientRepository.findByNomAndNumeroTelephone(nom,numeroTelephone);
//    }
}
