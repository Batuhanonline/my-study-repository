package generic;

public class Student implements IDatabase<Student>{
    @Override
    public boolean add(Student data) {
        return false;
    }

    @Override
    public boolean delete(Student data) {
        return false;
    }

    @Override
    public boolean update(Student data) {
        return false;
    }

    @Override
    public Student select() {
        return null;
    }
}
