package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.model.Customer;

import java.util.List;

public interface CustomerRepository {

    //CRUD CREATE READ UPDATE DELETE
    //interface kathorizei ti sumperifora tis class
    //kai dilwnei tis methodous pou tha exei

    boolean createCustomer(Customer customer);
    Customer readCustomer(int id);
    List<Customer> readCustomer();

    boolean updateCustomer(int id, String newAddress);
    boolean deleteCustomer(int id) throws CustomerException;

}
