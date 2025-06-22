package rw.ac.auca.ecommerce.core.base;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class AbstractBaseEntity {
    private UUID id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
