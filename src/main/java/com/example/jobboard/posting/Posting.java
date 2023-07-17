package com.example.jobboard.posting;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
class Posting {
    private Long id;
    private String description;
    private BigDecimal salary;
    private LocalDate expiresAt;
    private Company company;
}
