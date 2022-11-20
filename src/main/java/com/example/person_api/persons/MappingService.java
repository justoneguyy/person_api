package com.example.person_api.persons;

import com.example.person_api.persons.dto.PersonCreateDto;
import com.example.person_api.persons.dto.PersonGetDto;
import org.springframework.stereotype.Service;

@Service
public class MappingService {

    public PersonEntity mapAddPersonDtoToPerson(PersonCreateDto dto) {
        PersonEntity newPerson = new PersonEntity();
        newPerson.setFirstName(dto.getFirstName());
        newPerson.setSurName(dto.getSurName());

        return newPerson;
    }

    public PersonGetDto mapPersonToGetPersonDto(PersonEntity person) {
        PersonGetDto dto = new PersonGetDto();
        dto.setFirstName(person.getFirstName());
        dto.setSurName(person.getSurName());

        return dto;
    }
}
