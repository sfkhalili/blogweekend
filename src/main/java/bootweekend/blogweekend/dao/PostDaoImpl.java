package bootweekend.blogweekend.dao;

import bootweekend.blogweekend.entity.Post;
import bootweekend.blogweekend.entity.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PostDaoImpl implements PostDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void save(Post post) {

        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(post);
    }

    @Override
    public void delete(Post post) {

        Session session = entityManager.unwrap(Session.class);
        session.delete(post);

}

    @Override
    public List<Post> getAllByUserName(String userName) {


        Query query=entityManager.createQuery("select u from User u where u.username= :userName");
        query.setParameter("userName",userName);
        User user= (User) query.getSingleResult();
       // Long userId=user.getUserId();
        Query queryPost=entityManager.createQuery("select p from Post p where p.user= :user");
        queryPost.setParameter("user",user);
        List<Post> list=queryPost.getResultList();
        return list;


    }


}