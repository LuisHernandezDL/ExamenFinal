package com.beesion.ms.test.resource;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.dto.PersonMapper;
import com.beesion.ms.test.service.impl.PersonService;
/**
 *USO DE LA INTERFAZ IPersonService
 */
import com.beesion.ms.test.service.IPersonService;


import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 * Se aplica SRP al delegar el mapeo a la clase PersonMapper.
 * Se inyecta la interfaz IPersonService en lugar de la clase concreta (DIP).
 */


@Path("/Person")
public class PersonaResource {

	@Inject
        IPersonService personService;
	
        @POST
	public Response save(PersonDto per) {
        Person p = PersonMapper.toEntity(per);
        personService.save(p);
        return Response.ok("Elemento guardado").build();
               
        /*
        
        Person p = new Person();
        p.setName(per.getName());
    	person.save(p);
         */
	}

}
