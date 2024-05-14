package org.acme.service;

import io.smallrye.mutiny.Uni;
import org.acme.dtos.response.BillResponse;

public interface BIllService {
    Uni<Void> create()
}
