package projetws.api.apicovid19app.entity;

import jakarta.persistence.*;
import projetws.api.apicovid19app.enums.Statut;
import projetws.api.apicovid19app.enums.TypeRendezVous;

import java.time.LocalDate;

@Entity
@Table
public class Disponibilite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "structure_medical_id")
    private LieuMedical structureMedical; // La structure médicale associée à la disponibilité

    private LocalDate date; // La date de la disponibilité
//    private Integer dosesVaccinDisponibles; // Le nombre de doses de vaccin disponibles
//    private Integer testsDisponibles; // Le nombre de tests disponibles

    @Enumerated(EnumType.STRING)
    private Statut dosesVaccinDisponibles;

    @Enumerated(EnumType.STRING)
    private Statut testsDisponibles;
}
