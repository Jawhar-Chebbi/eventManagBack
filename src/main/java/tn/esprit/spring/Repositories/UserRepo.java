package tn.esprit.spring.Repositories;

import org.springframework.stereotype.Repository;
import tn.esprit.spring.Entities.User;

@Repository
public interface UserRepo extends CrudRepo<User,Long> {
}
