package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Comments;

@Repository
public interface CommentsRepo extends CrudRepo<Comments,Long> {
}
