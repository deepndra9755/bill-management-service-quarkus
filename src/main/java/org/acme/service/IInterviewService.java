package org.acme.service;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.dto.request.CandidateRequest;
import org.acme.entities.Candidate;

public interface IInterviewService {

    public Uni<String> register(CandidateRequest candidate);
}
