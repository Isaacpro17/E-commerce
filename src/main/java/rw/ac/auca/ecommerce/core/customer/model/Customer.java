package rw.ac.auca.ecommerce.core.customer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rw.ac.auca.ecommerce.core.base.AbstractBaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;
@Getter
@Setter
@Entity
public class Customer extends AbstractBaseEntity {
    @Column(name = "first_name",nullable = false)
    private String firstname;
    @Column(name = "last_name",nullable = false)
    private String lastname;
    @Column(name = "email;",nullable = false,unique = true)
    private String email;
    @Column(name = "phoneNumber",nullable = false, unique = true)
    private String phoneNumber;
    private boolean active;
    private String address;


}


