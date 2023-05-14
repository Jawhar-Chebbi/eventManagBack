
package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Seminar;
import tn.esprit.spring.Services.IServiceSeminar;

@RestController
@RequestMapping(value = SeminarController.ENDPOINT)
public class SeminarController extends CrudController<Seminar>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/seminar";

    private final IServiceSeminar iServiceSeminar;


    public SeminarController(IServiceSeminar iServiceSeminar) {
        super(iServiceSeminar);
        this.iServiceSeminar = iServiceSeminar;
    }
}
