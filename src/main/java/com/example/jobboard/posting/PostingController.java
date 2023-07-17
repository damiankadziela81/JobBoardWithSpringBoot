package com.example.jobboard.posting;

import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/postings")
class PostingController {

    @GetMapping
    public String getAll() {
        return "GET - get all";
    }

    @GetMapping("/{id}")
    public Posting getById(@PathVariable Long id) {
        return new Posting(
                id,
                "Java dev",
                new BigDecimal("15000.00"),
                LocalDate.now().plusMonths(1)
        );
    }

    @PostMapping
    public String add() {
        return "OK";
    }

    @PutMapping
    public String update() {
        return "OK";
    }

    @DeleteMapping
    public String delete() {
        return "OK";
    }

}
