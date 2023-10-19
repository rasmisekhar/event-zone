package ez.user.model;

import jakarta.persistence.Column;

import java.util.Date;

public class BaseEntityDetails extends BaseEntity {

    @Column
    private Date createdAt;

    @Column
    private String createdBy;

    @Column
    private Date updatedAt;

    @Column
    private String updatedBy;
}
