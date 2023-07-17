package com.example.jobboard.posting;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
class Posting {
    private Long id;

    @NotNull
    @Length(min = 1, max = 256)
    private String description;

    @NotNull
    @DecimalMin("1800.00")
    private BigDecimal salary;

    @Future
    @NotNull
    private LocalDate expiresAt;

    @NotNull
    @Valid
    private Company company;
}
