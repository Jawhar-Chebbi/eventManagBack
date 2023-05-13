package tn.esprit.spring.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEvent;
    @Temporal(TemporalType.DATE)
    Date dateEvent;
    String adressEvent;
    int nbrParticipant;
    String organiser;
    String description;
    double budget;
    @Enumerated(EnumType.STRING)
    Status status;
    @OneToMany
    List<Seminar> seminars;
    @OneToMany
    List<Training> trainings;
    @OneToMany
    List<Meeting> meetings;
    @OneToMany
    List<Reservation> reservations;
    @OneToOne
    Logistics logistics;
    @OneToMany
    List<Feedback> feedbacks;


}
