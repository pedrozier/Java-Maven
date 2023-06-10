import java.util.concurrent.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import com.standard.junitthreadtest.SequentialCounter;

public class SequentialCountTest {

    private static final int THREAD_COUNT = 100;
    private static final int INCREMENT_COUNT = 1000;

    @Test
    public void testSequentialCounterNext() {
        SequentialCounter counter = SequentialCounter.getInstance();

        int initialValue = counter.next();
        int secondValue = counter.next();

        Assertions.assertEquals(initialValue + 1, secondValue,
                "The next value should be incremented by 1 from the initial value.");
    }

    @Test
    public void testSequentialCounterThreadSafety() throws InterruptedException {
        SequentialCounter counter = SequentialCounter.getInstance();

        CountDownLatch latch = new CountDownLatch(1);

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);

        for (int i = 0; i < THREAD_COUNT; i++) {
            executorService.execute(() -> {
                try {
                    latch.await();

                    for (int j = 0; j < INCREMENT_COUNT; j++) {
                        counter.next();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        latch.countDown();

        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);

        int expectedValue = THREAD_COUNT * INCREMENT_COUNT;

        Assertions.assertEquals(expectedValue, counter.next(),
                "The final counter value should be equal to the expected value.");
    }
}
