package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {
    public void ALE(){
        List<String> list=new ArrayList<String>();
        list.add("AB");
        list.add("DU");
        list.add("LB");
        list.add("AS");
        list.add("IT");
        list.add("H");
       // list.remove(5);//Removing by index position
        //list.remove("DU");//Removing by string
        list.set(3,"DU");//To replace an element from list
        System.out.println(list);//To print whole
        System.out.println(list.get(0));//To retrive an element by index position
        System.out.println(list.lastIndexOf("IT"));//To know the index position
        System.out.println(list.indexOf("DU"));//To know the index position
        System.out.println(list.isEmpty());//To check whether the list is empty or not it returns boolen values
        //ITERATOR using fo loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //LIST ITERATOR
        ListIterator<String> iterator =list.listIterator();
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
    public static void main(String[] args) {
        Arraylist al=new Arraylist();
        al.ALE();
    }
}
