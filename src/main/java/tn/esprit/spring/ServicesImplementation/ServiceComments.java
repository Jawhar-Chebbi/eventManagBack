package tn.esprit.spring.ServicesImplementation;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.CommentsRepo;
import tn.esprit.spring.Services.IServiceComments;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceComments implements IServiceComments {

    CommentsRepo commentsRepo;
}
