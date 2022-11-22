package Lab2;

import Lab2.Interfaces.List;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 4;
    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    @Override
    public boolean add(E element) {
        if (this.size == this.elements.length){
            this.elements = grow();
        }
        this.elements[this.size++] = element;
        return true;
    }

    @Override
    public boolean add(int index, E element) {
        checkIndex(index);
        if (elements.length ==size){
            elements = grow();
        }
        for (int i = size;i>=index +1;i--){
            elements[i] =elements[i-1];
        }
        elements[index]= element;
        size++;
        return true;
    }

    @Override
    public Object[] grow() {
        return Arrays.copyOf(this.elements, this.elements.length * 2);
    }

    @Override
    public void insert(int index, E element) {
        if(this.size == this.elements.length){
            this.elements = grow();
        }

        E lastElement = this.getElement(this.size -1);
        for (int i = this.size -1; i> index;i--){
            this.elements[i] = this.elements[i -1];
        }
        this.elements[this.size] = lastElement;
        this.elements[index] = element;
        this.size++;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return getElement(index);
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E oldElement = this.getElement(index);
        this.elements[index] = element;
        return oldElement;
    }



    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0;i<size;i++){
            if (i==size-1) result.append(elements[i]);
            else result.append(elements[i]+"\n");
        }
        return result.toString();
    }

    @Override
    public E remove(int index) {
        return null;
    }

    private void ensureCapacity() {
        if (this.size < this.elements.length / 3) {
            this.elements = shrink();
        }
    }

    private Object[] shrink() {
        return Arrays.copyOf(this.elements, this.elements.length /2);
    }

    private void checkIndex(int index){
        if(index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(String.format("Index out of bounds: %d for size: %d", index, this.size));
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(E element) {
        for (int i = 0; i < size; i++){
            if (elements[i].equals(element)){
                return i;
            };

        }
        return -1;
    }

    @Override
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    private E getElement(int index) {
        return (E)elements[index];
    }

    public int getCapacity(){
        return elements.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public E next() {
                E element = getElement(index);
                index--;
                return element;
            }
        };
    }
}
