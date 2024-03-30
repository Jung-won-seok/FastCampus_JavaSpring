package fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements; //다형성 배열
    private int size = 0;
    public ObjectArray() {
        elements = new Object[DEFAULT_CAPACITY];
    }public int size() {
        return size;
    }
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index의 범위(0~9)가 초과됨");
        }
        return elements[index];
    }
    public void add(Object element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }
    private void ensureCapacity() { //공간을 늘리는 함수
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}



