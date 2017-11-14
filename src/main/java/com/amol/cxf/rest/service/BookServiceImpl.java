package com.amol.cxf.rest.service;

import java.util.Iterator;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.spring.jpa.entity.Cat;
import com.amol.spring.jpa.repository.CatRepository;

@Path("/book")
@Consumes("application/json")
@Produces("application/json")
@Service
public class BookServiceImpl 
    {
	@Autowired
	CatRepository catRepository;
	
	@GET
	@Path("/get")
	@Consumes("application/json")
	@Produces("application/json")	
	public Response getThatBook() {
		// TODO Auto-generated method stub
		System.out.println("CXF_REST");
		Iterable<Cat> cats = catRepository.findAll();
		Iterator iterator =cats.iterator(); 
		while(iterator.hasNext()) {
			Cat cat = (Cat) iterator.next();
			System.out.println("Name: "+cat.getName() );
			System.out.println("Owner: "+cat.getOwner() );

		}
		return Response.status(200).entity("Hi From BookService").build();
		
	}
}