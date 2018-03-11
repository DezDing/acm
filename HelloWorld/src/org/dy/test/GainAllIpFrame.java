package org.dy.test;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GainAllIpFrame extends JFrame {
    public Map<String,String> pingMap = new HashMap<String,String>();

    public class PingIpThread extends Thread{
        public String ip;
        public  PingIpThread(String ip){
            this.ip = ip;
        }
        public void run(){
            try{
                Process process = Runtime.getRuntime().exec("ping "+ip+"-w 280 -n 1");
                InputStream is = process.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader in = new BufferedReader(isr);
                String line = in.readLine();
                while (line != null) {
                    if (line != null && !line.equals("")) {
                        if (line.substring(0, 2).equals("来自")
                                || (line.length() > 10 && line.substring(0, 10).equals("Reply from"))) {
                            pingMap.put(ip, "true");
                        }
                    }
                    line = in.readLine();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
