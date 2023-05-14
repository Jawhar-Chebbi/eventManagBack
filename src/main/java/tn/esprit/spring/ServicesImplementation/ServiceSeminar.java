package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Seminar;
import tn.esprit.spring.Repositories.SeminarRepo;
import tn.esprit.spring.Services.IServiceSeminar;

@Service
@Slf4j
public class ServiceSeminar extends CrudService<Seminar>  implements IServiceSeminar {

    public ServiceSeminar(SeminarRepo seminarRepo) {
        super(seminarRepo);
    }
}
