package rw.ac.auca.ecommerce.core.customer.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rw.ac.auca.ecommerce.core.customer.model.Customer;

import rw.ac.auca.ecommerce.core.customer.repository.ICustomerRepository;

import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements ICustomerService{

    private final ICustomerRepository customerRepository;

//    @Autowired
//    public CustomerServiceImpl(ICustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    @Override
    public Customer registerCustomer(Customer thecustomer) {
        return customerRepository.save(thecustomer);
    }

    @Override
    public Customer updateCustomer(Customer thecustomer) {
        Customer found = findCustomerByIdAndState(thecustomer.getId(),Boolean.TRUE);
        if(Objects.nonNull(found)){
            found.setFirstname(thecustomer.getFirstname());

            ///....provide all attributes
            return customerRepository.save(found);
        }
        throw new ObjectNotFoundException(Customer.class,"Customer not found");

    }

    @Override
    public Customer deleteCustomer(Customer thecustomer) {
        Customer found = findCustomerByIdAndState(thecustomer.getId(),Boolean.TRUE);
        if(Objects.nonNull(found)){
            found.setActive(Boolean.FALSE);
            return customerRepository.save(found);
        }
        throw new ObjectNotFoundException(Customer.class,"Customer not found");

    }

    @Override
    public Customer findCustomerByIdAndState(UUID id, Boolean state) {
        Customer theCustomer = customerRepository.findByIdAndActive(id, state)
                .orElseThrow(() -> new ObjectNotFoundException(Customer.class, "Customer"));
        return theCustomer;
    }

    @Override
    public Customer findCustomerByEmailAndState(String email, Boolean state) {
        Customer theCustomer = customerRepository.findByEmailAndActive(email, state)
                .orElseThrow(() -> new ObjectNotFoundException(Customer.class, "Customer"));
        return theCustomer;

    }

    @Override
    public Customer findCustomerByState(String email) {
        return null;
    }
}
