package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMappDemo {
    public void lhmd(){
        LinkedHashMap<String,String> lhm=new LinkedHashMap<String,String>();
        lhm.put("Nagercoil","Kanniyakumari");
        lhm.put("Kulasekharam","Kanniyakumari");
        lhm.put("Thakkalai","Kanniyakumari");
        lhm.put("Marthandam","Kanniyakumari");
        lhm.put("Mnavalakurichi","Kanniyakumari");
        lhm.put("Thirparappu","Kanniyakumari");
        lhm.put("Muttom","Kanniyakumari");

        //View the Map
        System.out.println("MapContent :"+lhm);

        //To make a copy of Existing map
        HashMap<String, String> dupmap=new HashMap<>();
        dupmap.putAll(lhm);
        System.out.println("Duplicate Map :"+dupmap);
        //Clear to delete the Map Content
        dupmap.clear();
        System.out.println("After clearing :"+dupmap);

        //To check Whether the key is present or not in the map
        System.out.println("Does the map has key 1?"+lhm.containsKey("Nagercoil"));
        //To check Whether the Value is present or not in the map
        System.out.println("Does the map has value Abdul ?"+lhm.containsValue("Kanniyakumari"));
        //Clone The Map
        System.out.println("Clone :"+lhm.clone());
        //Check if the map is emty or not
        System.out.println("IS Empty ? "+dupmap.isEmpty());
        //Fetch the set of keys in  map
        System.out.println("Key Set :"+lhm.keySet());
        //Fetch a value in the map
        System.out.println(lhm.get("Kanniyakumari"));
        //Fetch all values in the map
        System.out.println("All values :"+lhm.values());
        //EntrySet
        System.out.println("Whole entry in th map :" +lhm.entrySet());

    }
    public static void main(String[] args) {
        LinkedHashMappDemo linkedHashMappDemo=new LinkedHashMappDemo();
        linkedHashMappDemo.lhmd();
    }
}
