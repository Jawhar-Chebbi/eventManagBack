package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.FeedbackRepo;
import tn.esprit.spring.Services.IServiceFeedback;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceFeedback implements IServiceFeedback {

    FeedbackRepo feedbackRepo;
}