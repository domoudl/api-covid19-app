CREATE DATABASE covid19_db;

CREATE TABLE LieuMedical (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             nom varchar(255),
                             adresse text,
                             contact varchar(255),
                             latitude double precision,
                             longitude double precision,
                             type TINYINT
);

CREATE TABLE RendezVous (
                            id INT AUTO_INCREMENT PRIMARY KEY,
                            lieu_medical_id int,
                            patient_id int,
                            date_heure timestamp,
                            type varchar(255)
);

CREATE TABLE Patient (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         nom varchar(255),
                         prenom varchar(255),
                         numero_telephone varchar(20),
                         adresse text
);

CREATE TABLE Disponibilite (
                               id INT AUTO_INCREMENT PRIMARY KEY,
                               structure_medical_id int,
                               dateDisponibilite date,
                               doses_vaccin_disponibles varchar(255),
                               tests_disponibles varchar(255)
);

ALTER TABLE Disponibilite
    ADD CONSTRAINT FK_StructureMedical
        FOREIGN KEY (structure_medical_id)
            REFERENCES LieuMedical(id);


ALTER TABLE RendezVous
    ADD CONSTRAINT FK_LieuMedical
        FOREIGN KEY (lieu_medical_id)
            REFERENCES LieuMedical(id);

ALTER TABLE RendezVous
    ADD CONSTRAINT FK_Patient
        FOREIGN KEY (patient_id)
            REFERENCES Patient(id);




