package generic;

public interface IDatabase <T> {
    public boolean add(T data);
    public boolean delete(T data);
    public boolean update(T data);
    public T select();


}
