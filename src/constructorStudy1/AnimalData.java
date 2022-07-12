package constructorStudy1;

public class AnimalData
{
	String name;
	float age;
	float he;
	String co;
	
	
	public AnimalData()
	{
		name="xyz";
		age= 25f;
		he=126;
		co="gray";
	}

	public static void main(String[] args) 
	{
		AnimalData ad=new AnimalData();
			ad.cat("Chingi",4.2f,25.2f,"white");
	    ad.cat("pinki", 3.5f, 22.3f, "Black");
		ad.cat(null, 0, 0, null);
			//ad.Student();

	}

	public void cat(String name,float age,float he,String co )
	{
		System.out.println("Name of cat is    : "+name);
		System.out.println("Age of cat is     : "+age+ " months");
		System.out.println("Height of cat is  : "+he+ " cm");
		System.out.println("Colour of cat is  : "+co);
		System.out.println("                      ");
	}
	/*public void Student()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(div);
	}*/
}
