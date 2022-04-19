package thred;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception {
//		Thread t = new SampleThred();
//		Thread h = new Thread(() -> {
//			System.out.println("hello");
//		});
//		t.start();
//		h.start();
//		
//		System.out.println("main");
		
		//スレッドプールが一つの場合
//		ExecutorService exec = Executors.newSingleThreadExecutor();
		//スレッドプールを3つ用意
//		ExecutorService exec = Executors.newFixedThreadPool(3);
//		
//		for(int i = 0; i < 5; i++) {
//			exec.submit(() -> {
//				System.out.println(Thread.currentThread().getId());
//			});
//		}
		//時間経過後に不要なになったスレッドを削除する
//		ExecutorService exec = Executors.newCachedThreadPool();
//		Runnable test = () -> {
//			System.out.println(Thread.currentThread().getId());
//		};
//		
//		for(int i = 0; i< 5; i++) {
//			exec.submit(test);
//		}
//		
//		Thread.sleep(1 * 10000);
//		System.out.println("---------10秒後---------");
//		
//		for(int i = 0; i< 5; i++) {
//			exec.submit(test);
//		}
//		
//		Thread.sleep(7 * 10000);
//		System.out.println("---------70秒後---------");
//
//		for(int i = 0; i< 5; i++) {
//			exec.submit(test);
//		}
		
//		ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
//		exec.schedule(() -> {
//			System.out.println("finish");
//			exec.shutdown();	//スレッドプールを閉じる
//		}, 2, TimeUnit.SECONDS);
//		
//		int count = 0;
//		while(true) {
//			Thread.sleep(100);
//			if(exec.isShutdown()) {
//				break;
//			}
//			System.out.println((++count) * 100 + "ms");
//		}
		//定期的に行う処理
//		exec.scheduleAtFixedRate(() -> {
//			int r = new Random().nextInt(10);
//			System.out.print(r);
//			try {
//				Thread.sleep(r * 100);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//			System.out.println("interrupt");
//		}, 1, 1, TimeUnit.SECONDS);
		
//		exec.scheduleWithFixedDelay(() -> {
//			int r = new Random().nextInt(10);
//			System.out.print(r);
//			try {
//				Thread.sleep(r * 100);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//			System.out.println("interrupt");
//		}, 1, 1, TimeUnit.SECONDS);
//
//		int count = 0;
//		while(true) {
//			Thread.sleep(100);
//			System.out.print(">");
//			count++;
//			if(count == 100) {
//				exec.shutdown();
//				break;
//			}
//		}
		//プールを使った一定間隔のスレッド
//		ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);
//		exec.scheduleWithFixedDelay(() -> {
//			System.out.print("A");
//		}, 1, 1, TimeUnit.SECONDS);
//		
//		exec.scheduleWithFixedDelay(() -> {
//			System.out.print("B");
//		}, 1, 1, TimeUnit.SECONDS);
//		
//		Thread.sleep(10000);
//		exec.shutdown();
		
		ExecutorService exec = Executors.newSingleThreadExecutor();
		
		//Futureは<>に指定した型を戻り値に、submitメソッドの第2引数に指定した文字列を返せる
//		Future<String> future = exec.submit(() -> {
//			try {
//				System.out.println("start");
//				Thread.sleep(2000);
//				System.out.println("end");
//			} catch (InterruptedException e) {
//				throw new RuntimeException(e);
//			}
//		}, "finish");
//		
//		String result = future.get();
//		System.out.println(result);
		
		//匿名クラスを使ったCallbleインターフェイス
//		Callable<Boolean> task = new Callable<Boolean>() {
//			@Override
//			public Boolean call() throws Exception{
//				return new Random().nextInt() % 2 == 0;
//			}
//		};
//		
		List<Future<Boolean>> futures = new ArrayList<>();
//		for(int i = 0; i < 10; i++) {
//			futures.add(exec.submit(task));
//		}
//		for(int i = 0; i < 10; i++) {
//			futures.add(exec.submit(() -> {
//				return new Random().nextInt() % 2 == 0;
//			}));
//		}
//		
//		int total = 0;
//		for (Future<Boolean> future : futures) {
//			Boolean result = future.get();
//			System.out.println(result);
//			if(result) {
//				total++;
//			}
//		}
//		System.out.println(total);
		
		for(int i = 0; i < 10; i++) {
			futures.add(exec.submit(() -> {
				if(new Random().nextInt() % 2 == 0) {
					throw new Exception("Odd Number");
				}
				return true;
			}));
		}
		
		int total = 0;
		for (Future<Boolean> future : futures) {
			Boolean result = false;
			try {
				result = future.get();
				System.out.println(result);
			} catch (ExecutionException e) {
				System.out.println(e.getMessage());
			}
			if(result) {
				total++;
			}
		}
		System.out.println(total);
	}

}
