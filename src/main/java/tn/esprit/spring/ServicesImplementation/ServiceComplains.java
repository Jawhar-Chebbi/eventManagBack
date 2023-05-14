package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Complains;
import tn.esprit.spring.Repositories.ComplainsRepo;
import tn.esprit.spring.Services.IServiceComplains;

@Service
@Slf4j
public class ServiceComplains  extends CrudService<Complains>   implements IServiceComplains {


    public ServiceComplains(ComplainsRepo complainsRepo) {
        super(complainsRepo);
    }
}
