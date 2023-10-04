package projetws.api.apicovid19app.entity;

import jakarta.persistence.*;
import projetws.api.apicovid19app.enums.TypeLieuMedical;
import projetws.api.apicovid19app.enums.TypeRendezVous;

import java.time.LocalDateTime;

@Entity
@Table
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "lieu_medical_id")
    private LieuMedical lieuMedical; // Lieu médical associé au rendez-vous

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient; // Patient ayant pris rendez-vous

    private LocalDateTime dateHeure; // Date et heure du rendez-vous

    @Enumerated(EnumType.STRING)
    private TypeRendezVous type;
}
