package ez.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntityDetails {

  @Id private String uuid;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;
  private String updatedBy;
}
