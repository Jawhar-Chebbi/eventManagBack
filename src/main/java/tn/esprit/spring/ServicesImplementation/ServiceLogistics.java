package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Logistics;
import tn.esprit.spring.Repositories.LogisticsRepo;
import tn.esprit.spring.Services.IServiceLogistics;

@Service
@Slf4j
public class ServiceLogistics extends CrudService<Logistics> implements IServiceLogistics {


    public ServiceLogistics(LogisticsRepo logisticsRepo) {
        super(logisticsRepo);
    }
}
