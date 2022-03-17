package hu.vemsoft.core.repository;

import hu.vemsoft.core.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    public List<User> findAll() {
        return Arrays.asList(new User("Chris", "admin"),
                new User("Johnny", "manager"));
    }
}
