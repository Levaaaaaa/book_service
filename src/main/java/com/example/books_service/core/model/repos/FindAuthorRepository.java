package com.example.books_service.core.model.repos;

import com.example.books_service.core.model.domain.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FindAuthorRepository extends JpaRepository<AuthorEntity, Long> {
    public Optional<AuthorEntity> findByFirstNameAndLastName(String firstName, String lastName);
}
