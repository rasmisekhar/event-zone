package ez.user.util;

import java.util.UUID;

public class UUIDUtil {

  /** Help to generate random UUID */
  public static String generateRandomUUID() {
    return UUID.randomUUID().toString();
  }
}
