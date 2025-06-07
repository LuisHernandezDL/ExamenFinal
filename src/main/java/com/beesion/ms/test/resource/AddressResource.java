/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.resource;

import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.service.IAddressService;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
/**
 *
 * @author Luis
 * Controlador REST que expone los endpoints para trabajar con direcciones.
 * Aplica buenas prácticas al delegar la lógica de negocio al servicio y usar DTOs para entrada/salida.

 */

@Path("/address")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AddressResource {
     @Inject
    IAddressService addressService;

    @POST
    @Path("/{personId}")
    public Response create(@PathParam("personId") Long personId, AddressDto dto) {
        addressService.save(personId, dto);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Path("/person/{personId}")
    public Response getByPerson(@PathParam("personId") Long personId) {
        List<AddressDto> addresses = addressService.findByPersonId(personId);
        return Response.ok(addresses).build();
    }
}
