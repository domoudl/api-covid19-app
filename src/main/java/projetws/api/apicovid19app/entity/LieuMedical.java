package projetws.api.apicovid19app.entity;

import jakarta.persistence.*;
import projetws.api.apicovid19app.enums.TypeLieuMedical;

@Entity
@Table
public class LieuMedical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String adresse;
    private String contact;
    private double latitude;
    private double longitude;

    @Enumerated(EnumType.STRING)
    private TypeLieuMedical type;
}
