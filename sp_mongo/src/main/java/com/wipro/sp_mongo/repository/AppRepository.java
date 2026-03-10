package com.wipro.sp_mongo.repository;



import com.wipro.sp_mongo.entity.App;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppRepository extends MongoRepository<App,String> {
}
