//package com.mongoservice.service;
//
//import com.mongoservice.modeltruc .Person;
//import com.mongoservice.repositories.PersonRepo;
//import org.bson.Document;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.aggregation.Aggregation;
//import org.springframework.data.mongodb.core.aggregation.MatchOperation;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//@Service
//public class PersonService {
//
//    @Autowired
//    private PersonRepo repository;
//
//    @Autowired
//    MongoTemplate mongoTemplate;
//
//    public Document abc() {
//        Person person = repository.findById("5eac5162b6a33a6a37b8c8de").orElse(null);
//
//        return repository.getByabc();
//    }
//
//    public Object abcd() {
//
//        Aggregation aggregation = Aggregation
//                .newAggregation(
////                        Aggregation.match(Criteria.where("content").("")),
//
//                        Aggregation.project( "postTitle", "content", "createTime", "idUserComment")
//                                .andExclude("_id"),
//                        Aggregation.sort(Sort.Direction.DESC, "createTime"),
//                        Aggregation.limit(10)
//                );
//
//
//        Aggregation aggregation1 = Aggregation
//                .newAggregation(
//                        Aggregation.group("postTitle").count().as("count"),
//                        Aggregation.sort(Sort.Direction.ASC, "count")
//                );
//
//        Object o = mongoTemplate.aggregate(aggregation1, "person", Document.class);
//
//
//        System.out.println(o);
//        return mongoTemplate.aggregate(aggregation, "person", Document.class);
//    }
//
//}
