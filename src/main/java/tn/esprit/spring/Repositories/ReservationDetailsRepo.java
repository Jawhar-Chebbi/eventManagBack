package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.ReservationDetails;

@Repository
public interface ReservationDetailsRepo extends CrudRepo<ReservationDetails,Long> {
}
