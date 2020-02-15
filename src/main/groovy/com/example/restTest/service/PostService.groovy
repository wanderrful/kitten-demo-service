package com.example.restTest.service

import com.example.restTest.delegate.PostDelegate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostService {

    @Autowired
    PostDelegate postDelegate

    def getPostsPlainJSON() {
        postDelegate.getPostsPlainJSON()
    }

    def getPostWithUrlParameters(int postId) {
        postDelegate.getPostWithUrlParameters(postId)
    }
}