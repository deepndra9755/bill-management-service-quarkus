package org.acme.dtos.request;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillRequest implements Serializable {

    private String fatherName;
    private String address;
    private String consumerName;
    private String state;
    private Boolean married;


}
