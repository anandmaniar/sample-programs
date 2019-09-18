
 1) create a multi-threaded application by using  "extends Thread " method.create 2 threads. they should display characters 
 from A to J.

package Multi_Threading_ass;

public class Multi1 extends Thread
{
   public void run()
   {
	   char ch;
	   for(ch='A';ch<='J';ch++)
	   {
		   System.out.println(ch);
	   }
   }
	public static void main(String[] args)
	{
		Multi1 m = new Multi1();
		Thread t = new Thread(m);
		Thread t1 = new Thread(m);
		t.start();
		t1.start();
	}

}


