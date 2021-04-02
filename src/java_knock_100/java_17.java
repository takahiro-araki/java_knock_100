package java_knock_100;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class java_17 {

	private static volatile Long num;

	public class ThreadA extends Thread {
		private CountDownLatch latch;

		public ThreadA(CountDownLatch latch) {
			this.latch = latch;
		}

		@Override
		public void run() {
			try {
				latch.await();
				System.out.println("変数参照：" + num);
			} catch (InterruptedException e) {
				System.out.println("エラーが発生しました。：" + e.getMessage());
				e.printStackTrace();
			}
		}
	}

	public class ThreadB extends Thread {

		private CountDownLatch latch;

		public ThreadB(CountDownLatch latch) {
			this.latch = latch;
		}

		@Override
		public void run() {
			System.out.println("--------変数代入--------");
			num = new Random().nextBoolean() ? Long.valueOf("-1") : Long.valueOf("0");
			latch.countDown();
		}
	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool(); 
			for (int i = 1; i <= 10000; i++) {
				CountDownLatch latch = new CountDownLatch(2);
				ThreadA a = new java_17().new ThreadA(latch);
				ThreadB b = new java_17().new ThreadB(latch);
				executor.submit(a);
				executor.submit(b);
			}
	}

}