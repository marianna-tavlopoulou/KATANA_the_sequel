
package com.qivos.api.ws.dto;

import com.qivos.api.ws.dto.dtoModel.NewVerificationCodeDto;
import java.util.List;

/**
 *
 * @author marianna
 */
public class RequestVerifiedCodesToPersistOrUpdate {
    
    private List<NewVerificationCodeDto> incomingVerificationCodeList;

    public RequestVerifiedCodesToPersistOrUpdate() {
    }

    public RequestVerifiedCodesToPersistOrUpdate(List<NewVerificationCodeDto> incomingVerificationCodeList) {
        this.incomingVerificationCodeList = incomingVerificationCodeList;
    }

    public List<NewVerificationCodeDto> getIncomingVerificationCodeList() {
        return incomingVerificationCodeList;
    }

    public void setIncomingVerificationCodeList(List<NewVerificationCodeDto> incomingVerificationCodeList) {
        this.incomingVerificationCodeList = incomingVerificationCodeList;
    }
    
    
    
}
