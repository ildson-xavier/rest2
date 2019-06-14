package fiap.scj.service;

import java.util.ArrayList;
import java.util.List;

import fiap.scj.model.Vehicle;

public class VehicleService {

	private static List<Vehicle> lista = new ArrayList<>();
	
	public VehicleService() {
		if (lista.isEmpty()) {
			this.init();
		}
	}

	public List<Vehicle> listarVeiculos() {
		return lista;
	}

	public Vehicle getVehicle(String id) {
		return lista.stream().filter(veiculo -> veiculo.getId().equals(id)).findFirst().orElse(null);
	}
	
	public void createVehicle(Vehicle vehicle) {
		lista.add(vehicle);
	}
	
	public void updateVehicle(Vehicle vehicle) {
		Vehicle v = lista.stream().filter(veiculo -> veiculo.getId().equals(vehicle.getId())).findFirst().orElse(null);
		lista.remove(v);
		lista.add(vehicle);
	}
	
	public void deleteVehicle (String id) {
		Vehicle v = lista.stream().filter(veiculo -> veiculo.getId().equals(id)).findFirst().orElse(null);
		lista.remove(v);
	}

	public void init() {
		lista = new ArrayList<Vehicle>();
		lista.add(new Vehicle("1", "Chevlote", "Vermelho", 2014, "Onixi"));
		lista.add(new Vehicle("2", "Chevlote", "Azul", 2016, "Onixi"));
		lista.add(new Vehicle("3", "Ford", "Fiesta", 2015, "Onixi"));
		lista.add(new Vehicle("4", "Ford", "Ca", 2016, "Onixi"));
	}
	
	
}
