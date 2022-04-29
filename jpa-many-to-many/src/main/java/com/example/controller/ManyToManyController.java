package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.PostRepository;
import com.example.demo.TagRepository;
import com.example.model.Post;

@RestController
@RequestMapping("/savePost")
public class ManyToManyController {
	
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	TagRepository tagRepository;
	
	@PostMapping
	void savePost(@RequestBody Post post) {
		System.out.println(post);
		
		postRepository.save(post);
		

	}

}
