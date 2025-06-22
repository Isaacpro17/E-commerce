package rw.ac.auca.ecommerce.core.product.model;

import rw.ac.auca.ecommerce.core.util.product.EStockState;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Product {
    private UUID id;
    private String productName;
    private String description;
    private Double price;
    private LocalDate manufacturingDate;
    private LocalDate expirationDate;
    private boolean active;
    private EStockState stockState;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
