package bootweekend.blogweekend.services;

import bootweekend.blogweekend.dao.PostDao;
import bootweekend.blogweekend.entity.Post;
import bootweekend.blogweekend.entity.User;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class PostServiceImpl implements PostService {

    private PostDao postDao;

    @Autowired
    public PostServiceImpl(PostDao postDao) {
        this.postDao = postDao;
    }

    @Override
    public void save(Post post) {
    postDao.save(post);
    }

    @Override
    public void delete(Post post) {
    postDao.delete(post);
    }

    @Override
    @Transactional
    public List<Post> getAllByUserName(String userName) {
        return  postDao.getAllByUserName(userName);
    }



}
