package bootweekend.blogweekend.dao;

import bootweekend.blogweekend.entity.User;

public interface UserDao {

    public void saveUser(User user);
    public String login(User user);


}
