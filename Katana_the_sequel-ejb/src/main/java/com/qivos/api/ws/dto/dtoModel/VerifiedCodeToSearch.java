
package com.qivos.api.ws.dto.dtoModel;

import javax.validation.constraints.NotNull;

/**
 *
 * @author marianna
 */
public class VerifiedCodeToSearch {
    
    @NotNull(message = "Code may not be null")
    private String verifiedCode;
    @NotNull(message = "IsHashed may not be null")
    private Boolean isHashed;

    public VerifiedCodeToSearch() {
    }

    public VerifiedCodeToSearch(String verifiedCode, Boolean isHashed) {
        this.verifiedCode = verifiedCode;
        this.isHashed = isHashed;
    }
    

    public String getVerifiedCode() {
        return verifiedCode;
    }

    public void setVerifiedCode(String verifiedCode) {
        this.verifiedCode = verifiedCode;
    }

    public Boolean getIsHashed() {
        return isHashed;
    }

    public void setIsHashed(Boolean isHashed) {
        this.isHashed = isHashed;
    }
    
    
}
