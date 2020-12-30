package com.company;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {
    public void tmd(){
        TreeMap<String,String> tm=new TreeMap<String,String>();
        tm.put("Muttom","Kanniyakumari");
        tm.put("Thakkalai","Kanniyakumari");
        tm.put("Marthandam","Kanniyakumari");
        tm.put("Thirparappu","Kanniyakumari");
        tm.put("Thittuvilai","Kanniyakumari");
        tm.put("Verkilambi","Kanniyakumari");

        System.out.println("Elements :"+tm);//Ascending order by default
        System.out.println("First :"+tm.firstKey());//firstkey
        System.out.println("Last :"+tm.lastKey());//lastkkey
        System.out.println("First :"+tm.firstEntry());//firstEntry
        System.out.println("Last :"+tm.lastEntry());//lastEntry
        System.out.println("value lesser thn given value :"+tm.headMap("Muttom"));//headset
        System.out.println("value equal to or higher thn given value :"+tm.tailMap("Marthandam"));//tailset
        System.out.println("subset values"+tm.subMap("Thakkalai","Thittuvilai"));//subset
        System.out.println("Comprator returns null if the sorting order is default ascending order : "+tm.comparator());//comparator
        System.out.println("Higher :"+tm.higherKey("Thakkalai"));//Higher
        System.out.println("Lower :"+tm.lowerKey("Verkilambi"));//Lower
        System.out.println("Retriew nd Delete first Element : "+tm.pollFirstEntry());//PollFirrstEntry
        System.out.println("Retriew nd Delete lst Element : "+tm.pollLastEntry());//PollLastEntry
        System.out.println("After Polling :"+tm);//AfterPolling
        System.out.println("Descending order Map :"+tm.descendingMap());//DescendingSet



    }
    public static void main(String[] args) {
        TreeMapDemo treeMapDemo=new TreeMapDemo();
        treeMapDemo.tmd();
    }
}
