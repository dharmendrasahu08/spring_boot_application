package com.demo;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/student")
public interface StudentApi {
	
	@GET
    @Path("/{student_id}")
    @Consumes({ "application/json;charset=UTF-8" })
    @Produces({ "application/json" })
    Student getStudent(@PathParam("student_id") int studentId);
    
    @POST
    @Path("/save")
    @Consumes({ "application/json; charset=UTF-8" })
    @Produces({ "application/json" })
    Student saveStudent(Student payload);

}
