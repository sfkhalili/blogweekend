package bootweekend.blogweekend.services;

import bootweekend.blogweekend.entity.User;

import java.util.List;

public interface UserService {

    public void saveUser(User user);
    public String login(User user);


}
