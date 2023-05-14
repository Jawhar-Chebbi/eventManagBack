package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Event;
import tn.esprit.spring.Repositories.EventRepo;
import tn.esprit.spring.Services.IServiceEvent;

@Service
@Slf4j
public class ServiceEvent extends CrudService<Event>  implements IServiceEvent {

    public ServiceEvent(EventRepo eventRepo) {
        super(eventRepo);
    }
}
