package org.acme.dto.request;


import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@RegisterForReflection
@Getter
@Setter
public class CandidateRequest implements Serializable {
    private String candidateName;
    private String lastName;
    private String address;
    private Long mobileNumber;
    private String aadharNumber;
    private String position;
}
