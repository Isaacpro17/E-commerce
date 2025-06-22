package rw.ac.auca.ecommerce.core.customer.service;



import rw.ac.auca.ecommerce.core.customer.model.Customer;

import java.util.UUID;

public interface ICustomerService {
    Customer registerCustomer(Customer thecustomer);
    Customer updateCustomer(Customer thecustomer);
    Customer deleteCustomer(Customer thecustomer);
    Customer findCustomerByIdAndState(UUID id, Boolean state);
    Customer findCustomerByEmailAndState(String email, Boolean state);
    Customer findCustomerByState(String email);
}
