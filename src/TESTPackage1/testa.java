package TESTPackage1;

public class testa {
     static int a=20;
     int c=15;
     public testa()
     {
    	 System.out.println(a);
     }
     public testa(int a)
     {
    	 System.out.println(a);
     }
     public testa(float d)
     {
    	 this(10);
    	System.out.println(d); 
     }
	public static void main(String[] args)
	{
		testa a= new testa();
		//a.abc();
        abc(10);
	}
    public  void abc()
    {
    	 int a=10;
    	 int b=33;
    int c=this.a+b;
    	System.out.println(c);
    }
    public static void abc(int a)
    {
    	 int c=1;
    	 if(!(c>1))
    		 System.out.println(c);
    	 else
    		 System.out.println("abc");
    	 
    	 if(c==1) 
    		 System.out.println(c);
    	 
    	 else 
    		 System.out.println("   ");
    	 
    	 
    	 
    }

}
