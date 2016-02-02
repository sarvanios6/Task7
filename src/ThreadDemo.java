

import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThreadDemo implements Runnable {

	Thread t;
	String current_date;

	public void run() {
		for (int i = 0; i < 10; i++) {

			current_date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
			System.out.println("Message from Subscriber: "+i+ "\n Message Recived on : " +current_date);

			try {
				// thread to sleep for 5000 milliseconds
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new ThreadDemo());
		// this will call run() function
		t.start();
	}
} 

