package testarray;

public class thread_one {
	public static void main(String args[])
	{
		xyz xy = new xyz();
		xy.start();

		int i;		
		for(i=0;i<=50;i++)
		{
			System.out.println("aa");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	 

}

class xyz extends Thread
{
	public void run()
	{
int i ;
		for(i=0;i<50;i++)
		{
			System.out.println(i);
			try {
				sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
