package com.kingmao.algorithm.list;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @author QX
 * @date 2020/5/12
 */
public class QXArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, Serializable {


    private static final long serialVersionUID = -7314042189944003996L;

    //初始化容量 10
    private static final int DEFAULT_CAPACITY = 10;

    //空容器
    private static final Object[] EMPTY_ELEMENTDATA = {};

    //默认的空容器
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    //单独的元素
    transient Object[] elementData;

    //数组大小
    private int size;

    /**
     * 造函数
     * @param initialCapacity
     */
    public QXArrayList(int initialCapacity){
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        }else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    /**
     * 空构造函数
     */
    public QXArrayList(){
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    /**
     * 空构造函数
     * @param c
     */
    public QXArrayList(Collection<? extends E> c) {
        elementData = c.toArray();
        if ((size = elementData.length) != 0) {
            if (elementData.getClass() != Object[].class)
                elementData = Arrays.copyOf(elementData, size, Object[].class);
        }else {
            this.elementData = EMPTY_ELEMENTDATA;
        }
    }

    public void trimToSize(){
        modCount ++;
        if (size < elementData.length){
            elementData = (size == 0)
                ? EMPTY_ELEMENTDATA
                : Arrays.copyOf(elementData, size);
        }
    }

    public void ensureCapacity(int minCapacity){

    }



    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {

    }

    @Override
    public void sort(Comparator<? super E> c) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return false;
    }

    @Override
    public Stream<E> stream() {
        return null;
    }

    @Override
    public Stream<E> parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }
}
