package controlStatement;

public class bikeNmCondition {
	   
         String bikeno="MH12AQ9416";
	public static void main(String[] args)
	{
	        bikeNmCondition bn=new bikeNmCondition();
	        bn.bike1();
	        bn.bike2();

	}
	public void bike1()
	{   
		
		if(bikeno=="MH24MR5159")
		{
			System.out.println("Bike owner : Vijay Kokate");
			System.out.println("RTO        : Latur");
			System.out.println("Company    : Hero-HF_Delux");
		}
	}
		public void bike2()
		{
			if(bikeno=="MH12AQ9416")
			{
			System.out.println("Bike owner : Dipak Mule");
			System.out.println("RTO        : Pune");
			System.out.println("Company    : Hinda-Unicorn");
			}
		}
	}

