package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.LogisticDetails;

@Repository
public interface LogisticDetailsRepo extends CrudRepo<LogisticDetails,Long> {
}
