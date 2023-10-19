package ez.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseDtoDetail extends BaseDto {

  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
}
