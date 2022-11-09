package p1;

public  abstract class Device {
	private String deviceName;
	private String modelNumber;
	private int cost;
	private int avgRating;
	private String brandName;
	private int  ram;
	public abstract void playGames();
	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public Device()
	{
		super();
	}
	
	
	public Device(String deviceName, String modelNumber, int cost, int avgRating, String brandName,int ram) {
		super();
		this.deviceName = deviceName;
		this.modelNumber = modelNumber;
		this.cost = cost;
		this.avgRating = avgRating;
		this.brandName = brandName;
		this.ram=ram;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public void printAllDeviceDetails()
	{
		System.out.println(deviceName+"-"+ modelNumber +"-"+ cost + "-"+avgRating+"-"+brandName+"-"+ram);
	}
	 public void printDeviceDetails() {
		   System.out.println("Device Name is "+deviceName);
		   System.out.println("Cost of device is "+cost);
		   System.out.println("Brand name is "+brandName);
		   System.out.println("Average rate is "+avgRating);
		   System.out.println("Model number is "+modelNumber);
	   }
	
	

}
