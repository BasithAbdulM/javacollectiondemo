package com.company;

import java.util.HashMap;

public class HashMapDemo {
    public void HME(){
        HashMap<Integer,String> Empmap=new HashMap<Integer,String>();
        Empmap.put(1,"Abdul");//Entry
        Empmap.put(2,"Sujin");//Entry
        Empmap.put(3,"Jenish");//Entry
        Empmap.put(4,"Jackson");//Entry
        Empmap.put(5,"Pravin");//Entry
        Empmap.put(6,"Mano");//Entry
        //View the Map
        System.out.println("MapContent :"+Empmap);

        //To make a copy of Existing map
        HashMap<Integer,String> dupmap=new HashMap<Integer,String>();
        dupmap.putAll(Empmap);
        System.out.println("Duplicate Map :"+dupmap);
        //Clear to delete the Map Content
        dupmap.clear();
        System.out.println("After clearing :"+dupmap);

        //To check Whether the key is present or not in the map
        System.out.println("Does the map has key 1?"+Empmap.containsKey(1));
        //To check Whether the Value is present or not in the map
        System.out.println("Does the map has value Abdul ?"+Empmap.containsValue("Abdul"));
        //Clone The Map
        System.out.println("Clone :"+Empmap.clone());
        //Check if the map is emty or not
        System.out.println("IS Empty ? "+Empmap.isEmpty());
        //Fetch the set of keys in  map
        System.out.println("Key Set :"+Empmap.keySet());
        //Fetch a value in the map
        System.out.println(Empmap.get(2));
        //Fetch all values in the map
        System.out.println("All values :"+Empmap.values());
        //EntrySet
        System.out.println("Whole entry in th map :" +Empmap.entrySet());




    }
    public static void main(String[] args) {
        HashMapDemo hashMapDemo=new HashMapDemo();
        hashMapDemo.HME();

    }
}
