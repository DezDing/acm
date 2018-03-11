package org.dy.test;

public class ThreadTest extends Thread{
    private int count=10;
    public void run(){
        while (true){
            System.out.print(count+" ");
            if (--count==0){
                return;
            }
        }
    }
}
