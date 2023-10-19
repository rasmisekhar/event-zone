package ez.common.dto.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

  private String userType;
  private String name;
  private String mobile;
  private String email;
}
