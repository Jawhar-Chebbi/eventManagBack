package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.EventRepo;
import tn.esprit.spring.Services.IServiceEvent;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceEvent implements IServiceEvent {

    EventRepo eventRepo;
}
