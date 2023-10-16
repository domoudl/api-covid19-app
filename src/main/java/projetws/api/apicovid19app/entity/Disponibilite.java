package projetws.api.apicovid19app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import projetws.api.apicovid19app.enums.Statut;
import projetws.api.apicovid19app.enums.TypeRendezVous;

import java.time.LocalDate;

@Entity
@Table
public class Disponibilite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @ManyToOne
    @JoinColumn(name = "structure_medical_id")
    @Getter
    @Setter
    private LieuMedical structureMedical; // La structure médicale associée à la disponibilité

    @Getter
    @Setter
    private LocalDate dateDisponibilite; // La date de la disponibilité
//    private Integer dosesVaccinDisponibles; // Le nombre de doses de vaccin disponibles
//    private Integer testsDisponibles; // Le nombre de tests disponibles

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private Statut doses_Vaccin_Disponibles;

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private Statut tests_Disponibles;

    public Disponibilite(int id, LieuMedical structureMedical, LocalDate date, Statut dosesVaccinDisponibles, Statut testsDisponibles) {
        this.id = id;
        this.structureMedical = structureMedical;
        this.dateDisponibilite = date;
        this.doses_Vaccin_Disponibles = dosesVaccinDisponibles;
        this.tests_Disponibles = testsDisponibles;
    }
    public Disponibilite(){

    }
}
