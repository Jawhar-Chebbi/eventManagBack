package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Feedback;

@Repository
public interface FeedbackRepo extends CrudRepo<Feedback,Long> {
}
