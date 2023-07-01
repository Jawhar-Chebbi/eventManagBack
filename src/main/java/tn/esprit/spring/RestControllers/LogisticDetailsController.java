
package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.LogisticDetails;
import tn.esprit.spring.Services.IServiceLogisticDetails;


@RestController
@CrossOrigin
@RequestMapping(value = LogisticDetailsController.ENDPOINT)
public class LogisticDetailsController extends CrudController<LogisticDetails>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/logisticdetails";

    private final IServiceLogisticDetails iServiceLogisticDetails;


    public LogisticDetailsController(IServiceLogisticDetails iServiceLogisticDetails) {
        super(iServiceLogisticDetails);
        this.iServiceLogisticDetails = iServiceLogisticDetails;
    }
}
