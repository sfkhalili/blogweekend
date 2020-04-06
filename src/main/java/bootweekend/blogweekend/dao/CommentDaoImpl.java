package bootweekend.blogweekend.dao;

import bootweekend.blogweekend.entity.Comment;
import bootweekend.blogweekend.entity.Post;
import bootweekend.blogweekend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class CommentDaoImpl  implements CommentDao{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Comment> showComments(Post post) {

        Query queryPost=entityManager.createQuery("select c from Comment c where c.post= :post");
        queryPost.setParameter("post",post);
        List<Comment> list=queryPost.getResultList();
        return list;
    }
}
