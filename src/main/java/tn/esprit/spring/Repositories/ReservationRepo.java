package tn.esprit.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Billing;
import tn.esprit.spring.Entities.Reservation;

@Repository
public interface ReservationRepo extends CrudRepository<Reservation,Long> {
}
