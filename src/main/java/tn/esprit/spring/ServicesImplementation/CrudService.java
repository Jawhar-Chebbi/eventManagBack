package tn.esprit.spring.ServicesImplementation;


import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.spring.Repositories.CrudRepo;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@SuperBuilder
@Slf4j
@Transactional
public class CrudService<T>  {


    protected final CrudRepo<T,Long> crudRepo;

    public List<T> findAll() {
        log.info("Find all ");
        List<T> datas = this.crudRepo.findAll();
        log.info("Find all end");
        return datas;
    }

    public T createData(T data) {
        log.info("Creating " );
        T newdata = this.crudRepo.saveAndFlush(data);
        return newdata;
    }


    public T updateData(Long id, T data) {
        log.info("Updating " );
        Optional<T> oldData = this.crudRepo.findOneById(id);
        if(!oldData.isPresent()){
            return null;
        }
        T updatedData = this.crudRepo.save(data);
        return updatedData;
    }

    public void deleteData(Long id) {
        log.info("Deleting ");
        Optional<T> data = this.crudRepo.findOneById(id);
        T deletedData = data.get();
        log.info("Find by ID end");

        this.crudRepo.deleteById(id);
    }

    public T findById(Long id) {
        log.info("find by id ");
        Optional<T> data = this.crudRepo.findOneById(id);
        if(data.isPresent()){
            return data.get();
        }
        log.info("ERROR while obtaining data from database");
        return null ;
    }
}
