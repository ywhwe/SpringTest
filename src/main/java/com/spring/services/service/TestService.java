package com.spring.services.service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.firebase.cloud.FirestoreClient;
import com.spring.services.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestService {
    public List<User> getUsers() throws Exception{
        List<User> list = new ArrayList<>();
        Firestore firestore = FirestoreClient.getFirestore();
        //컬렉션참조
        CollectionReference collectionRef = firestore.collection("User");
        List<QueryDocumentSnapshot> documents = collectionRef.get().get().getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            list.add(document.toObject(User.class));
        }
        return list;
    }
}
