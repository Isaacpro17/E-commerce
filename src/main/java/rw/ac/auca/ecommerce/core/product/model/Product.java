package rw.ac.auca.ecommerce.core.product.model;

import java.time.LocalDate;
import java.util.UUID;

public class Product {
    private UUID id;
    private String productName;
    private String description;
    private Double price;
    private LocalDate manufacturingDate;
    private LocalDate expirationDate;
    private boolean active;
}
