package lv.javaguru18.lesson9.example1;

import java.util.HashMap;
import java.util.Map;

public class PlayWithHasMap {
    public static void main(String[] args) {

        Map<String, String> contacts = new HashMap<>();
        contacts.put("Bob", "555-1234-321");
        contacts.put("Suzie", "555-4321-999");
        contacts.put("Jane", "555-9099-111");
        contacts.put("Kevin", "555-0011-222");

        System.out.println(contacts);

        System.out.println(contacts.entrySet());

        for(Map.Entry<String,String> entry : contacts.entrySet()){
            System.out.println(entry.getKey()+ " ---------- " + entry.getValue());
        }

        System.out.println(contacts.get("Bob"));


    }
}
