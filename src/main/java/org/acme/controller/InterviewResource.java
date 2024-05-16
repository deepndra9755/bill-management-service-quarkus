package org.acme.controller;


import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.dto.request.CandidateRequest;
import org.acme.service.IInterviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class InterviewResource {
    public static final Logger log = LoggerFactory.getLogger(InterviewResource.class);
    @Inject
    private IInterviewService iInterviewService;

    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<String> register(CandidateRequest requestDto) {
        log.info("PatientResource:createPatient exe... {}", requestDto);
        return iInterviewService.register(requestDto).map(s -> s);
    }

}