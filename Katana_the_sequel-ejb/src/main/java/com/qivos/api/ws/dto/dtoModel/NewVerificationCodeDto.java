
package com.qivos.api.ws.dto.dtoModel;

import java.util.Date;
import javax.validation.constraints.NotNull;

/**
 *
 * @author marianna
 */
public class NewVerificationCodeDto {
    
    @NotNull(message = "Code may not be null")
    private String hashedCode;
    @NotNull(message = "Metadata may not be null")
    private String metadata;
    private Date verificationDate;
    @NotNull(message = "IsVerified may not be null")
    private Boolean verified;
    @NotNull(message = "IsHashed may not be null")
    private Boolean hashed;

    public NewVerificationCodeDto() {
    }

    public NewVerificationCodeDto(String hashedCode, String metadata, Date verificationDate, Boolean verified, Boolean hashed) {
        this.hashedCode = hashedCode;
        this.metadata = metadata;
        this.verificationDate = verificationDate;
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

    public Date getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Boolean getHashed() {
        return hashed;
    }

    public void setHashed(Boolean hashed) {
        this.hashed = hashed;
    }
}
