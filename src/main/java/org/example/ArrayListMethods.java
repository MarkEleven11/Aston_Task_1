package org.example;

public interface ArrayListMethods <T>{

    void addElement(T element);

    void addIndexElement(int index, T element);

    T getIndexElement(int index);

    Object[] getAllElements();

    boolean deleteIndexElement(T element);

    void clear();


}
