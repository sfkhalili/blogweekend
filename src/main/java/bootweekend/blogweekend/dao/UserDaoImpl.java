package bootweekend.blogweekend.dao;

import bootweekend.blogweekend.entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private EntityManager entityManager;

    @Autowired
    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void saveUser(User user) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);


    }

    @Override
    public String login(User user) {
       String result;
        Query query=entityManager.createQuery("select u from User u where u.username= :username and u.password= :pass");
        query.setParameter("username",user.getUsername());
        query.setParameter("pass",user.getPassword());
        List<User> list=query.getResultList();
        if (list.size()>0){
             result="Welcome";
        }else
             result="You Not Registered";
        return result;
    }

}
