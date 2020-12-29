package com.company;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public void lhsd(){
        LinkedHashSet lhs=new LinkedHashSet();
        //Adding Element to linkedhshset
        lhs.add("MARUTI");
        lhs.add("BMW");
        lhs.add("BENZ");
        lhs.add("HONDA");
        lhs.add("YAMAHA");
        lhs.add("BAJAJ");
        lhs.add("AUDI");
        lhs.add("HONDA");//THIS WILL Not add  new element as HONDA already exists


        System.out.println("ELEMENTS :"+lhs);
        System.out.println("size of LinkedHashSet :"+lhs.size());//Size
        System.out.println("Originl LinkedHshSet :"+lhs);//Originl list
        System.out.println("REMOVING AUDI From LinkedHshSet :"+lhs.remove("AUDI"));//Return Boolen Values
        System.out.println("Trying to remove L which is not present :"+lhs.remove("L"));//Return Boolen Values
        System.out.println("Checking if BENZ is present :"+lhs.contains("BENZ"));//Return Boolen Values
        System.out.println("Updted LinkedHashSet:"+lhs);//Seeing the Updated

    }
    public static void main(String[] args) {
        LinkedHashSetDemo linkedHashSetDemo=new LinkedHashSetDemo();
        linkedHashSetDemo.lhsd();
    }
}
