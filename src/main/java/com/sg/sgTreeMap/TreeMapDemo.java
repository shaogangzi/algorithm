package com.sg.sgTreeMap;


import java.util.TreeMap;

/**
 * treeMap学习
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> tree =  new TreeMap<String, String>();
        tree.put("123","123");
        tree.put("789","123");
        tree.put("456","123");

        tree.put("456","123");

        System.out.println(tree);
    }
}
