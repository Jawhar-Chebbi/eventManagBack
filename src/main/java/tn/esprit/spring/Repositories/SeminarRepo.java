package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Seminar;

@Repository
public interface SeminarRepo extends CrudRepo<Seminar,Long> {
}
