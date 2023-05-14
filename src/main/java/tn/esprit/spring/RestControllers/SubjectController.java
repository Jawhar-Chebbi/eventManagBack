
package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Subject;
import tn.esprit.spring.Services.IServiceSubject;

@RestController
@RequestMapping(value = SubjectController.ENDPOINT)
public class SubjectController extends CrudController<Subject>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/subject";

    private final IServiceSubject iServiceSubject;


    public SubjectController(IServiceSubject iServiceSubject) {
        super(iServiceSubject);
        this.iServiceSubject = iServiceSubject;
    }
}
