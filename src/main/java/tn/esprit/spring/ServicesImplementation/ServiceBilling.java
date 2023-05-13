package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.BillingRepo;
import tn.esprit.spring.Services.IServiceBilling;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceBilling implements IServiceBilling {

    BillingRepo billingRepo ;
}
