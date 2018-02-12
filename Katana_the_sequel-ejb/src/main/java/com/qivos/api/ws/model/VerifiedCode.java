package com.qivos.api.ws.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

/**
 *
 * @author marianna
 */
@Entity
@Table(name = "VerifiedCode", uniqueConstraints = {
    @UniqueConstraint (columnNames = "HashedCode")
})
@AttributeOverride (name = "Id", column = @Column (name = "CodeId"))
@NamedQueries (
@NamedQuery (name = "VerifiedCode.findByCode", query = "SELECT v FROM VerifiedCode v WHERE v.HashedCode = :HashedCode"
))
@DiscriminatorColumn (name = "Metadata", discriminatorType = DiscriminatorType.STRING)
public class VerifiedCode implements Serializable{

    private static final long serialVersionUID = 8707730745453593002L;
    
    @Basic (optional = false)
    @Size (max = 255, message = "HashedCode can't have bigger size than 255")
    @Column (name = "HashedCode", nullable = false, length = 255, unique = true)
    private String hashedCode;
    @Basic (optional = false)
    @Size (max = 255, message = "Metadata can't have bigger size than 255")
    @Column (name = "Metadata", nullable = false, length = 255)
    private String metadata;
    private Boolean verified;
    private Boolean hashed;
    private Date lastChangedDate;
    private Integer successCount;
    private Integer failedCount;
    @Id
    private Long id;

    public VerifiedCode() {
    }

    public VerifiedCode(String hashedCode, String metadata, Boolean verified, Boolean hashed) {
        this.hashedCode = hashedCode;
        this.metadata = metadata;
        this.verified = verified;
        this.hashed = hashed;
    }

    
    public String getHashedCode() {
        return hashedCode;
    }

    public void setHashedCode(String hashedCode) {
        this.hashedCode = hashedCode;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Integer getFailedCount() {
        return failedCount;
    }

    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public Boolean getHashed() {
        return hashed;
    }

    public void setHashed(Boolean hashed) {
        this.hashed = hashed;
    }

    public Date getVerificationDate() {
        return lastChangedDate;
    }

    public void setVerificationDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
