package com.example.jobboard.posting;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
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

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        final Posting posting = (Posting) o;
        return id != null && Objects.equals(id, posting.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
