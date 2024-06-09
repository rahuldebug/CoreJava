package com.rahul.multithreading.Futures;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
/*Thread Executer with futures and callable*/
public class ThreadExec {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,
                Runtime.getRuntime().availableProcessors(),
                1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10));
        List<Integer>result=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Future<?> task = threadPoolExecutor.submit(() -> {
                int cont=0;
                System.out.println("task is getting executed");
                result.add(cont++);
            }, result);
            // task.cancel(true);
            System.out.println(task.get().toString());
            result.forEach(System.out::println);

        }
    }

}
