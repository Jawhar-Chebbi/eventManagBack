package tn.esprit.spring.Entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    int nbrPlace;
    boolean paymentStatus;
    double frais;
    double fraisDetails;
    ///////////
    @ManyToOne
    User userReservation;
    @ManyToOne
    Event event;
    @OneToMany
    List<ReservationDetails> reservationDetails;
    @OneToOne
    Billing billing;





}
