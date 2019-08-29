package prjSleeperBarber;
public class Util 
{
	
	public static void isSleeping(long milis)
	{
		try
		{
			Thread.sleep(milis);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
	
	public static void isWorking(long milis)
	{
		long t0 = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - t0 < milis);
	}

}
