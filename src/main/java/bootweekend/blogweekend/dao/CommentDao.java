package bootweekend.blogweekend.dao;

import bootweekend.blogweekend.entity.Comment;
import bootweekend.blogweekend.entity.Post;

import java.util.List;

public interface CommentDao {
    public List<Comment> showComments(Post post);
}
