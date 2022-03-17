package hu.vemsoft.core.service;

import hu.vemsoft.core.model.User;
import hu.vemsoft.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService() {
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Ee only need @Autowired annotation here if the no args constructor is present.
     * In case of a single constructor Spring finds and uses it by default.
     */
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    }

}
