package bootweekend.blogweekend.services;

        import bootweekend.blogweekend.entity.Post;

        import java.util.List;

public interface PostService {

    public void save(Post post);
    public void delete(Post post);
    public List getAllByUserName(String userName);

}
