package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Book[] elements;
    private int size = 0;
    public BookArray() {
        elements = new Book[DEFAULT_CAPACITY];
    }public int size() {
        return size;
    }
    public Book get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index의 범위(0~9)가 초과됨");
        }
        return elements[index];
    }
    public void add(Book element) {
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



