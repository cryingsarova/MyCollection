package com.netcracker;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E>{

    private Node<E> first = null;
    private Node<E> last = null;
    private int size = 0;


    public class MyIterator implements Iterator{

        private Node<E> current = null;
        private boolean hasNext = false;

        public MyIterator() {
            current = null;
            hasNext = true;
        }

        @Override
        public boolean hasNext() {
            return hasNext;
        }

        @Override
        public E next() {

                if (hasNext) {
                    if(current == null){
                        current = first;
                        return current.getElement();
                    }
                    else {
                        current = current.getNextNode();
                        hasNext = (current.getNextNode() != null) ? true : false;
                        return current.getElement();
                    }
                } else {
                    return null;
                }

        }
    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public void add(E element) {
        if(size == 0){
            first = new Node<>(element);
            size++;
            return;
        }
        if (size == 1 ){
            last = new Node<>(element);
            first.setNextNode(last);
            last.setPreviousNode(first);
            size++;
            return;
        }
        else {
            Node<E> node = new Node<>(element);
            last.setNextNode(node);
            node.setPreviousNode(last);
            last = node;
            size++;
            return;
        }
    }

    @Override
    public void add(int index, E element) {
        if (index == 0 ){
            Node<E> node = first;
            first = new Node<>(element);
            first.setNextNode(node);
            node.setPreviousNode(first);
            size++;
            return;
        }
        if (index == size)
        {
            add(element);
        }
        else {
            if(index < size) {
                Node<E> current = first;
                for (int i = 0; i < index - 1; i++) {
                    current = current.getNextNode();
                }

                Node<E> currentNext = current.getNextNode();
                Node<E> node = new Node<>(element);
                node.setNextNode(currentNext);
                node.setPreviousNode(current);
                current.setNextNode(node);
                currentNext.setPreviousNode(node);
                size++;
                return;
            }
            else return;
        }


    }

    @Override
    public void clear() {
        first.setNextNode(null);
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index == 0) return first.getElement();
        if (index == size - 1 ) return last.getElement();
        else{
            if(index < size - 1) {
                Node<E> current = first;
                for (int i = 0; i < index; i++) {
                    current = current.getNextNode();
                }
                return current.getElement();
            }
            else{
                return null;
            }
        }
    }

    @Override
    public int indexOf(E element) {

        if (first.getElement() == element) {
            return 0;
        }
        if (last.getElement() == element) {

            return size - 1;
        } else {
            Node<E> current = first.getNextNode();
            int i;
            for (i = 1; i < size - 1; i++) {
                if (current.getElement() == element) break;
                current = current.getNextNode();
            }
            if (i == size - 1) {
                return -1;
            } else return i;
        }
    }


    @Override
    public E remove(int index) {
        if (index < size) {
            Node<E> current = first;
            for (int i = 1; i <= index; i++) {
                current = current.getNextNode();
            }
            Node<E> previousNode = current.getPreviousNode();
            Node<E> nextNode = current.getNextNode();
            previousNode.setNextNode(nextNode);
            nextNode.setPreviousNode(previousNode);
            size--;
            return current.getElement();
        }
        else return null;
    }

    @Override
    public void set(int index, E element) {
        if (index == 0){
            first.setElement(element);
        }
        if (index == size - 1){
            last.setElement(element);
        }
        else if (index < size - 1){
            Node<E> current = first;
            for (int i = 1; i <= index; i++) {
                current = current.getNextNode();
            }
            current.setElement(element);

        }
    }

    @Override
    public int size() {
       return size;
    }

    @Override
    public E[] toArray() {
        E[] array = (E[]) Array.newInstance(first.getElement().getClass(),size);
        for ( int i = 0; i < array.length; i++){
            array[i] = get(i);
        }
        return array;
    }

}
