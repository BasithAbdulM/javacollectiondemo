package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public void TSE(){
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(6);
        System.out.println("Elements :"+treeSet);//Ascending order by default
        System.out.println("First :"+treeSet.first());//first
        System.out.println("Last :"+treeSet.last());//last
        System.out.println("value lesser thn given value :"+treeSet.headSet(5));//headset
        System.out.println("value equal to or higher thn given value :"+treeSet.tailSet(3));//tailset
        System.out.println("subset values"+treeSet.subSet(3,8));//subset
        System.out.println("Comprator returns null if the sorting order is default ascending order : "+treeSet.comparator());//comparator
        System.out.println("Higher :"+treeSet.higher(2));//Higher
        System.out.println("Lower :"+treeSet.lower(6));//Lower
        System.out.println("Retriew nd Delete first Element : "+treeSet.pollFirst());//PollFirrst
        System.out.println("Retriew nd Delete lst Element : "+treeSet.pollLast());//PollLast
        System.out.println("After Polling :"+treeSet);//AfterPolling
        System.out.println("Descending order set :"+treeSet.descendingSet());//DescendingSet
                                      //ITERATION
        //normal ITEATION
        Iterator<Integer> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Descending ITERATION
        Iterator<Integer> desciterator=treeSet.descendingIterator();
        while (desciterator.hasNext()){
            System.out.println(desciterator.next());
        }


    }

    public static void main(String[] args) {
        TreeSetDemo treeSetDemo=new TreeSetDemo();
        treeSetDemo.TSE();
    }
}
