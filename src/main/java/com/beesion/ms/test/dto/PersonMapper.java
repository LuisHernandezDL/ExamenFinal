/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.dto;
/**
 *
 * @author Luis
 */

import com.beesion.ms.model.Person;

/**
 * Esta clase se encarga exclusivamente de convertir entre PersonDto y Person.
 * Se aplica el principio de responsabilidad única (SRP), evitando que el controlador
 * tenga lógica de transformación de datos.
 */
public class PersonMapper {

    public static Person toEntity(PersonDto dto) {
        Person p = new Person();
        p.setName(dto.getName());
        return p;
    }

    public static PersonDto toDto(Person entity) {
        PersonDto dto = new PersonDto();
        dto.setName(entity.getName());
        return dto;
    }
}