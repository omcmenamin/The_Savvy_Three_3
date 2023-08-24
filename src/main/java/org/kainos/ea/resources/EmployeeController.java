package org.kainos.ea.resources;

import io.swagger.annotations.Api;
import org.kainos.ea.api.EmployeeService;
import org.kainos.ea.client.FailedToGetEmployeeException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api("Engineering Academy Dropwizard Employee APL")
@Path("/api")
    public class EmployeeController {
        EmployeeService employeeService = new EmployeeService();

        @GET
        @Path("/employees")
        @Produces(MediaType.APPLICATION_JSON)
//        public Response getEmployees() {
//            try {
//                return Response.ok(e.getAllEmployees()).build();
//
//            } catch (FailedToGetEmployeeException e) {
//                System.err.println(e.getMessage());
//
//                return Response.serverError().build();
//
//            }
//
//        }

    public String getEmployees(){
            return "Replace this with a list of employees";
        }

}
