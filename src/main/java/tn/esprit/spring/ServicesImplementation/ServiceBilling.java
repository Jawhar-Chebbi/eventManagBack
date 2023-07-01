package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Billing;
import tn.esprit.spring.Repositories.BillingRepo;
import tn.esprit.spring.Services.IServiceBilling;

@Service
@Slf4j
public class ServiceBilling extends CrudService<Billing> implements IServiceBilling {

    public ServiceBilling(BillingRepo billingRepo) {
        super(billingRepo);
    }
}
