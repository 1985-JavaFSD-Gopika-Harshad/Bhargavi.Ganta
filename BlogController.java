package com.example.demo.controller;


import com.example.blog.model.BlogPost;
import com.example.blog.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class BlogController {
    @Autowired
    private BlogPostService blogPostService;

    @PostMapping
    public BlogPost createPost(@RequestBody BlogPost post) {
        return blogPostService.createPost(post);
    }

    @PutMapping("/{id}")
    public BlogPost updatePost(@PathVariable Long id, @RequestBody BlogPost post) {
        return blogPostService.updatePost(id, post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        blogPostService.deletePost(id);
    }

    @GetMapping
    public List<BlogPost> getAllPosts(@RequestParam(required = false) String title) {
        return title != null ? blogPostService.searchPosts(title) : blogPostService.getAllPosts();
    }
}
