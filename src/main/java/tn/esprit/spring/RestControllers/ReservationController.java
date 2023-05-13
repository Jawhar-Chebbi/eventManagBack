
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceReservation;

@RestController
@AllArgsConstructor
public class ReservationController {

    IServiceReservation iServiceReservation;


}
