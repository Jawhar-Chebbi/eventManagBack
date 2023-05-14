
package tn.esprit.spring.RestControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.Entities.User;
import tn.esprit.spring.Services.IServiceUser;

@RestController
@RequestMapping(value = UserController.ENDPOINT)
public class UserController extends CrudController<User>{

    public static final String ENDPOINT = ROOT_ENDPOINT + "/user";

    private final IServiceUser iServiceUser;


    public UserController(IServiceUser iServiceUser) {
        super(iServiceUser);
        this.iServiceUser = iServiceUser;
    }
}
