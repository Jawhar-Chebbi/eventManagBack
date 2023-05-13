package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceFeedback;

@RestController
@AllArgsConstructor
public class FeedbackController {

    IServiceFeedback iServiceFeedback;


}
