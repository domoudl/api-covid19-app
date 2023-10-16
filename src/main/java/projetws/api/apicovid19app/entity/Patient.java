package projetws.api.apicovid19app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String nom;

    @Getter
    @Setter
    private String prenom;

    @Getter
    @Setter
    private String numero_telephone;

    @Getter
    @Setter
    private String adresse;

    public Patient(int id, String nom, String prenom, String numeroTelephone, String adresse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numero_telephone = numeroTelephone;
        this.adresse = adresse;
    }

    public Patient(){

    }
}
