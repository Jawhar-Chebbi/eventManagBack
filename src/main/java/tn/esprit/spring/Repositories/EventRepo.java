package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Enum.Category;
import tn.esprit.spring.Entities.Enum.Status;
import tn.esprit.spring.Entities.Event;

import java.util.List;

@Repository
public interface EventRepo extends CrudRepo<Event,Long> {
    List<Event> findByStatusIn(List<Status> status);


    List<Event> findByCategory(Category category);
}
