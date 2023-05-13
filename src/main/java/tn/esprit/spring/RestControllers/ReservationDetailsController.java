
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceReservationDetails;

@RestController
@AllArgsConstructor
public class ReservationDetailsController {

    IServiceReservationDetails iServiceReservationDetails;


}
