package p1;

public class Cow extends Animal {
	@Override
	public int doEat(int foodQuantity) {
		int currentCowPower = super.getPower();

		currentCowPower += (foodQuantity);

		super.setPower(currentCowPower);

		return currentCowPower;
	}
	
	public void doGiveMilk()
	{
		int currentCowPower = super.getPower();
		super.printAnimalDetails();
		
		if(currentCowPower>15)
		{
			System.out.println(" Cow is giving Milk ");
			currentCowPower -= 16;
			super.setPower(currentCowPower);
		}
		else
		{
			System.out.println("Cow "+super.getName()+" power is low ("+super.getPower()+") , feed the Cow to gain power");
			
		}
	}

	public void setCowDetails(String name,int power)
	{
		super.setName(name);
		super.setPower(power);
	}
}
