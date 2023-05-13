package tn.esprit.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Billing;

@Repository
public interface BillingRepo extends CrudRepository<Billing,Long> {
}
