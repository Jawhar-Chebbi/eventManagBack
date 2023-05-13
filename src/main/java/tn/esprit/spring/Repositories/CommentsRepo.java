package tn.esprit.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entities.Comments;

@Repository
public interface CommentsRepo extends CrudRepository<Comments,Long> {
}
