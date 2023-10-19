package ez.user.util;

import ez.common.dto.user.UserDto;
import ez.user.model.UserEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ModelConverter {

  public static UserEntity fromUserDtoToUserEntity(@NonNull UserDto userDto, @NonNull String uuid) {

    return UserEntity.builder()
        .name(userDto.getName())
        .mobile(userDto.getMobile())
        .email(userDto.getEmail())
        .userType(userDto.getUserType())
        .build();
  }

  public static UserDto fromUserEntityToUserDto(@NonNull UserEntity userEntity) {
    return UserDto.builder()
        .name(userEntity.getName())
        .mobile(userEntity.getMobile())
        .email(userEntity.getEmail())
        .build();
  }
}
