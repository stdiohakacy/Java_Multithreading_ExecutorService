package _09;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class App {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
//		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			service.submit(new Worker());
		}
	}
}
