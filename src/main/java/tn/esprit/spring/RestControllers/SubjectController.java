
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceSeminar;

@RestController
@AllArgsConstructor
public class SubjectController {

    IServiceSeminar iServiceSeminar;


}
