package com.spring.service;

import com.spring.service.model.Book;
import com.spring.service.model.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
public class ServiceApplication {

    private final MongoTemplate mongoTemplate;

    public ServiceApplication(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {

            Book book = new Book();
            book.setId("Scotch Trial");
            book.setData("test3");
            book.setTime("2000-01-03");
            mongoTemplate.insert(book);

            User user = new User();
            user.setId("Park");
            user.setUsername("John");
            user.setPassword(1357);
            mongoTemplate.insert(user);
        };
    }
}
