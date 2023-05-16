package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Reservation;

@Repository
public interface ReservationRepo extends CrudRepo<Reservation,Long> {


}
