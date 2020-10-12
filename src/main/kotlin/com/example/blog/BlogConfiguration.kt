package com.example.blog

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

	@Value("\${blog.title2:test}")
	lateinit var testString:String;

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
							articleRepository: ArticleRepository) = ApplicationRunner {

        val smaldini = userRepository.save(User("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(Article(
				title = "Reactor Bismuth is out",
				headline = "Lorem ipsum",
				content = "dolor sit amet",
				author = smaldini
		))
		println(testString)
        articleRepository.save(Article(
				title = "Reactor Aluminium has landed",
				headline = "Lorem ipsum",
				content = "dolor sit amet",
				author = smaldini
		))
    }
}
