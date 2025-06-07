/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.dto;
import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
/**
 *
 * @author Luis
 * Clase responsable del mapeo entre AddressDto y Address,
 * aplicando el principio de responsabilidad única (SRP).
 */
 

public class AddressMapper {
    
     public static Address toEntity(AddressDto dto, Person person) {
        Address address = new Address();
        address.setStreet(dto.getStreet());
        address.setCity(dto.getCity());
        address.setPerson(person);
        return address;
    }

    public static AddressDto toDto(Address entity) {
        AddressDto dto = new AddressDto();
        dto.setStreet(entity.getStreet());
        dto.setCity(entity.getCity());
        return dto;
    }
}
