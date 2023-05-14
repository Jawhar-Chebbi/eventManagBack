
package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Reservation;
import tn.esprit.spring.Services.IServiceReservation;

@RestController
@RequestMapping(value = ReservationController.ENDPOINT)
public class ReservationController extends CrudController<Reservation>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/reservation";

    private final IServiceReservation iServiceReservation;


    public ReservationController(IServiceReservation iServiceReservation) {
        super(iServiceReservation);
        this.iServiceReservation = iServiceReservation;
    }
}
