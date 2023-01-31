package org.example.generics;


import java.util.ArrayList;
import java.util.List;


public class generics {
    public static void main(String[] args) {
        List<String> stringLIst=new ArrayList<>();
        unsafedAdd(stringLIst,Integer.valueOf(42));
        String s =stringLIst.get(0);
    }

    private static void unsafedAdd(List list, Object o) {
        list.add(0);
    }
}
