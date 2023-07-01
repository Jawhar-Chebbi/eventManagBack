package tn.esprit.spring.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.Entities.Enum.Category;
import tn.esprit.spring.Entities.Enum.EventType;
import tn.esprit.spring.Entities.Enum.Status;

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
    long id;
    @Temporal(TemporalType.DATE)
    Date dateEvent;
    @Temporal(TemporalType.DATE)
    Date dateFinEvent;
    @Temporal(TemporalType.DATE)
    Date deadLine;
    String eventTitle;
    String adressEvent;
    @Enumerated(EnumType.STRING)
    Category category;
    int nbrParticipant;
    String organiser;
    String image;
    String description;
    int telNumber;
    double ticketPrice;
    double budget;
    String email;
    @Enumerated(EnumType.STRING)
    Status status;
    @Enumerated(EnumType.STRING)
    EventType eventType;
    @OneToMany
    List<Seminar> seminars;
    @OneToMany
    List<Training> trainings;
    @OneToMany
    List<Meeting> meetings;
    @OneToMany(mappedBy= "event" , cascade = CascadeType.ALL)
    List<Reservation> reservations;
    @OneToOne
    Logistics logistics;
    @OneToMany(mappedBy= "event" , cascade = CascadeType.ALL)
    List<Feedback> feedbacks;


}