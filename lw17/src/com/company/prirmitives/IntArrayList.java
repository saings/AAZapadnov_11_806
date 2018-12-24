package com.company.prirmitives;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int count = 0;
    private static final double EXTENSION_COEF = 1.5;

    public IntArrayList() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    @Override
    public void add(int e) {
        if (count == elements.length)
        {
            grow();
        }
        elements[count++] = e;
    }

    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < oldCapacity; i++)
        {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count)
        {
            throw new IllegalArgumentException("Index: " + index + " is not valid");
        }
        return elements[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < elements.length; i++)
        {
            if (value == elements[i])
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < elements.length - 1; i++)
        {
            elements[i] = elements[i + 1];
        }
        int[] newElements = new int[elements.length - 1];
        for (int i = 0; i < newElements.length; i++)
        {
            newElements[i] = elements[i];
        }
        elements = newElements;
        count--;
    }

    @Override
    public void sort() {
        Arrays.sort(elements);
    }

    @Override
    public int[] toArray() {
        int[] newElements;
        newElements = Arrays.copyOf(elements, elements.length);
        return newElements;
    }

    @Override
    public void addAll(IntList list) {
        for (int i = 0; i < list.size(); i++)
        {
            add(list.get(i));
        }
        count += list.size();
    }



    @Override
    public void addAll(IntList list, int index) {
        for (int i = 0; i < list.size(); ++i)
        {
            add(list.get(i), index + i);
        }
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator {
        private int currentIndex;

        public MyIterator() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public int next() {
            return elements[currentIndex++];
        }
    }
}
