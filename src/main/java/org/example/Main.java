package org.example;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        ArrayListMethodsImpl<Integer> list = new ArrayListMethodsImpl<>();
        list.addElement(1);
        list.addElement(22);
        list.addElement(3);
        list.addElement(14);
        list.addElement(25);
        list.addElement(9);
        list.addElement(32);
        list.addIndexElement(0,25);
        System.out.println("Элементы: " + Arrays.toString(list.getAllElements()));
        System.out.println("Элемент под индексом 4: " + list.getIndexElement(4));
        System.out.println("Удален элемент под индексом 1: " + list.deleteElement(1));
        System.out.println(Arrays.toString(list.getAllElements()));
        list.clear();
        System.out.println("Очистка списка: " + Arrays.toString(list.getAllElements()));
    }
}