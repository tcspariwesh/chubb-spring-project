package com.chuub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chuub.request.Order1;

@Repository
public interface OrderRepository extends CrudRepository<Order1, Integer>{

}
