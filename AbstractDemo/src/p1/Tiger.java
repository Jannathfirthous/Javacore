package p1;

public class Tiger extends Animal {
	@Override
	public int doEat(int foodQuantity) {
		int currentTigerPower = super.getPower();

		currentTigerPower += (foodQuantity);

		super.setPower(currentTigerPower);

		return currentTigerPower;
	}
	
	public void doHunt()
	{
		int currentTigerPower = super.getPower();
		super.printAnimalDetails();
		
		if(currentTigerPower>10)
		{
			System.out.println(" Tiger is doing hunting of the Deer ");
			currentTigerPower -= 9;
			super.setPower(currentTigerPower);
		}
		else
		{
			System.out.println("Tiger "+super.getName()+" power is low ("+super.getPower()+") , feed the Tiger to gain power");
			
		}
	}

	public void setTigerDetails(String name,int power)
	{
		super.setName(name);
		super.setPower(power);
	}
}
