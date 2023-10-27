package ez.user.controller;

import ez.common.dto.user.UserDto;
import ez.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service/v1")
public class UserController {

  @Autowired private UserService userService;

  /**
   * Help to create new user of any type
   *
   * @param userDto New user info
   */
  //user-service/v1/create-user
  @PostMapping("create-user")
  public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {

    if (userDto != null) {
      return ResponseEntity.ok(userService.createUser(userDto));
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
  }
}
