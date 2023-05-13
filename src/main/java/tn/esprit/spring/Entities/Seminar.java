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

public class Seminar implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idSeminar;
    @Temporal(TemporalType.DATE)
    Date dateSeminar;
    String lieu;
    String nomSeminar;
    String organiser;
    int nbrParticipantMax;
    int dureeSeminar;
    double fraisSeminar;
    @ManyToOne
    Event eventSeminar;

}
