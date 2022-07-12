package ConstructorStudy;

public class IplCaptaions
{   

	public static void main(String[] args)
	{
		IplCaptaions cap=new IplCaptaions();
		cap.Captaiondetails("Channi Super Kings","M S Dhoni",204,121,82,0,59.60);
		cap.Captaiondetails("Mumbai Indians","Rohit Sharma",129,75,50,4,59.68);
		cap.Captaiondetails("Channi Super Kings","M S Dhoni",140,64,69,3,48.16);

	}

	public void Captaiondetails(String team,String captaion,int m,int w,int l,int t,double wp)
	{
	 
		System.out.println("-------------------------------------------");
		System.out.println("Team        :   "+team);
		System.out.println("Captaion    :   "+captaion);
		System.out.println("Matches     :   "+m);
		System.out.println("Wins        :   "+w);
		System.out.println("Losses      :   "+l);
		System.out.println("Tieds       :   "+t);
		System.out.println("Winning %   :   "+wp);
		System.out.println("-------------------------------------------");
		
	}
}
