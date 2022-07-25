package res;

import java.util.Arrays;

public class MyArrayList<T> implements ArrayListInt<T> {
    private int size = 0;
    private T[] mass = (T[]) new Object[0];

    @Override
    public void add(T obj) {
        size++;
        mass = Arrays.copyOf(mass,size);
        mass[size-1] = obj;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void remove(int i) {
        size--;
        T[] temp = (T[]) new Object[size];
        System.arraycopy(mass,0,temp,0,i);
        System.arraycopy(mass,i + 1,temp,i,mass.length - i - 1);
        mass = temp;
    }

    @Override
    public T get(int i) {
        return mass[i];
    }

    @Override
    public void clear() {
        size = 0;
        mass = (T[]) new Object[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(mass);
    }
}