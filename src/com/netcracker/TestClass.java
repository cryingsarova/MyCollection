package com.netcracker;

import java.util.*;

public class TestClass {
    public static void test(){
        Random random = new Random();
        System.out.println("\n********* ArrayList and LinkedList comparing **********\n");
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i < 1000000; i++){
            arrayList.add(random.nextInt());
        }
        for(int i = 0; i < 1000000; i++){
            linkedList.add(random.nextInt());
        }

        long startTime = System.nanoTime();
        arrayList.add(2);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("arrayList adding =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedList.add(2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("linkedList adding =  "+ estimatedTime+'\n');

        startTime = System.nanoTime();
        arrayList.add(500000,2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("arrayList adding in middle =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedList.add(500000,2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("linkedList adding in middle =  "+ estimatedTime+'\n');

        startTime = System.nanoTime();
        arrayList.remove(500000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("arrayList removing one element =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedList.remove(500000);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("linkedList removing one element =  "+ estimatedTime+'\n');

        System.out.println("\n********* HashSet, LinkedHashSet and TreeSet comparing **********\n");
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i = 0; i < 1000000; i++){
            hashSet.add(random.nextInt());
        }

        for(int i = 0; i < 1000000; i++){
            linkedHashSet.add(random.nextInt());
        }

        for(int i = 0; i < 1000000; i++){
            treeSet.add(random.nextInt());
        }

        startTime = System.nanoTime();
        hashSet.add(2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet adding =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedHashSet.add(2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet adding =  "+ estimatedTime);

        startTime = System.nanoTime();
        treeSet.add(2);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet adding =  "+ estimatedTime+'\n');


        startTime = System.nanoTime();
        hashSet.contains(50);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet searching =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedHashSet.contains(50);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet searching =  "+ estimatedTime);

        startTime = System.nanoTime();
        treeSet.contains(50);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet searching =  "+ estimatedTime+'\n');


        startTime = System.nanoTime();
        hashSet.remove(50);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashSet removing =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedHashSet.remove(50);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashSet removing =  "+ estimatedTime);

        startTime = System.nanoTime();
        treeSet.remove(50);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeSet removing =  "+ estimatedTime);

        System.out.println("\n********* HashMap, LinkedHashMap and TreeMap comparing **********\n");

        HashMap<Integer,Float> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Float> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,Float> treeMap = new TreeMap<>();

        for(int i = 0; i < 1000000; i++){
            hashMap.put(random.nextInt(),random.nextFloat());
        }

        for(int i = 0; i < 1000000; i++){
            linkedHashMap.put(random.nextInt(),random.nextFloat());
        }

        for(int i = 0; i < 1000000; i++){
            treeMap.put(random.nextInt(),random.nextFloat());
        }

        startTime = System.nanoTime();
        hashMap.put(500,5.5f);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap adding =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.put(500,5.5f);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap adding =  "+ estimatedTime);

        startTime = System.nanoTime();
        treeMap.put(500,5.5f);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap adding =  "+ estimatedTime+'\n');

        startTime = System.nanoTime();
        hashMap.containsValue(5.5f);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap searching =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.containsValue(5.5f);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap searching =  "+ estimatedTime);

        startTime = System.nanoTime();
        treeMap.containsValue(5.5f);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap searching =  "+ estimatedTime+'\n');

        startTime = System.nanoTime();
        hashMap.remove(500);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("HashMap removing =  "+ estimatedTime);

        startTime = System.nanoTime();
        linkedHashMap.remove(500);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("LinkedHashMap removing =  "+ estimatedTime);

        startTime = System.nanoTime();
        treeMap.remove(500);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("TreeMap removing =  "+ estimatedTime+'\n');
    }
}
