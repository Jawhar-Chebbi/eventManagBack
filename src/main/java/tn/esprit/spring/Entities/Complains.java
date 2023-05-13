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

public class Complains implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idComplains;
    @Temporal(TemporalType.DATE)
    Date dateComplains;
    String description;

}
