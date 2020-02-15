package com.example.restTest.delegate

import com.example.restTest.model.Post
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class PostDelegate {

    final baseUrl = "https://jsonplaceholder.typicode.com"

    RestTemplate restTemplate;

    PostDelegate(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    def getPostsPlainJSON() {
        Post[] response = restTemplate.getForObject("${baseUrl}/posts".toString(), Post[].class, baseUrl)
        Arrays.asList(response)
    }

    def getPostWithUrlParameters(int postId) {
        restTemplate.getForObject("${baseUrl}/posts/${postId}".toString(), Post.class, baseUrl, postId)
    }

}
