package org.dy.test;

/**
 * Created by dingyuan on 2017/7/14.
 */
// Create a second thread.
public class NewThread implements Runnable {
    public Thread t;
    String name;
    public NewThread(String threadname) {
        name = threadname;
        // Create a new, second thread
        t = new Thread(this, name);
        System.out.println("Child thread: " + t);
        t.start(); // Start the thread
    }

    // This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name+":" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");
        }
        System.out.println(name + "Exiting.");
    }
}