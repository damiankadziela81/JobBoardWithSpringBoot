package com.example.jobboard.posting;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Posting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    @Length(min = 1, max = 256)
    private String name;

    @NotNull
    @Email
    private String contact;

    @NotNull
    @URL
    private String website;
}
