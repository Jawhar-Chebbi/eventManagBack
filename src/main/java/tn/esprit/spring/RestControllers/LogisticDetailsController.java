
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceLogisticDetails;

@RestController
@AllArgsConstructor
public class LogisticDetailsController {

    IServiceLogisticDetails iServiceLogisticDetails;


}
