package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Billing;
import tn.esprit.spring.Services.IServiceBilling;
import tn.esprit.spring.Services.IServiceCrud;

@RestController
@RequestMapping(value = BillingController.ENDPOINT)
public class BillingController extends CrudController<Billing>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/billing";

    private final IServiceBilling iServiceBilling;


    public BillingController(IServiceBilling iServiceBilling) {
        super(iServiceBilling);
        this.iServiceBilling = iServiceBilling;
    }
}
