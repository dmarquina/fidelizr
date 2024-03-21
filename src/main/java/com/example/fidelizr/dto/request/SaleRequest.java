package com.example.fidelizr.dto.request;

import lombok.Data;

@Data
public class SaleRequest {
    private String product;
    private String userId;
    private Double price;

}
