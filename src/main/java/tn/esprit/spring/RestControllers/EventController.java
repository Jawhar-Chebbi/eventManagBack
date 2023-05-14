package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Event;
import tn.esprit.spring.Services.IServiceEvent;

@RestController
@RequestMapping(value = EventController.ENDPOINT)
public class EventController extends CrudController<Event>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/event";

    private final IServiceEvent iServiceEvent;


    public EventController(IServiceEvent iServiceEvent) {
        super(iServiceEvent);
        this.iServiceEvent = iServiceEvent;
    }
}
