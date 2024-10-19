package com.example.demo.model;

	import javax.persistence.*;
	import java.util.Date;

	@Entity
	public class Book {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String title;
	    private String isbn;

	    @ManyToOne
	    @JoinColumn(name = "author_id")
	    private Author author;

	    private boolean isBorrowed;
	    private Date dueDate;

	    // Getters and Setters
	}

}
