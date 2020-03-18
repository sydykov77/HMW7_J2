package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<String>();
        System.out.println("------------------");
        System.out.println("List A:");
        Scanner scanner = new Scanner(System.in);
        ListA.add(scanner.nextLine());
        ListA.add(scanner.nextLine());
        ListA.add(scanner.nextLine());
        ListA.add(scanner.nextLine());
        ListA.add(scanner.nextLine());
        Iterator<String> iterator = ListA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        ArrayList<String> ListB = new ArrayList<String>();
        System.out.println("------------------");
        System.out.println("List B:");
        Scanner scan = new Scanner(System.in);
        ListB.add(scan.nextLine());
        ListB.add(scan.nextLine());
        ListB.add(scan.nextLine());
        ListB.add(scan.nextLine());
        ListB.add(scan.nextLine());
        Iterator<String> iter = ListB.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        ArrayList<String> ListC = new ArrayList<String>();
        System.out.println("------------------");
        System.out.println("List C:");
        for (int i = 0; i < ListA.size(); i++) {
            ListC.add(ListA.get(i));
            ListC.add(ListB.get(i));
        }
        Collections.addAll(ListC);


        Collections.sort(ListC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        for(String str : ListC){
            System.out.println(str);
        }


    }

}