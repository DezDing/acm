package org.dy.test;

public class ThreadSafeTest implements Runnable {
    int num = 10;
    public void run(){
        while (true){
            synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("车票还有 " + num-- + " 张");
                }
            }
        }
    }
}
