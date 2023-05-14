
package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.ReservationDetails;
import tn.esprit.spring.Services.IServiceReservationDetails;

@RestController
@RequestMapping(value = ReservationDetailsController.ENDPOINT)
public class ReservationDetailsController extends CrudController<ReservationDetails>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/reservationdetails";

    private final IServiceReservationDetails iServiceReservationDetails;


    public ReservationDetailsController(IServiceReservationDetails iServiceReservationDetails) {
        super(iServiceReservationDetails);
        this.iServiceReservationDetails = iServiceReservationDetails;
    }
}
