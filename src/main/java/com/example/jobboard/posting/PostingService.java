package com.example.jobboard.posting;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
class PostingService {

    private final PostingRepository postingRepository;

    PostingService(PostingRepository postingRepository) {
        this.postingRepository = postingRepository;
    }

    public List<Posting> getAll() {
        return null;
    }

    public Optional<Posting> getById(Long id) {
        return null;
    }

    public Posting add(Posting posting) {
        return null;
    }

    public Optional<Posting> update(Long id, Posting posting) {
        return null;
    }

    public void deleteById(Long id) {

    }
}
