package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Complains;

@Repository
public interface ComplainsRepo extends CrudRepo<Complains,Long> {
}
