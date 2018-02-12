
package com.qivos.api.ws.controllers;

import com.qivos.api.ws.dto.RequestCodesToSearchDto;
import com.qivos.api.ws.dto.dtoModel.VerifiedCodeToSearch;
import com.qivos.api.ws.model.VerifiedCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author marianna
 */

/**
 * 
 * Controller that carries search methods
 */
@Stateless
public class VerifiedCodeDataController {
    
    @Inject
    private EntityManager em;
    
    
    private VerifiedCode findSingleEntityByNamedQuery (String namedQuery, Class<VerifiedCode> clazz, Map<String, String> parameters, int maxResults) {
        TypedQuery query = em.createNamedQuery(namedQuery, clazz);
        for (Entry<String, String> parameter : parameters.entrySet()) {
            query.setParameter(parameter.getKey(), parameter.getValue());
        }
        return (VerifiedCode) query.getSingleResult();
    }
    
    private VerifiedCode findVerifiedByCode (String code) {
        Map<String, String> parameter = new HashMap<>();
        parameter.put("HashedCode", code);
        return findSingleEntityByNamedQuery("VerifiedCode.findByCode", VerifiedCode.class, parameter, 1);
    }
    
    public List<VerifiedCode> findVerifiedByCodeList (RequestCodesToSearchDto codeBatch) {
        
        List<VerifiedCode> verifiedCodeList = new ArrayList<>();
        for(VerifiedCodeToSearch code : codeBatch.getCodesToSearch()) {
            verifiedCodeList.add(findVerifiedByCode(hashCode(code)));
        }
        return verifiedCodeList;
    }
    
    public String hashCode (VerifiedCodeToSearch verifiedCodeToSearch) {
        String hashedCode;
        if (verifiedCodeToSearch.getIsHashed() == false) {
            hashedCode = DigestUtils.sha256Hex(verifiedCodeToSearch.getVerifiedCode());
        } else {
            hashedCode = verifiedCodeToSearch.getVerifiedCode();
        }
        return hashedCode;
        
    }
    
}
