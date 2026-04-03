import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
private Object[] elements;
private int size;

public MyArrayList() {
    this.elements = new Object[10];
    this.size = 0;
}
private void increaseBuffer() {
    Object[] newElements = new Object[elements.length * 2];
    for(int i = 0; i < size; i++) {
        newElements[i] = elements[i];
    }
     elements = newElements;
}
private void ensureCapacity() {
    if (size == elements.length) {
        Object[] newElements = new Object[elements.length * 2];
        for (int j = 0; j < size; j++) {
            newElements[j] = elements[j];
        }
         elements = newElements;
    }

}

    @Override
    public void add(T item) {
    if (size == elements.length) {
        increaseBuffer();
    }
     elements[size++] = item;
}


    @Override
    public void set(int index, T item) {

    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {
    ensureCapacity();
    for(int i = size; i > 0; i--) {
        elements[i] = elements[i - 1];
    }
    elements[0] = item;
    size++;
    }

    @Override
    public void addLast(T item) {
     add(item);
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + "Size " + size);
        }
        return (T) elements[index];
    }

    @Override
    public T getFirst() {
         return null;
    }

    @Override
    public T getLast() {
        getLast();
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {
        this.elements = new Object[10];
        this.size = 0;
}

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
