package com.example.restTest.controller

import com.example.restTest.model.Post
import com.example.restTest.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "/posts")
class PostController {
    final PostService postService

    PostController(PostService postService) {
        this.postService = postService
    }

    @GetMapping("")
    List<Post> getPosts() {
        postService.getPostsPlainJSON()
    }

    @GetMapping("/{postId}")
    Post getPostById(@PathVariable int postId) {
        postService.getPostWithUrlParameters(postId)
    }
}
