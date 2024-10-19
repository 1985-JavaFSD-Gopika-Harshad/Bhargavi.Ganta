package com.example.demo.service;

import com.example.blog.model.BlogPost;
import com.example.blog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogPostService {
    @Autowired
    private BlogPostRepository blogPostRepository;

    public BlogPost createPost(BlogPost post) {
        return blogPostRepository.save(post);
    }

    public BlogPost updatePost(Long id, BlogPost post) {
        post.setId(id);
        return blogPostRepository.save(post);
    }

    public void deletePost(Long id) {
        blogPostRepository.deleteById(id);
    }

    public List<BlogPost> searchPosts(String title) {
        return blogPostRepository.findByTitleContaining(title);
    }

    public List<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }
}
