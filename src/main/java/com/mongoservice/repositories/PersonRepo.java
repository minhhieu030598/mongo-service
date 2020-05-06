//package com.mongoservice.repositories;
//
//import com.mongoservice.model.Person;
//import org.bson.Document;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//
//import java.util.List;
//
//public interface PersonRepo extends MongoRepository<Person, String> {
//
//    @Query(value = "{ content : 'Test' }", fields = "{_id : 0, content : 1}")
//    Document getByabc();
//
//
//
//
//}
