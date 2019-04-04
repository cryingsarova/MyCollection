package com.netcracker;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {


        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("+\n******** First block ********\n");
        //Тест операций
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        //System.out.println(myLinkedList.size());
        Iterator<Integer> iterator = myLinkedList.iterator();

        myLinkedList.add(0,-1);
        myLinkedList.add(15,10);
        myLinkedList.set(2,2);
        myLinkedList.remove(2);
        System.out.println("element on index 15 "+myLinkedList.get(15));
        System.out.println("element on index 5 "+myLinkedList.get(5));
        System.out.println("size "+myLinkedList.size());
        System.out.println("index of 5 "+myLinkedList.indexOf(5));
        while (iterator.hasNext()){
            int  i = iterator.next();
            System.out.println(i);
        }
        myLinkedList.clear();

        System.out.println("\n******** Second block ********\n");
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            myLinkedList.add(random.nextInt());
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("my list adding =  "+ estimatedTime);

        LinkedList<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++){
            linkedList.add(random.nextInt());
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("standart list adding =  "+ estimatedTime+'\n');


        startTime = System.nanoTime();
        myLinkedList.indexOf(50);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("my list search =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedList.indexOf(50);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("standart list search =  "+ estimatedTime+'\n');


        startTime = System.nanoTime();
        myLinkedList.remove(50000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("my list remove =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedList.remove(50000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("standart list remove =  "+ estimatedTime+'\n');


        //Сравнение коллекций
        TestClass.test();


    }

}
