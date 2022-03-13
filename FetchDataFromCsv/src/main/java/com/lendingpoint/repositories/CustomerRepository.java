package com.lendingpoint.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.lendingpoint.Model.CustomerFileDetails;

import reactor.core.publisher.Mono;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<CustomerFileDetails, String> {

	Mono<CustomerFileDetails> save(CustomerFileDetails customerEntity);
}
