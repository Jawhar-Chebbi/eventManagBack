package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Logistics;

@Repository
public interface LogisticsRepo extends CrudRepo<Logistics,Long> {
}
