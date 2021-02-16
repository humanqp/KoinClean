package com.android.post.di.module

import com.android.post.presentation.posts.PostsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 *
 * module : koin 모듈 정의(Module - 제공할 객체의 명세)
 * viewModel : Activity나 Fragment에 각 viewModel을 주입
 * factory : 의존성 주입 시점마다 새로운 객체를 매번 생성, Dagger의 Provider 같은 개념
 * single : 해당 객체를 싱글톤으로 생성(App Lifecycle 전체동안 단일 인스턴스)
 * bind : 생성할 객체를 다른 Type으로 바인딩(Class, Interface 상속관계 필요)
 * get() : Component 내에서 알맞은 의존성 주입
 * inject() : get과 같이 알맞은 의존성 주입(by inject() 방식, val에만 가능, var 변수에 사용 불가)
 *
 * */

val AppModule = module {

    viewModel { PostsViewModel(get()) }

    single { createGetPostsUseCase(get()) }

    single { createPostRepository(get()) }

}