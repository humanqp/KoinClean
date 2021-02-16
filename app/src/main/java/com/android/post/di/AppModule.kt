package com.android.post.di.module

import com.android.post.presentation.posts.PostsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * module : 코인 모듈 또는 하휘 모듈 생성
 * factory : 항상 새로운 인스턴스를 생성하도록 해중
 * viewModel : view 모델
 * single : 싱글톤 타입으로 지정해 줌
 * get : 컴포넌트 종속성을 해결해 줌
 * */

val AppModule = module {

    viewModel { PostsViewModel(get()) }

    single { createGetPostsUseCase(get()) }

    single { createPostRepository(get()) }


}