package fiap.scj.rest;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fiap.scj.model.Vehicle;
import fiap.scj.service.VehicleService;

@Path("/vehicles")
public class VehicleResource {

	private VehicleService service = new VehicleService();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Vehicle> getVehicles() {
		return service.listarVeiculos();
	}
	
	@Path("{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Vehicle oneVehicle(@PathParam("id") String id) {
		return service.getVehicle(id);
	}

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	public Response createVehicle(Vehicle vehicle) {
		service.createVehicle(vehicle);
		return Response.created(URI.create("/" + vehicle.getId())).build();
	}

}
