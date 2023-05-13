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
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUser;
    String firstname;
    String lastname;
    String password;
    int telNumber;
    @Temporal(TemporalType.DATE)
    Date dateNaissance;
    String interst;
    String adress;
    @Enumerated(EnumType.STRING)
    Role role;
    @Enumerated(EnumType.STRING)
    Sexe sexe;
    @OneToMany(mappedBy = "userReservation")
    List<Reservation> reservations;
    @OneToMany(mappedBy = "user")
    List<Subject> subjects;

}
