package tn.esprit.spring.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Services.IServiceComments;

@RestController
@AllArgsConstructor
public class CommentsController {

    IServiceComments iServiceComments;


}
