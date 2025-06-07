/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.service;
import java.util.List;
import com.beesion.ms.test.dto.AddressDto;
/**
 *
 * @author Luis
 * Interfaz que define el contrato de operaciones para direcciones.
   Aplica el principio de inversión de dependencias (DIP), permitiendo desacoplar la lógica del servicio.
 */
public interface IAddressService {
    void save(Long personId, AddressDto dto);
    List<AddressDto> findByPersonId(Long personId);
}