package com.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.model.Employee;

import reactor.core.publisher.Flux;
 
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<Employee> findByName(final String name);
}