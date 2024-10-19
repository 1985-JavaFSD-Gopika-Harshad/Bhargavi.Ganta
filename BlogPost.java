package com.example.demo.model;

public class BlogPost {

	import javax.persistence.*;
	import java.util.ArrayList;
	import java.util.List;

	@Entity
	public class BlogPost {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    private String content;

	    @OneToMany(mappedBy = "blogPost", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Comment> comments = new ArrayList<>();

	    // Getters and Setters
	}

