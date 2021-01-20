package com.sebastian_daschner.learning_java_ee.boundary;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sebastian_daschner.learning_java_ee.entity.Car;
import com.sebastian_daschner.learning_java_ee.entity.Specification;

@Path("cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarsResource {

	@Inject
	CarManufacturer carManufacturer;

	@GET
	public List<Car> retrieveCars() {
		return carManufacturer.retrieveCars();
	}

	@POST
	public void createCar(Specification specification) {
		carManufacturer.manufactureCar(specification);
	}

}
