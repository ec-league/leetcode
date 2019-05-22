package com.league.lucky;

import java.util.concurrent.*;

/**
 * Created by coraline on 2019/5/22.
 */
public class ExecutorUtils {

    public static ExecutorService createExecutorService(int threadSize) {
        return new ThreadPoolExecutor(
                threadSize,
                threadSize,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(100),
                r -> new Thread(r,"t_pl_pool_" + r.hashCode()),
                new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public static void shutdown(ExecutorService executorService) {
        executorService.shutdown();
        int awaitTime = 0;
        try {
            while (!executorService.awaitTermination(60, TimeUnit.MILLISECONDS)) {
                if (++awaitTime >= 1000) {
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
