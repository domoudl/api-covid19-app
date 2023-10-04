package projetws.api.apicovid19app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import projetws.api.apicovid19app.enums.TypeLieuMedical;

@Entity
@Table(name = "LieuMedical")
public class LieuMedical {
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
    private String adresse;
    @Getter
    @Setter
    private String contact;
    @Getter
    @Setter
    private double latitude;
    @Getter
    @Setter
    private double longitude;

    @Getter
    @Setter
    private int type; //STRUCTURE_DE_SANTE => 1,CENTRE_DE_TEST=>2,CENTRE_DE_VACCINATION=>3

    public LieuMedical(int id, String nom, String adresse, String contact, double latitude, double longitude, int type) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
    }

    public LieuMedical(){

    }


}
