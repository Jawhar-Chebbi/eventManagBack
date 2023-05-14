package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Meeting;
import tn.esprit.spring.Repositories.MeetingRepo;
import tn.esprit.spring.Services.IServiceMeeting;

@Service
@Slf4j
public class ServiceMeeting extends CrudService<Meeting>  implements IServiceMeeting {

    MeetingRepo meetingRepo;

    public ServiceMeeting(MeetingRepo meetingRepo) {
        super(meetingRepo);
    }
}
