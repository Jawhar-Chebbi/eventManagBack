
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceBilling;
import tn.esprit.spring.Services.IServiceUser;

@RestController
@AllArgsConstructor
public class UserController {

    IServiceUser iServiceUser;


}
