package tn.esprit.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Billing;
import tn.esprit.spring.Entities.Event;

@Repository
public interface EventRepo extends CrudRepository<Event,Long> {
}
