package bootweekend.blogweekend.services;

        import bootweekend.blogweekend.dao.CommentDao;
        import bootweekend.blogweekend.entity.Comment;
        import bootweekend.blogweekend.entity.Post;
        import org.springframework.beans.factory.annotation.Autowired;

        import javax.persistence.EntityManager;
        import javax.persistence.Query;
        import java.util.List;

public class CommentServiceImpl implements CommentService {


    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Comment> showComments(Post post) {
        return commentDao.showComments(post);
    }
}
