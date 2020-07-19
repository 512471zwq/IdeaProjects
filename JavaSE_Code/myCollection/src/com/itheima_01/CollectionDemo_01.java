package com.itheima_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo_01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        //调用add方法永远都是返回true
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("and");
        c.add("python");
        //通过多态的方法得到的interator对象
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            //System.out.println(it.next());
            String s=it.next();
            System.out.println(s);
        }
    }
}

