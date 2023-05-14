package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Comments;
import tn.esprit.spring.Entities.Feedback;
import tn.esprit.spring.Services.IServiceComments;
import tn.esprit.spring.Services.IServiceFeedback;

@RestController
@RequestMapping(value = FeedbackController.ENDPOINT)
public class FeedbackController extends CrudController<Feedback>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/feedback";

    private final IServiceFeedback iServiceFeedback;


    public FeedbackController(IServiceFeedback iServiceFeedback) {
        super(iServiceFeedback);
        this.iServiceFeedback = iServiceFeedback;
    }
}
