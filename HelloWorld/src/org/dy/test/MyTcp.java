package org.dy.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp {
    private BufferedReader reader;
    private ServerSocket server;
    private Socket socket;

   public void getServer(){
        try {
            server = new ServerSocket(8998);
            System.out.println("服务器套接字已经创建成功");

            while (true){
                System.out.println("等待客户机连接");
                socket = server.accept();
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();
            }
        }catch (Exception e){

        }
    }

    private void getClientMessage(){
        try {
            while (true){
                System.out.println("客户机： "+ reader.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            if (reader != null){
                reader.close();
            }

            if (socket != null){
                socket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
