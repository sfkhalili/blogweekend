package bootweekend.blogweekend.services;

import bootweekend.blogweekend.entity.Comment;
import bootweekend.blogweekend.entity.Post;

import java.util.List;

public interface CommentService {
    public List<Comment> showComments(Post post);
}
