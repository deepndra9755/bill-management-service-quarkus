package org.acme.repo;

import org.acme.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepos extends JpaRepository<Candidate,Integer> {
}
