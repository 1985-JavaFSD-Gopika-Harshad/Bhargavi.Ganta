package com.example.demo.model;


	import javax.persistence.*;

	@Entity
	public class Author {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;

	    // Getters and Setters
	}

