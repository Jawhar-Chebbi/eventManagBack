package tn.esprit.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Billing;
import tn.esprit.spring.Entities.Feedback;

@Repository
public interface FeedbackRepo extends CrudRepository<Feedback,Long> {
}
