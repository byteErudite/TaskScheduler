package com.vaibhav.hibernate.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.Instant;

public class BaseEntity implements Serializable {

    /**
     * The creation time.
     */
    @Column(name = "addeddate", nullable = false, insertable = true, updatable = false)
    @CreatedDate
    private Instant creationTime;

    /**
     * The modified by user.
     */
    @Column(name = "lastmodifiedby", nullable = false, insertable = true, updatable = true)
    @LastModifiedBy
    private String modifiedByUser;

    @Column(name = "lastmodifieddate", nullable = false, insertable = true, updatable = true)
    @LastModifiedDate
    private Instant modificationTime;

    private boolean isDeleted;

    public BaseEntity() {
        super();
    }

    public Instant getCreationTime() {
        return this.creationTime;
    }

    public String getModifiedByUser() {
        return modifiedByUser;
    }

    public void setModifiedByUser(final String modifiedByUser) {
        this.modifiedByUser = modifiedByUser;
    }

    public Instant getModificationTime() {
        return this.modificationTime;
    }

    @Column(name = "isDeleted", nullable = false)
    public boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
