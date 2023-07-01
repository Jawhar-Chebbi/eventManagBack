package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.LogisticDetails;
import tn.esprit.spring.Repositories.LogisticDetailsRepo;
import tn.esprit.spring.Services.IServiceLogisticDetails;

@Service
@Slf4j
public class ServiceLogisticDetails  extends CrudService<LogisticDetails> implements IServiceLogisticDetails {


    public ServiceLogisticDetails(LogisticDetailsRepo logisticDetailsRepo) {
        super(logisticDetailsRepo);
    }



}
