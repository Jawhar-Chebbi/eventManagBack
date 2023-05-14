package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.Meeting;

@Repository
public interface MeetingRepo extends CrudRepo<Meeting,Long> {
}
