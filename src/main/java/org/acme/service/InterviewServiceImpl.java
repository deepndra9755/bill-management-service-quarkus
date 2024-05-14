package org.acme.service;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dto.request.CandidateRequest;
import org.acme.entities.Candidate;

@ApplicationScoped
public class InterviewServiceImpl implements IInterviewService{
    @Override
    public Uni<String> register(CandidateRequest candidate) {
        return Uni.createFrom().item("found candidate");
    }
}
