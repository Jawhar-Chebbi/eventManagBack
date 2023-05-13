package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.ReservationDetailsRepo;
import tn.esprit.spring.Services.IServiceReservationDetails;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceReservationDetails implements IServiceReservationDetails {

    ReservationDetailsRepo reservationDetailsRepo ;

}
