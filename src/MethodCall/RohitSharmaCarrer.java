package MethodCall;

public class RohitSharmaCarrer {

	public static void main(String[] args) 
	{
		RohitSharmaCarrer rsc = new RohitSharmaCarrer();
		rsc.matches(44, 228, 224, 104);
		rsc.rs(3076,9286,3608,8033);
		rsc.ba(46.6, 48.6, 32.75, 54.64);
		rsc.hf("8/14","29/44","4/16","25/34");
		rsc.ts(212, 264, 118, 309);
		rsc.bb(383, 292, 68, 2153);
		rsc.wii(45, 78,50, 89);
		rsc.wim();
	}
	public void matches(int test,int odi,int t20i,int fc )
	{
		System.out.println("============   Rohit Sharma Cricket Carrier   ============");
		System.out.println("                    Test        ODI      T20I       FC ");
		System.out.println("   Matches           "+test+"         "+odi+"      "+t20i+"        "+fc);		
	}
     public  void rs(int test,int odi,int t20i,int fc)
	{
    	
		System.out.println("   Run Score         "+test+"       "+odi+"     "+t20i+"       "+fc);	
	}
	public void ba(double test,double odi,double t20i,double fc)
	{
		System.out.println("   Batting Average   "+test+"       "+odi+"     "+t20i+"      "+fc);
	}
	public void hf(String test,String odi,String t20i,String fc)
	{
		System.out.println("   100s/50s          "+test+"       "+odi+"     "+t20i+"     "
				+ " "+fc);	
	}
	public void ts(int test,int odi,int t20i,int fc)
	{
		System.out.println("   Top Score         "+test+"        "+odi+"      "+t20i+"        "+fc);
	}
	public void bb(int test,int odi,int t20i,int fc)
	{
		System.out.println("   Ball Bowled       "+test+"        "+odi+"      "+t20i+"         "+fc);
	}
	public void wii(int test,int odi,int t20i,int fc)
	{
		System.out.println("   Catches            "+test+"        "+odi+"       "+t20i+"          "+fc);
	}
	public void wim()
	
	{
		System.out.println("==========================================================");	
	}
	

	
}
