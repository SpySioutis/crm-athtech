package org.example.repository;

import org.example.model.Address;
import org.example.model.Customer;

public interface CustomerRepository {
    //CRUD
    void create(Customer customer);
    Customer read(int customerId);
    boolean update(int customerId, Address newAddress);
    boolean delete(int customerId);
}
