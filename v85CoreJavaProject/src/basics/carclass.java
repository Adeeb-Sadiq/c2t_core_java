package basics;

public class carclass {
	String brand;
	String model;
	String color;
	int power;
	int price;
	
	public carclass(String brand,String model,String color,int power,int price) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.power = power;
		this.price = price;
	}
	
	public void displayBrand() {
		System.out.println(brand);
	}
}
