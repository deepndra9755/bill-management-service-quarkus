package org.acme.controller;

import io.smallrye.mutiny.Uni;
import org.acme.dtos.request.BillRequest;
import org.acme.dtos.response.BillResponse;

import javax.validation.Valid;
import javax.ws.rs.Path;

@Path("")
public class BillController {

    public Uni<BillResponse> create(@Valid BillRequest billRequest){


    }



}
