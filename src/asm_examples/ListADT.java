package asm_examples;

public interface ListADT<E> extends Iterable<E> {
    boolean add(E element);
    boolean add(int index, E element);
    E get(int index);
    E set(int index, E element);
    E remove(int index, E element);
    int size();
    int indexOf(E element);
    boolean contains(E element);
    boolean isEmpty();
}
