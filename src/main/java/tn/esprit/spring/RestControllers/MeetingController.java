
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Meeting;
import tn.esprit.spring.Services.IServiceMeeting;

@RestController
@RequestMapping(value = MeetingController.ENDPOINT)
public class MeetingController extends CrudController<Meeting>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/meeting";

    private final IServiceMeeting iServiceMeeting;


    public MeetingController(IServiceMeeting iServiceMeeting) {
        super(iServiceMeeting);
        this.iServiceMeeting = iServiceMeeting;
    }
}
