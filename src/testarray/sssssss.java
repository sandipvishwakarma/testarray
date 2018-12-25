package testarray;

class sssssss
{
	public static void main(String args[])
	{
		resource r = new resource();
		
		consumer c = new consumer(r);
		producer p = new producer(r);
		c.start();
		p.start();
		
//		System.out.println("Hello");
		
	}

}

class consumer extends Thread
{
	resource r;
	consumer(resource r1)
	{
		r = r1;
	System.out.println("25");
	}
	public void run()
	{
		System.out.println("28");
		try 
		{
			r.read();
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class resource
{
	synchronized public void read () throws InterruptedException
	{
		
		for(int i=0;i<=20;i++)
		{
			System.out.println("ww");
			Thread.sleep(1000);
		}
	}
		synchronized public void write() throws InterruptedException
		{
			for(int j = 0; j<=20;j++)
			{
				System.out.println("aa");
				Thread.sleep(1000);
			}
		}
	
	 
}
class producer extends Thread
{
	resource r;
	producer(resource r2)
	{
		r=r2;	
	}
	public void run() {
	
		try
		{
			r.write();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
