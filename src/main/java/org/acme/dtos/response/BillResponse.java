package org.acme.dtos.response;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BillResponse {
    private Integer id;
    private String billNumber;
    private String consumerNumber;
    private Double amount;
    private String consumerName;
    private String state;
    private String address;
}
