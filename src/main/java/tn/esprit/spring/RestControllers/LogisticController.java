
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceLogistics;

@RestController
@AllArgsConstructor
public class LogisticController {

    IServiceLogistics iServiceLogistics;


}
