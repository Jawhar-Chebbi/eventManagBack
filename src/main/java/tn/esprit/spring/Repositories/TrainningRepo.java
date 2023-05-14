package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Training;

@Repository
public interface TrainningRepo extends CrudRepo<Training,Long> {
}
