package org.kainos.ea.resources;

import io.swagger.annotations.Api;
import org.kainos.ea.api.EmployeeService;
import org.kainos.ea.client.FailedToGetEmployeeException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api("Engineering Academy Dropwizard Employee APL")
@Path("/api")
    public class EmployeeController {
        private EmployeeService employeeService = new EmployeeService();

        @GET
        @Path("/employees")
        @Produces(MediaType.APPLICATION_JSON)
        public Response getEmployees() throws FailedToGetEmployeeException {
            return Response.ok(employeeService.getAllEmployees()).build();

        }
//
//    @POST
//    @Path("/products")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response createEmployee(EmployeeRequest employee){
//
//        try {
//            return Response.ok(employeeService.createEmployee(employee)).build();
//        } catch (FailedToCreateEmployeeException e) {
//            System.err.println(e.getMessage());
//
//            return Response.serverError().build();
//        }catch (InvalidEmployeeException e){
//            System.err.println(e.getMessage());
//
//            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
//        }
//
//
//    }

}


