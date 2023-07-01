package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface CrudRepo<T,Long> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {

    List<T> findAll();

    Optional<T> findOneById(@Param("id") long id);



}
