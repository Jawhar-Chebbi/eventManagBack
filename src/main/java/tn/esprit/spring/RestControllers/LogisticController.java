
package tn.esprit.spring.RestControllers;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Entities.LogisticDetails;
import tn.esprit.spring.Entities.Logistics;
import tn.esprit.spring.Services.IServiceLogistics;

@RestController
@CrossOrigin
@RequestMapping(value = LogisticController.ENDPOINT)
public class LogisticController extends CrudController<Logistics>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/logistic";

    private final IServiceLogistics iServiceLogistics;


    public LogisticController(IServiceLogistics iServiceLogistics) {
        super(iServiceLogistics);
        this.iServiceLogistics = iServiceLogistics;
    }

    @PutMapping("/{id}/calculateTotalCost")
    public void calculateTotalCost(@PathVariable("id") Long id) {
        Logistics logistics = iServiceLogistics.findById(id);
        if (logistics != null) {
            iServiceLogistics.calculateTotalCost(logistics);
            iServiceLogistics.updateData(id, logistics);
        }
    }
    @CrossOrigin
    @PutMapping("/{id}/affectLogisticDetails")
    public void affectLogisticDetails(@PathVariable("id") Long id, @RequestBody List<LogisticDetails> logisticDetailsList) {
        Logistics logistics = iServiceLogistics.findById(id);
        if (logistics != null) {
            iServiceLogistics.affecterLogisticdetailsLogistique(logistics, logisticDetailsList);
        }
    }
}
