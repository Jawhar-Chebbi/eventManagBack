
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceTraining;

@RestController
@AllArgsConstructor
public class TrainingController {

    IServiceTraining iServiceTraining;


}