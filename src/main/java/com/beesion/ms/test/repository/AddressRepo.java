/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.repository;


import java.util.List;

import com.beesion.ms.model.Address;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
/**
 *
 * @author Luis
 *Repositorio responsable de acceder a la base de datos para la entidad Address.
 *Aplica SRP al encargarse únicamente de operaciones de persistencia.
 */

@ApplicationScoped
public class AddressRepo {

    @Inject
    EntityManager em;

    public void save(Address address) {
        em.persist(address);
    }

    public List<Address> findByPersonId(Long personId) {
        return em.createQuery("SELECT a FROM adress a WHERE a.person.id = :id", Address.class)
                 .setParameter("id", personId)
                 .getResultList();
    }
}
