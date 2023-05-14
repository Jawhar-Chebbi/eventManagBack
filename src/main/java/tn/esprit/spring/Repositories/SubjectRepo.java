package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Subject;

@Repository
public interface SubjectRepo extends CrudRepo<Subject,Long> {
}
