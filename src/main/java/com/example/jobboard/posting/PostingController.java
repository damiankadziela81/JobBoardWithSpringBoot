package com.example.jobboard.posting;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/postings")
class PostingController {

    private final PostingService postingService;

    public PostingController(PostingService postingService) {
        this.postingService = postingService;
    }

    @GetMapping
    public List<Posting> getAll() {
        return postingService.getAll();
    }

    @GetMapping("/{id}")
    public Posting getById(@PathVariable Long id) {
        return postingService.getById(id).orElse(null);
    }

    @PostMapping
    public Posting add(@RequestBody Posting posting) {
        return postingService.add(posting);
    }

    @PutMapping("/{id}")
    public Posting update(@PathVariable Long id, @RequestBody Posting posting) {
        return postingService.update(id, posting).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        postingService.deleteById(id);
    }

}
