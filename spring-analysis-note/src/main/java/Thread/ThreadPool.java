package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @program: spring
 * @description: 线程池
 * @author: wanghao
 * @create: 2020-09-10 18:11
 **/
public class ThreadPool {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
//		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 30, TimeUnit.NANOSECONDS, new LinkedBlockingQueue<Runnable>(), new ThreadPoolExecutor.AbortPolicy());
//		FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
//			@Override
//			public String call() throws Exception {
//				return "222";
//			}
//		});
//		threadPoolExecutor.execute(futureTask);
//		System.out.println(futureTask.get());

		ExecutorService executorService = Executors.newCachedThreadPool();
		ExecutorService executorService1 = Executors.newFixedThreadPool(10);
		ExecutorService exexecutorService3 = Executors.newSingleThreadExecutor();
		LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(20);

		for (int i = 0; i < 100; i++) {
			executorService.execute(new Mytask(i));
		}
	}
}

class Mytask implements Runnable {
	int i = 0;

	public Mytask(int i) {
		this.i = i++;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "--" + i);
		try {
			Thread.sleep(1000L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
    
