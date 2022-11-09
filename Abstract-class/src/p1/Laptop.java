package p1;

public  class Laptop extends Device{

	public void setLapTopdetails(String deviceName,String modelNumber,int cost,int avgRating,String brandName,int ram)
	{
		super.setDeviceName(deviceName);
		super.setModelNumber(modelNumber);
		super.setCost(cost);
		super.setAvgRating(avgRating);
		super.setBrandName(brandName);
		super.setRam(ram);
		super.printDeviceDetails();

	}
	public void playGames()
	{
		int currentram=super.getRam();
		super.printAllDeviceDetails();
		if(currentram>10)
		{
			System.out.println("user can play games");
			currentram=-4;
			super.setRam(currentram);
			
		}
		else
		{
			System.out.println("user can not play games");
		}
	}
	
	

}