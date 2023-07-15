package CameraRental;

public class Data {
	private int camera_id;
	private String brand;
	private String model;
	private double price;
	private boolean status;

	Data(int camera_id, String brand, String model, double price, boolean Available) {
		this.camera_id = camera_id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = Available;
	}

	public int getId() {
		return camera_id;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return status;
	}

	public void setAvailable(boolean Available) {
		this.status = Available;
	}


}
