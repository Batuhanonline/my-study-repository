public interface IMyList<T> {

    int size();
    int getCapacity();
    void add(T value);
    T get(int index);
    T remove(int index);
    T set(int index, T value);
    String toPrint();
    int indexOf(T value);
    int lastIndexOf(T value);
    boolean isEmpty();
    T[] toArray();
    void clear();
    MyList<T> subList(int start, int finish);
    boolean contains(T data);
}
