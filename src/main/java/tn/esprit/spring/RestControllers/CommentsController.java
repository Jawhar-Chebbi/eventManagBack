package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.Comments;
import tn.esprit.spring.Services.IServiceComments;

@RestController
@RequestMapping(value = CommentsController.ENDPOINT)
public class CommentsController extends CrudController<Comments>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/comments";

    private final IServiceComments iServiceComments;


    public CommentsController(IServiceComments iServiceComments) {
        super(iServiceComments);
        this.iServiceComments = iServiceComments;
    }
}
