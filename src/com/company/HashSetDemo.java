package com.company;

import java.util.HashSet;

public class HashSetDemo {

    public void HSE(){
        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add("U");
        hashSet.add("L");
        System.out.println("Contents :"+hashSet);
        hashSet.remove("A");
        System.out.println("Content :"+hashSet);
        System.out.println(hashSet.contains("B"));//Returns boolean value






    }

    public static void main(String[] args) {
              HashSetDemo m=new HashSetDemo();
              m.HSE();


    }
}
