package tn.esprit.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Billing;
import tn.esprit.spring.Entities.Complains;

@Repository
public interface ComplainsRepo extends CrudRepository<Complains,Long> {
}
