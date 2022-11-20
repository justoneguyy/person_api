package com.example.person_api.persons;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
