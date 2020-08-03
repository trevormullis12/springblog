package com.codeup.springblog;

import models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String posts(Model model) {
        List postList = new ArrayList<>();
        Post post1 = new Post("My Title", "this is my description for the title");
        Post post2 = new Post("My Second Title", "description goes here but you shouldn't see it");
        postList.add(post1);
        postList.add(post2);
        model.addAttribute("postList", postList);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postId(@PathVariable int id, Model model) {
        Post post = new Post("My Title", "this is my description for the title");
        model.addAttribute("currentPost", post);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createGet() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "create a new post";
    }
}
