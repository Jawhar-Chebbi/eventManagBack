
package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Training;
import tn.esprit.spring.Services.IServiceTraining;

@RestController
@RequestMapping(value = TrainingController.ENDPOINT)
public class TrainingController extends CrudController<Training>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/training";

    private final IServiceTraining iServiceTraining;


    public TrainingController(IServiceTraining iServiceTraining) {
        super(iServiceTraining);
        this.iServiceTraining = iServiceTraining;
    }
}
