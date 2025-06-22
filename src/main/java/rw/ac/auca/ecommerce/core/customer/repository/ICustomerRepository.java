package rw.ac.auca.ecommerce.core.customer.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.auca.ecommerce.core.customer.model.Customer;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, UUID> {

    Optional<Customer> findByIdAndActive(UUID id, Boolean active);


    Optional<Customer> findByEmailAndActive(String email, Boolean active);


    Optional<Customer> findAllByActive(boolean active);
}
