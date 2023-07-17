package com.example.jobboard.posting;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

@Data
class Company {

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
