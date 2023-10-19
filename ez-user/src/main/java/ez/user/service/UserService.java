package ez.user.service;

import ez.common.dto.user.UserDto;
import lombok.NonNull;

public interface UserService {
  UserDto createUser(@NonNull UserDto userDto);
}
