package com.company;

import java.util.LinkedList;

public class LinkedListDemo {

    public void LLE(){
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(05);
        linkedList.add(1993);
        linkedList.addFirst(0);//ADD AN ELEMENT AT FIRST
        linkedList.addLast(0);//ADD AN ELEMENT AT LAST


      //  System.out.println("Firstvalue :"+linkedList.getFirst());//GET THE FIRSTVALUE
       // System.out.println("REMOVE FIRST : "+linkedList.removeFirst());//To remove first element from list
      //  System.out.println("REMOVE LAST : "+linkedList.removeLast());//To remove last element from list
      //  System.out.println(linkedList.poll());//This method directly delete the first element
       // System.out.println(linkedList.pollLast());//This method directly delete the last element
        System.out.println("After removing first occurence of 0 :"+linkedList);//Removes First Occurnce
        System.out.println("After removing last occurance of 2:"+linkedList.poll());//Removes lst occurnce
        System.out.println("LINKEDLIST DOB :"+linkedList);//GET THE WHOLE LINKEDLIST


    }
    public static void main(String[] args) {
        LinkedListDemo lld=new LinkedListDemo();
        lld.LLE();
    }
}
