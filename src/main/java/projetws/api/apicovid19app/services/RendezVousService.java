package projetws.api.apicovid19app.services;

import org.springframework.stereotype.Service;
import projetws.api.apicovid19app.entity.Patient;
import projetws.api.apicovid19app.entity.RendezVous;
import projetws.api.apicovid19app.repository.PatientRepository;
import projetws.api.apicovid19app.repository.RendezVousRepository;

import java.time.LocalDateTime;

@Service
public class RendezVousService {


    private RendezVousRepository rendezVousRepository;
    private PatientService patientService;
    private PatientRepository patientRepository;

    public RendezVousService(RendezVousRepository rendezVousRepository, PatientRepository patientRepository,PatientService patientService) {
        this.rendezVousRepository = rendezVousRepository;
        this.patientRepository = patientRepository;
        this.patientService = patientService;
    }

    public RendezVous createRendezVous(RendezVous rendezVous) {
        // Tu dois créer un Patient en utilisant les données de rendezVous
        Patient patient = new Patient();
        patient.setNom(rendezVous.getPatient().getNom());
        patient.setPrenom(rendezVous.getPatient().getPrenom());
        patient.setNumero_telephone(rendezVous.getPatient().getNumero_telephone());
        patient.setAdresse(rendezVous.getPatient().getAdresse());

//        Patient existingPatient = patientService.findPatientByNomAndNumeroTelephone(rendezVous.getPatient().getNom(), rendezVous.getPatient().getNumero_telephone());
//        if (existingPatient != null) {
//            rendezVous.setPatient(existingPatient);}
//        else {
            Patient savedPatient = patientRepository.save(patient);
            rendezVous.setPatient(savedPatient);

//        }

        // Assigne le Patient créé à RendezVous
        rendezVous.setDate_Heure(LocalDateTime.now());

        // Sauvegarde le RendezVous en base de données
        return rendezVousRepository.save(rendezVous);
    }

}
