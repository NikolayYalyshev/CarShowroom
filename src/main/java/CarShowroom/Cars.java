package CarShowroom;

public class Cars {
	private String name;
	private String model;
	private int age;
	private double engineVolume;
	private int carPower;
	private int mileage;
	private int price;
	
	public Cars(String name, String model, int age, double engineVolume,
				int carPower, int mileage, int price) {
		this.name = name;
		this.model = model;
		this.age = age;
		this.engineVolume = engineVolume;
		this.carPower = carPower;
		this.mileage = mileage;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		if (model != null) {
			this.model = model;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 1900 && age < 2022) {
			this.age = age;
		}
	}
	
	public double getEngineVolume() {
		return engineVolume;
	}
	
	public void setEngineVolume(double engineVolume) {
		if (engineVolume > 0.5) {
			this.engineVolume = engineVolume;
		}
	}
	
	public int getCarPower() {
		return carPower;
	}
	
	public void setCarPower(int carPower) {
		if (carPower > 13) {
			this.carPower = carPower;
		}
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int mileage) {
		if (mileage > 0) {
			this.mileage = mileage;
		}
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		}
	}
	
	@Override
	public String toString() {
		return "Cars{" + "name='" + name + '\'' + ", model='" + model + '\'' +
				", age=" + age + ", engineVolume=" + engineVolume +
				", carPower=" + carPower + ", price=" + price + '}';
	}
	
}
