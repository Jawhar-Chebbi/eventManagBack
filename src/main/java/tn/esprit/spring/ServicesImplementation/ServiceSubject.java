package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.Subject;
import tn.esprit.spring.Repositories.SubjectRepo;
import tn.esprit.spring.Services.IServiceSubject;

@Service
@Slf4j
public class ServiceSubject extends CrudService<Subject> implements IServiceSubject {

    public ServiceSubject(SubjectRepo subjectRepo) {
        super(subjectRepo);
    }
}
