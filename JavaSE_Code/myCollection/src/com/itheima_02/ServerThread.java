package com.itheima_02;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter("myCollection\\game.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();

            }
            BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("i hava got the data");
            bwServer.flush();
            bwServer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
