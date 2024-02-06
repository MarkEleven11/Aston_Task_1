package org.example;

import java.util.Arrays;

public class ArrayListMethodsImpl<T> implements ArrayListMethods<T> {

    private static int CAPACITY = 10;

    private Object[] array;

    private int size = 0;

    public ArrayListMethodsImpl() {
        array = new Object[CAPACITY];
    }


    @Override
    public void addElement(T element) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = element;
    }

    @Override
    public void addIndexElement(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds exception");
        }
        if (size == array.length) {
            increaseCapacity();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }


    @Override
    public T getIndexElement(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds exception");
        }
        return (T) array[index];
    }

    @Override
    public Object[] getAllElements() {
        return Arrays.copyOf(array, size);
    }

    @Override
    public boolean deleteIndexElement(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    private void increaseCapacity() {
        if (size == 10) {
            int nextCapacity = array.length * 2;
            array = Arrays.copyOf(array, nextCapacity);
        }
    }

    private void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }


}
