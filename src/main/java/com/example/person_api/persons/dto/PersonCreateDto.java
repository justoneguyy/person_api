package com.example.person_api.persons.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PersonCreateDto {

    @NotBlank(message = "firstName cannot be blank")
    private String firstName;

    @NotBlank(message = "surName cannot be blank")
    private String surName;

    private String message;
}
