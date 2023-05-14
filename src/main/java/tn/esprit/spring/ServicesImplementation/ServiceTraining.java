package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Training;
import tn.esprit.spring.Repositories.TrainningRepo;
import tn.esprit.spring.Services.IServiceTraining;

@Service
@Slf4j
public class ServiceTraining extends CrudService<Training>  implements IServiceTraining {

    public ServiceTraining(TrainningRepo trainningRepo) {
        super(trainningRepo);
    }
}
