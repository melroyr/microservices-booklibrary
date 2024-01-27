package ru.fedbon.authserver.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import ru.fedbon.authserver.model.User;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

    Mono<User> findByUsername(String username);
}
