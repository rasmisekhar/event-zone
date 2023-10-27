package ez.user.model;

import ez.common.entity.BaseEntityDetails;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "user_user")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity extends BaseEntityDetails {
  //For User Details
  private String userType;
  private String name;
  private String mobile;
  private String email;
}
