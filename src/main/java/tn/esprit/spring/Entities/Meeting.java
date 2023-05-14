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

public class Meeting implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Temporal(TemporalType.DATE)
    Date dateMeeting;
    String pilote;
    String lieu;
    int duree;
    String report;
    double fraisMeeting;
    @ManyToOne
    Event event;


}
