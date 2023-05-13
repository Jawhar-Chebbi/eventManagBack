package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.LogisticDetails;
import tn.esprit.spring.Repositories.LogisticDetailsRepo;
import tn.esprit.spring.Services.IServiceLogisticDetails;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceLogisticDetails implements IServiceLogisticDetails {

    LogisticDetailsRepo logisticDetailsRepo;
}
