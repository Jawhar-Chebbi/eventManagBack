package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.ReservationDetails;
import tn.esprit.spring.Repositories.ReservationDetailsRepo;
import tn.esprit.spring.Services.IServiceReservationDetails;

@Service
@Slf4j
public class ServiceReservationDetails extends CrudService<ReservationDetails>  implements IServiceReservationDetails {

    public ServiceReservationDetails(ReservationDetailsRepo reservationDetailsRepo) {
        super(reservationDetailsRepo);
    }

}
