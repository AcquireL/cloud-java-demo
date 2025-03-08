package com.kali.api;


import com.kali.dao.entity.Person;
import com.kali.dao.mapper.PersonMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/person")
public class PersonResource {

    @Inject
    PersonMapper personMapper;

    @GET
    @Path("/find")
    public Response findPerson(@QueryParam("name") String name) {
        Person person = personMapper.findByName(name);
        if (person == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(person).build();
    }

    @GET
    @Path("/all")
    public Response findAll() {
        List<Person> persons = personMapper.findAll();
        return Response.ok(persons).build();
    }
}
