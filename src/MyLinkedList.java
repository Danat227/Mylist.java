import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private static class MyNode<T> {
        T data;
        MyNode<T> next;
        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode<T> head;
    private MyNode<T> tail;
    private int length;
    @Override
    public void add(T item) {
      MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
          head = tail = new MyNode<>(item);

      } else {
            tail.next = newNode;
            tail = newNode;
            }
        length++;
    }

    @Override
    public void set(int index, T item) {
        if (index < 0 || index >= length) return;
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = item;
    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {
     addLast(item);
    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
           current = current.next;
        }
        return current.data;
    }

    @Override
    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) {
            return null;
        }
        return tail.data;
    }

    @Override
    public void remove(int index) {
      if ( index < 0 || index >= length) return;
      if (index == 0) {
          head = head.next;
          if (head == null) tail = null;
      } else {
          MyNode<T> prev = head;
          for (int i = 0; i < index - 1; i++) {
              prev = prev.next;
          }
          prev.next = prev.next.next;
          if ( length == length - 1) {
              tail = prev;
          }
      }
      length--;
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

    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}