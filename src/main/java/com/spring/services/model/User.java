package com.spring.services.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Setter
@Getter
@Document(collection = "Demo")
public class User {
    @Id
    private String uid;
    private String uname;
    private String pw;
    private String phone;
    private ArrayList<String> entered;
}
