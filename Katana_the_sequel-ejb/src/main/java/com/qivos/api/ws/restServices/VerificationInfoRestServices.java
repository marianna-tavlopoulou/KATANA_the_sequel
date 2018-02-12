/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qivos.api.ws.restServices;

import com.qivos.api.ws.dto.RequestCodesToSearchDto;
import com.qivos.api.ws.dto.RequestVerifiedCodesToPersistOrUpdate;
import com.qivos.api.ws.dto.ResponseCodeStatusListDto;
import javax.ejb.Stateful;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author martin
 */
@Stateful
@RequestScoped
@Path("/verifiedCodes/")
public class VerificationInfoRestServices {

    @POST
    public Response.ResponseBuilder persistVerifiedCodes(RequestVerifiedCodesToPersistOrUpdate verifiedCodeList) {
        
        return Response.ok("mock ok");
    }

    @POST
    @Path("status")
    public Response.ResponseBuilder askForVerifiedCodeBatch(RequestCodesToSearchDto codes) {
        ResponseCodeStatusListDto  statusList = new ResponseCodeStatusListDto();
        return Response.ok(statusList);
    }

}
