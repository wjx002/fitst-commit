package com.jiaxu.java;

import java.util.HashMap;

/**
 * @Author：吴家旭
 * @date：2021/3/8 - 19:53
 */
public class DebugTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", "12");
        map.put("school", "Tsinghua");
        map.put("major", "computer");
        String age = map.get("age");
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);


    }

    public static class HellowWorld {
        //最强大的world
        /**
         * @Author:吴家旭
         *
         * */
        public static void  main(String[] args){
            System.out.println("Helloworld!!");
        }
    }
}
