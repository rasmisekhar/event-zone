package ez.user.service;

import ez.common.dto.user.UserDto;
import ez.user.model.UserEntity;
import ez.user.repository.UserRepository;
import ez.user.util.ModelConverter;
import ez.user.util.UUIDUtil;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserRepository userRepository;

  /**
   * Helps to create new user
   *
   * @param userDto User info to create new user
   */
  @Override
  public UserDto createUser(@NonNull UserDto userDto) {

    String uuid = UUIDUtil.generateRandomUUID();
    UserEntity userEntity = ModelConverter.fromUserDtoToUserEntity(userDto, uuid);
    userEntity.setUuid(uuid);
    return ModelConverter.fromUserEntityToUserDto(userRepository.save(userEntity));
  }
}
