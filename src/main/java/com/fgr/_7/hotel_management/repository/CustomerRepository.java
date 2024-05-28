package com.fgr._7.hotel_management.repository;

import com.fgr._7.hotel_management.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
