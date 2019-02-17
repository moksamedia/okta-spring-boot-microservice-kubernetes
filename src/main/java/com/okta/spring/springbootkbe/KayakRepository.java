package com.okta.spring.springbootkbe;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface KayakRepository extends ReactiveMongoRepository<Kayak, Long> {
}
