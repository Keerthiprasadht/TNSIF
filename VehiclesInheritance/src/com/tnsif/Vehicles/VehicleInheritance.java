package com.tnsif.Vehicles;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class VehicleInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager veh = factory.createEntityManager();
		veh.getTransaction().begin();
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVname("CAR");
		vehicle.setVmodel(2020);
		veh.persist(vehicle);
		
		TwoWheelar twoWheelar = new TwoWheelar();
		twoWheelar.setVname("BIKE");
		twoWheelar.setHandleTwoWheelar("BIKE handle");
		twoWheelar.setVmodel(2020);
		veh.persist(twoWheelar);
		
		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setVname("BENZ");
		fourWheeler.setSteeringFourWheeler("BENZ steering ");
		fourWheeler.setVmodel(2022);
		veh.persist(fourWheeler);
		
		veh.getTransaction().commit();
		
		System.out.println("Added one vehicle  to database.");
		veh.close();
		factory.close();
		
	}

}
