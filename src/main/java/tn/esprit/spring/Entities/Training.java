package tn.esprit.spring.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Training implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String formateur;
    int nbrFormateurs;
    boolean certificat;
    @Temporal(TemporalType.DATE)
    Date dateTraining;
    String lieu;
    int duree;
    String programme;
    double fraisFormation;
    @ManyToOne
    Event event;


}
