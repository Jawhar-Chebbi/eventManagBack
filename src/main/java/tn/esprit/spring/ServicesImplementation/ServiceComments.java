package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Comments;
import tn.esprit.spring.Repositories.CommentsRepo;
import tn.esprit.spring.Services.IServiceComments;

@Service
@Slf4j
public class ServiceComments  extends CrudService<Comments>  implements IServiceComments {

    public ServiceComments(CommentsRepo commentsRepo) {
        super(commentsRepo);
    }
}
