public class MyList<T> implements IMyList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private int initialCapacity;
    private int size = 0;
    private int indis = 0;
    private Object[] array;

    public MyList() {
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
        setInitialCapacity(DEFAULT_CAPACITY);
    }

    public MyList(int initialCapacity) {
        if (initialCapacity > 0) {
            setInitialCapacity(initialCapacity);
            this.array = (T[]) new Object[getInitialCapacity()];
        } else if (initialCapacity == 0) {
            this.array = EMPTY_ELEMENTDATA;
        } else {
            System.out.println("IllegalCapacity: " + initialCapacity);
        }
    }

    @Override
    public int size() {
        int size = 0;
        for (Object value : this.array) {
            if (value != null) {
                size += 1;
            }
        }
        return size;
    }

    @Override
    public int getCapacity() {
        return getInitialCapacity();
    }

    @Override
    public void add(T value) {
        if (getCapacity() > 0 && this.indis < getCapacity()) {
            this.array[indis++] = value;
        } else if (this.indis >= getCapacity()) {  // Kapasite sınırına ulaşıldığında dizinin kapasitesini 2 katına çıkarılmaktadır.
            setInitialCapacity(getInitialCapacity() * 2);
            System.out.println("Dizi kapasitesine ulaşıldı. Dizinin yeni kapasitesi: " + getInitialCapacity());
            Object[] supArray = (T[]) new Object[getInitialCapacity()];

            for (int i = 0; i < this.array.length; i++) {
                supArray[i] = this.array[i];
            }
            this.array = supArray;
            this.array[indis++] = value;
        } else {
            System.out.println("Kapasitesiz bir liste oluşturmuşsunuz!!!");
        }
    }

    @Override
    public T get(int index) {
        return (T) this.array[index];
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < size()){
            T output = (T) this.array[index];
            this.array[index] = null;
            this.indis--;
            for (int i = 0; i < size() -1; i++) {
                this.array[i] = this.array[i+1];
            }
            return output;
        } else {
            return null;
        }
    }

    @Override
    public T set(int index, T value) {
        if (index >= 0 && index < size()) {
            this.array[index] = value;
            return value;
        } else {
            return null;
        }
    }

    @Override
    public String toPrint() {
        if (size() > 0) {
            String out = "[";
            for (int i = 0; i < size() - 1; i++){
                out += this.array[i] + ", ";
            }
            out += this.array[size() -1] + "]";
            return out;
        } else {
            return "[]";
        }
    }

    @Override
    public int indexOf(T value) {
        int output = -1;
        for (int i = 0; i < size(); i++) {
            if (this.array[i] == value) {
                output = i;
                break;
            }
        }
        return output;
    }

    @Override
    public int lastIndexOf(T value) {
        int output = -1;
        for (int i = size()-1; i >= 0; i--) {
            if (this.array[i] == value) {
                output = i;
                break;
            }
        }
        return output;
    }

    @Override
    public boolean isEmpty() {
        return size() < 1;
    }

    @Override
    public T[] toArray() {
        return (T[]) this.array;
    }

    @Override
    public void clear() {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public MyList<T> subList(int start, int finish) {
        MyList<T> output = new MyList<>();
        for (int i = start; i <= finish; i++) {
            output.add((T) this.array[i]);
        }
        return output;
    }

    @Override
    public boolean contains(T data) {
        boolean output = false;
        for (Object item : this.array) {
            if (item == data) {
                output = true;
                break;
            }
        }
        return output;
    }

    public int getInitialCapacity() {
        return initialCapacity;
    }

    public void setInitialCapacity(int initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }
}
