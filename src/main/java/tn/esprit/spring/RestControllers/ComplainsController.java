package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Complains;
import tn.esprit.spring.Services.IServiceComplains;

@RestController
@RequestMapping(value = ComplainsController.ENDPOINT)
public class ComplainsController extends CrudController<Complains>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/complains";

    private final IServiceComplains iServiceComplains;


    public ComplainsController(IServiceComplains iServiceComplains) {
        super(iServiceComplains);
        this.iServiceComplains = iServiceComplains;
    }
}
