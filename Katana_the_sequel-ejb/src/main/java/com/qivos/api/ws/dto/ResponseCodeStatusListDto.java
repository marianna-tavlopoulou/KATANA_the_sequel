
package com.qivos.api.ws.dto;

import com.qivos.api.ws.dto.dtoModel.VerifiedCodeToSearch;
import com.qivos.api.ws.model.VerifiedCode;
import java.util.List;

/**
 *
 * @author marianna
 */
public class ResponseCodeStatusListDto {
    private List<VerifiedCode> verifiedCodeList;

    public ResponseCodeStatusListDto() {
    }

    public ResponseCodeStatusListDto(List<VerifiedCode> verifiedCodeList) {
        this.verifiedCodeList = verifiedCodeList;
    }

    public List<VerifiedCode> getCodeList() {
        return verifiedCodeList;
    }

    public void setCodeList(List<VerifiedCode> verifiedCodeList) {
        this.verifiedCodeList = verifiedCodeList;
    }
    
    
    
    
}
