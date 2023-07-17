package com.example.jobboard.posting;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
class PostingRepository {

    private final Map<Long, Posting> storage = new ConcurrentHashMap<>();
    private final AtomicLong SEQUENCE = new AtomicLong(0L);

    public List<Posting> findAll() {
        return List.copyOf(storage.values());
    }

    public Optional<Posting> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public Posting save(Posting posting) {
        if(posting.getId() == null) {
            posting.setId(SEQUENCE.incrementAndGet());
        }
        storage.put(posting.getId(), posting);
        return posting;
    }

    public void deleteById(final Long id) {
        storage.remove(id);
    }
}
