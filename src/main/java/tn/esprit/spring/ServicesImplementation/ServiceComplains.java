package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.ComplainsRepo;
import tn.esprit.spring.Services.IServiceComplains;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceComplains implements IServiceComplains {

    ComplainsRepo complainsRepo;
}
