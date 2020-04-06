package bootweekend.blogweekend.services;

import bootweekend.blogweekend.dao.UserDao;
import bootweekend.blogweekend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void saveUser(User user){
        userDao.saveUser(user);
    }

    @Override
    public String login(User user) {

        return userDao.login(user);
    }
}
