package com.cxf.rest.service;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.cxf.rest.vo.Book;

@Path("/book")
public interface BookService {
    @GET
    @Produces("application/json")
    Book getThatBook(Long id) ;
}

class BookServiceImpl 
    implements BookService {
   
	public Book getThatBook(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}