package ez.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name="user_user")
@Builder
public class User extends BaseEntityDetails {
    private String userType;
    private String name;
    private String mobile;
    private String email;
}
