package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Post;
import com.example.model.Tag;

@SpringBootApplication
public class JpaManyToManyApplication implements CommandLineRunner {

	@Autowired
	private PostRepository postRespository;
	
	@Autowired
	private TagRepository tagRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaManyToManyApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		postRespository.deleteAllInBatch();
		tagRepository.deleteAllInBatch();
		
		Post post = new Post("Mapping mant to many relationship using hibernate",
				"Mant to Mant with Spring Boot",
				"Entire Post content with sample code");
				
		Tag tag1 = new Tag("Spring Boot");
		Tag tag2 = new Tag("Hibernate");
		
		post.getTags().add(tag1);
		post.getTags().add(tag2);
		
		tag1.getPosts().add(post);
		tag2.getPosts().add(post);
		
		postRespository.save(post);
		
	}

}
