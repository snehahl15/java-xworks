package com.xworkz.movieTicket;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListStringRunner {
    public static void main(String[] args) {
        Collection<String> str = new LinkedList<>();
        str.add("kantara");
        str.add("rajakumara");
        str.add("kgf");
        str.add("amruthadhare");
        str.add("kariya");

        System.out.println(str);

        LinkedList linkedList = (LinkedList)str;
        ((LinkedList<String>) str).addFirst("kariya");
        System.out.println(str);

    }
}
