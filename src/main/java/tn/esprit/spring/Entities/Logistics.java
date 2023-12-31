package tn.esprit.spring.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Logistics  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    double totalCost;
    String commentaire;
    @Temporal(TemporalType.DATE)
    Date datelogistic;
    @JsonIgnore()
    @OneToOne
    Event event;
    @OneToMany(mappedBy = "logistics", cascade = CascadeType.ALL)
    List<LogisticDetails> logisticDetails;

}
