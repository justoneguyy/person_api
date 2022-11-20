package com.example.person_api.persons;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository rep;

    public PersonEntity createPerson(PersonEntity person) {
        return rep.save(person);
    }
}
