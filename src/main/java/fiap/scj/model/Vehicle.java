package fiap.scj.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vehicle {

	private String id;
	private String brand;
	private String color;
	private Integer year;
	private String model;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(String id, String brand, String color, Integer year, String model) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.year = year;
		this.model = model;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
