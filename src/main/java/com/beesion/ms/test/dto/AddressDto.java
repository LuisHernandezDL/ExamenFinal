/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.dto;

/**
 *
 * @author Luis
 *  Objeto de transferencia de datos (DTO) que representa una dirección sin exponer la entidad real.
    acilita el uso de buenas prácticas como la separación de capas y la validación.
 */
public class AddressDto {
    private String street;
    private String city;

    // Getters y Setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
