package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.SubjectRepo;
import tn.esprit.spring.Services.IServiceSubject;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceSubject implements IServiceSubject {

    SubjectRepo subjectRepo;
}
