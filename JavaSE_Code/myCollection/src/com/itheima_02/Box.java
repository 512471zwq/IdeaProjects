package com.itheima_02;

public class Box {
    private int milk;
    private boolean state = false;

    public synchronized void putMilk(int milk) {
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("you store the " + milk + " milk");
        state=true;
        notifyAll();
    }

    public synchronized void getMilk() {
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("you get the " + this.milk + " milk");
        state=false;
        notifyAll();
    }
}
