package com.itheima_02;

import java.io.*;
import java.net.*;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
//        ServerSocket ss=new ServerSocket(10000);
//        Socket s = ss.accept();
//        //InputStream is=s.getInputStream();
//        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//        String line;
//        while((line=br.readLine())!=null){
//
//            System.out.println(line);
//        }
//        ss.close();
//        ServerSocket ss=new ServerSocket(10000);
//        Socket s = ss.accept();
//        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//        BufferedWriter bw=new BufferedWriter(new FileWriter("myCollection\\game.txt"));
//        String line;
//        while((line=br.readLine())!=null){
//            bw.write(line);
//            bw.newLine();
//            bw.flush();
//        }
//
//        OutputStream os = s.getOutputStream();
//        BufferedWriter bw1=new BufferedWriter(new OutputStreamWriter(os));
//        bw1.write("the server has receive the data");
//        bw1.close();
//        bw.close();
//        s.close();
        ServerSocket ss=new ServerSocket(10000);
        while(true){
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }
    }
}
