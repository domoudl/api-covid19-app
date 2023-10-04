package projetws.api.apicovid19app.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private String prenom;
    private String numeroTelephone;
    private String adresse;
}
