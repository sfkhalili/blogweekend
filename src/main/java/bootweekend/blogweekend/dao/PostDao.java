package bootweekend.blogweekend.dao;

import bootweekend.blogweekend.entity.Post;

import java.util.List;

public interface PostDao{

    public void save(Post post);
    public void delete(Post post);
    public List<Post> getAllByUserName(String userName);

}