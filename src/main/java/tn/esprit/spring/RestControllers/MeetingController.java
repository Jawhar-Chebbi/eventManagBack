
package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceMeeting;

@RestController
@AllArgsConstructor
public class MeetingController {

    IServiceMeeting iServiceMeeting;


}