package com.example.person_api.persons;

import com.example.person_api.persons.dto.PersonCreateDto;
import com.example.person_api.persons.dto.PersonGetDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@AllArgsConstructor
@RestController(value = "/persons")
public class PersonController {

    private PersonRepository rep;
    private PersonService service;
    private MappingService mappingService;

    @PostMapping(value = "/newPerson", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonGetDto> createPerson(@RequestBody PersonCreateDto dto) {
        PersonEntity newPerson = mappingService.mapAddPersonDtoToPerson(dto);
        newPerson = service.createPerson(newPerson);
        PersonGetDto personGetDto = mappingService.mapPersonToGetPersonDto(newPerson);
        if (personGetDto != null) {
            return new ResponseEntity<>(personGetDto, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
