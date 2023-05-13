package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.SeminarRepo;
import tn.esprit.spring.Services.IServiceSeminar;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceSeminar implements IServiceSeminar {

    SeminarRepo seminarRepo;
}
