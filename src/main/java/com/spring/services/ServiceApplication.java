package com.spring.services;

import com.spring.services.model.Book;
import com.spring.services.model.User;
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

    /*@Bean
    public ApplicationRunner applicationRunner() {
        return args -> {

            Book book = new Book();
            book.setId("Testing...");
            book.setData("test4");
            book.setTime("2024-11-13");
            mongoTemplate.insert(book);

            User user = new User();
            user.setId("Indeed");
            user.setUsername("LOL");
            user.setPassword(7779);
            mongoTemplate.insert(user);
        };
    }*/
}
