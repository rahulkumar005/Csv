package com.lendingPoint.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.lendingPoint.Model.UserFileDetails;

public interface UserRepository extends ReactiveMongoRepository<UserFileDetails,String> {

}
