package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	
}