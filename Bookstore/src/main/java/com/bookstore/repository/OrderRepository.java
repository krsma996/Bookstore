package com.bookstore.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Order;

@Transactional
public interface OrderRepository extends CrudRepository<Order, Long > {

}
