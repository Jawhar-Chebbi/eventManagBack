package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.TrainningRepo;
import tn.esprit.spring.Repositories.UserRepo;
import tn.esprit.spring.Services.IServiceBilling;
import tn.esprit.spring.Services.IServiceTraining;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceTraining implements IServiceTraining {

    TrainningRepo trainningRepo;
}
