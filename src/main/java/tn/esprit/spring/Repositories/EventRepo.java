package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Event;

@Repository
public interface EventRepo extends CrudRepo<Event,Long> {
}
