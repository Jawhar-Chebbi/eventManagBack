package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.MeetingRepo;
import tn.esprit.spring.Services.IServiceMeeting;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceMeeting implements IServiceMeeting {

    MeetingRepo meetingRepo;
}
