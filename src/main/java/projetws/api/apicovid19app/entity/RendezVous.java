package projetws.api.apicovid19app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import projetws.api.apicovid19app.enums.TypeLieuMedical;
import projetws.api.apicovid19app.enums.TypeRendezVous;

import java.time.LocalDateTime;

@Entity
@Table
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @ManyToOne
    @JoinColumn(name = "lieu_medical_id")
    @Getter
    @Setter
    private LieuMedical lieuMedical; // Lieu médical associé au rendez-vous

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @Getter
    @Setter
    private Patient patient; // Patient ayant pris rendez-vous

    @Getter
    @Setter
    private LocalDateTime date_Heure; // Date et heure du rendez-vous

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private TypeRendezVous type;

    public RendezVous(int id, LieuMedical lieuMedical, Patient patient, LocalDateTime dateHeure, TypeRendezVous type) {
        this.id = id;
        this.lieuMedical = lieuMedical;
        this.patient = patient;
        this.date_Heure = dateHeure;
        this.type = type;
    }

    public RendezVous(){

    }
}
