package p1;

public class Mobile  extends Device{
	public void setMobliedetails(String deviceName,String modelNumber,int cost,int avgRating,String brandName,int ram)
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
		int currentRam=super.getRam();
		if(currentRam>4)
		{
			System.out.println("User can play games");
			currentRam=-2;
			super.setRam(currentRam);
		}
		else
		{
			System.out.println("user can not play games");
		}
	}
}
