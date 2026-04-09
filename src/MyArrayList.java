import java.util.Iterator;
import java.util.NoSuchElementException;

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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        elements[index] = item;
    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        size++;
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
        if (size == 0) throw new NoSuchElementException("Пуста");
        return get(0);
    }

    @Override
    public T getLast() {
        if (size == 0)
            throw new NoSuchElementException("Пуста");
        return get(size - 1);
    }
    @Override
    public void remove(int index) {
    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("index" + index + "Size" + size);
    }
    for (int i = index; i < size - 1; i++) {
        elements[i] = elements[i + 1];
    }
    elements[--size] = null;

}

    @Override
    public void removeFirst() {
     remove(0);
    }

    @Override
    public void removeLast() {
     if (size == 0)
         throw new NoSuchElementException("Пуста");
     elements[size--] = null;
    }

    @Override
    public void sort() {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
           if(((Comparable<T>) elements[j]).compareTo((T) elements[j + 1]) > 0) {
               Object temp = elements[j];
               elements[j] = elements[j + 1];
               elements[j + 1] = temp;

           }
        }
    }
    }

    @Override
    public int indexOf(Object item) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(item)) {
               return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object item) {
        for (int i = size - 1; i >= 0; i--) {
            if(elements[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object item) {
        return indexOf(item) != -1;
    }

    @Override
    public Object[] toArray() {
     Object[] result = new Object[size];
     for (int i = 0; i< size; i++) {
         result[i] = elements[i];
     }
     return result;
    }

    @Override
    public void clear() {
        this.elements = new Object[10];
        this.size = 0;
}

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
