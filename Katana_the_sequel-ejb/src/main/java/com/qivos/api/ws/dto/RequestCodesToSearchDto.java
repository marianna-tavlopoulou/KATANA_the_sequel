
package com.qivos.api.ws.dto;

import com.qivos.api.ws.dto.dtoModel.VerifiedCodeToSearch;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marianna
 */
public class RequestCodesToSearchDto {

    private List<VerifiedCodeToSearch> codesToSearch;

    public RequestCodesToSearchDto() {
    }

    public List<VerifiedCodeToSearch> getCodesToSearch() {
        return codesToSearch;
    }

    public void setCodesToSearch(List<VerifiedCodeToSearch> codesToSearch) {
        this.codesToSearch = codesToSearch;
    }

    
    
}
