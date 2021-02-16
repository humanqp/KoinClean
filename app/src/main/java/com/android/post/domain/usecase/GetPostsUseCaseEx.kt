package com.android.post.domain.usecase

import com.android.post.domain.model.Post
import com.android.post.domain.repository.PostsRepository
import com.android.post.domain.usecase.base.UseCase

/**
 * 네트워크 Repository를 주입 받아 결과 리턴
 */
class GetPostsUseCaseEx constructor(
    private val postsRepository: PostsRepository
) : UseCase<List<Post>, Any?>() {

    override suspend fun run(params: Any?): List<Post> {
        return postsRepository.getPostsEx()
    }
}