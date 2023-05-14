
package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Logistics;
import tn.esprit.spring.Services.IServiceLogistics;

@RestController
@RequestMapping(value = LogisticController.ENDPOINT)
public class LogisticController extends CrudController<Logistics>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/logistic";

    private final IServiceLogistics iServiceLogistics;


    public LogisticController(IServiceLogistics iServiceLogistics) {
        super(iServiceLogistics);
        this.iServiceLogistics = iServiceLogistics;
    }
}
