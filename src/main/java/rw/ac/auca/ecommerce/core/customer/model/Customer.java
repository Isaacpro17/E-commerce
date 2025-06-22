package rw.ac.auca.ecommerce.core.customer.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Customer {
    private UUID id;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private boolean active;
    private String address;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
