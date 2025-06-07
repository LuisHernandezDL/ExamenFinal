/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.beesion.ms.model.Address;
import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.dto.AddressMapper;
import com.beesion.ms.test.repository.AddressRepo;
import com.beesion.ms.test.repository.PersonRepo;
import com.beesion.ms.test.service.IAddressService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
/**
 *
 * @author Luis
 * Servicio que implementa la lógica de negocio relacionada con direcciones.
 * Aplica SRP al encargarse solo de la lógica de guardar y listar direcciones.
 */

@ApplicationScoped
public class AddressService implements IAddressService {
    @Inject
    AddressRepo addressRepo;

    @Inject
    PersonRepo personRepo;

    @Override
    @Transactional
    public void save(Long personId, AddressDto dto) {
        Person p = personRepo.findById(personId);
        Address address = AddressMapper.toEntity(dto, p);
        addressRepo.save(address);
    }

    @Override
    public List<AddressDto> findByPersonId(Long personId) {
        List<Address> list = addressRepo.findByPersonId(personId);
        return list.stream()
                   .map(AddressMapper::toDto)
                   .collect(Collectors.toList());
    }
}
