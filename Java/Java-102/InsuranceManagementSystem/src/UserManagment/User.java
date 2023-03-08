package UserManagment;


import java.util.Date;

public class User extends Account{

    public User(String firstName, String lastName, String email, String password, String job, int age) {
        super(firstName, lastName, email, password, job, age);
    }
}
