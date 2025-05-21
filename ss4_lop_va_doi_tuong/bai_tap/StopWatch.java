package ss4_lop_va_doi_tuong.bai_tap;

import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int array[] = new int[100000];
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            array[i] = random.nextInt(10000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100000; i++) {
            int indexmin = i;
            for (int j = i + 1; j < 100000; j++) {
                if (array[j] < array[indexmin]) {
                    indexmin = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexmin];
            array[indexmin] = temp;
        }

        stopWatch.stop();

        System.out.println("Thời gian selection sort cho 100,000 số là: "+stopWatch.getElapsedTime()+ "milliseconds");
    }
}
