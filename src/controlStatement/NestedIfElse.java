package controlStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		String usernm="Vijaykokate";
		String passwrd="Vijay@123";
		long mobn=7770034214l;
		if(usernm=="Vijaykokate")
		{
			System.out.println("Enter Password");
			if(passwrd=="Vijay@123")
			{
				System.out.println("Password is correct");
				if(mobn==7770034214l)
				{
					System.out.println("Moblie number is correct");
				}
				else
				{
					System.out.println("Enter valid mobile number");
				}
				
			}
			else
			{
				System.out.println("Invalid password. Please enter valid password.");
			}
		}
		else
		{
			System.out.println("user name is invalid. Please enter valid user name. ");
		}
	}

}
