package tn.esprit.spring.ServicesImplementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Entities.User;
import tn.esprit.spring.Repositories.UserRepo;
import tn.esprit.spring.Services.IServiceUser;

@Service
@Slf4j
public class ServiceUser extends CrudService<User>  implements IServiceUser {

    public ServiceUser(UserRepo userRepo) {
        super(userRepo);
    }
}
