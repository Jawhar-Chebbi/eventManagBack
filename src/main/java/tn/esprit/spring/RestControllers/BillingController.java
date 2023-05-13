package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceBilling;

@RestController
@AllArgsConstructor
public class BillingController {

    IServiceBilling iServiceBilling;


}
