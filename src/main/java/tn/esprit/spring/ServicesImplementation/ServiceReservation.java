package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Reservation;
import tn.esprit.spring.Repositories.ReservationRepo;
import tn.esprit.spring.Services.IServiceReservation;

@Service
@Slf4j
public class ServiceReservation extends CrudService<Reservation>  implements IServiceReservation {

    ReservationRepo reservationRepo;

    public ServiceReservation(ReservationRepo reservationRepo) {
        super(reservationRepo);
    }
}
