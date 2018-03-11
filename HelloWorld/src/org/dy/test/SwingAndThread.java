package org.dy.test;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwingAndThread extends JFrame {
    private JLabel jL = new JLabel();
    private static Thread t;
    private int count = 0;
    private Container container = getContentPane();

    public SwingAndThread(){
        setBounds(300,200,1000,300);
        container.setLayout(null);

        URL url = SwingAndThread.class.getResource("/1.gif");
        Icon icon = new ImageIcon(url);
        jL.setIcon(icon);
        jL.setHorizontalAlignment(SwingConstants.LEFT);
        jL.setBounds(10,10,200,100);
        jL.setOpaque(true);
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (count<=600){
                    jL.setBounds(count,10,200,200);
                    try{
                        t.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    count += 60;
                    if (count==600){
                        count = 60;
                    }
                }
            }
        });
        t.start();
        container.add(jL);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
