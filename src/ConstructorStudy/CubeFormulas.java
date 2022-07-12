package ConstructorStudy;

public class CubeFormulas 
{
    int a;
    int b;
   // float a;
    public CubeFormulas()
    {
    	a=15;
    	b=25;
    	
    }
    
	public static void main(String[] args)
	
	{
		CubeFormulas tf= new CubeFormulas();
		tf.tf();
		tf.SurfaceArea();
		

	}
	public void tf()
	{
		float v= (float) (a*a*a);
		System.out.println(" Volume of cube = "+v);
		
	}
	public void SurfaceArea()
	{
		float Sa=6*a*a;
		double wp=a/b*100;
		System.out.println("Surface area = "+Sa);
		System.out.println("Winning %    = "+wp);
	}

}
