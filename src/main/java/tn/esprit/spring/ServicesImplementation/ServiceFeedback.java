package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Feedback;
import tn.esprit.spring.Repositories.FeedbackRepo;
import tn.esprit.spring.Services.IServiceFeedback;

@Service
@Slf4j
public class ServiceFeedback extends CrudService<Feedback> implements IServiceFeedback {


    public ServiceFeedback(FeedbackRepo feedbackRepo) {
        super(feedbackRepo);
    }
}
