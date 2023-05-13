package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceComplains;

@RestController
@AllArgsConstructor
public class ComplainsController {

    IServiceComplains iServiceComplains;


}
