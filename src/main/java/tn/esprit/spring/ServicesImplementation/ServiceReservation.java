package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.ReservationRepo;
import tn.esprit.spring.Services.IServiceReservation;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceReservation implements IServiceReservation {

    ReservationRepo reservationRepo;
}
