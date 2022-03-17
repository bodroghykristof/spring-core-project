package hu.vemsoft.core.service;

import hu.vemsoft.core.model.User;
import hu.vemsoft.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void init() {
        List<User> users = userRepository.findAll();
        users.forEach(System.out::println);
    }

}
