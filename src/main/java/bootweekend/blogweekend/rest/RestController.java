package bootweekend.blogweekend.rest;

import bootweekend.blogweekend.entity.Post;
import bootweekend.blogweekend.entity.User;
import bootweekend.blogweekend.services.PostService;
import bootweekend.blogweekend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@org.springframework.web.bind.annotation.RestController("/")
public class RestController {

    @Autowired
    private UserService userService;

//    @Autowired
//    private PostService postService;

    public RestController() {
    }

    /*http://localhost:9080/hello*/
    @GetMapping("/hello")
    public String hello() {

        return "hello user!!";
    }

    /*http://localhost:9080/variable?firstName=elham*/
    @RequestMapping("/variable")
    @ResponseBody
    public String getName(@RequestParam String firstName) {
        return "welcome" + "  " + firstName;
    }

//*http://localhost:9080/register*/save user  in request (user+ without id)/
//*http://localhost:9080/register*/update user in request (user+id)/
    @PostMapping("/register")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @RequestMapping("/getAllPosts")
    public String getAllPostsByUserName(@RequestParam String username, Model model){

      //  List<Post> listPost= postService.getAllByUserName(username);
        //model.addAttribute("list",listPost);
        return "listposts";

    }



}
