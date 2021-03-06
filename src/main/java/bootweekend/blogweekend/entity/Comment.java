package bootweekend.blogweekend.entity;

        import javax.persistence.*;

@Entity
@Table(name = "COMMENTS", schema = "blogweekend")
public class Comment {

    private Long id;
    private String content;
    private Post post;

    public Comment() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commentid")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne
    @JoinColumn(name = "post_id",nullable = false)
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
