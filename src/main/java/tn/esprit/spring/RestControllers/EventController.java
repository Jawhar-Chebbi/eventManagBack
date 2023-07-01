package tn.esprit.spring.RestControllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.spring.Entities.Enum.Category;
import tn.esprit.spring.Entities.Enum.Status;
import tn.esprit.spring.Entities.Event;
import tn.esprit.spring.Services.IServiceEvent;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = EventController.ENDPOINT)
public class EventController extends CrudController<Event>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/event";

    private final IServiceEvent iServiceEvent;


    public EventController(IServiceEvent iServiceEvent) {
        super(iServiceEvent);
        this.iServiceEvent = iServiceEvent;

    }

    @GetMapping("/byStatus/{status}")
    public List<Event> getEventsByStatus(@PathVariable("status") List<Status> status) {

        return iServiceEvent.getEventsByStatus(status);
    }

    @GetMapping("/byCategory/{category}")
    public List<Event> getEventsByCategory(@PathVariable("category")Category category){
        return iServiceEvent.getEventByCategory(category);
    }
   @PostMapping("/logistics/{eventId}/{logisticId}")
  public ResponseEntity<Event> addLogistic(@PathVariable Long eventId, @PathVariable Long logisticId) {
       return new ResponseEntity<>(iServiceEvent.affectLogisticsToEvent(eventId, logisticId), HttpStatus.OK);
   }
        @Value(("${project.image}"))
    private String path;
    @PostMapping("/image/{id}")
    public ResponseEntity<Event> fileUpload(
            @RequestParam("image") MultipartFile image, @PathVariable long id            ) {
        String fileName = null;
        Event event = null ;
        try {
            fileName = this.iServiceEvent.uploadImage(path, image);
             event = this.iServiceEvent.findById(id);
            if(event != null){
                event.setImage(fileName);
               event =  this.iServiceEvent.updateData(id,event);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ResponseEntity<>(event, HttpStatus.OK);
    }

}
