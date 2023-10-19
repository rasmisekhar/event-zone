package ez.user.model;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class BaseEntity {
    @Id
    private String uuid;
}
