package UserManagment;

import AddressManagment.Address;
import InsuranceManagment.Insurance;

import java.util.ArrayList;
import java.util.Date;

public abstract class Account {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private int age;
    private Date lastLogin;
    private ArrayList<Address> address = new ArrayList<>();
    private ArrayList<Insurance> insurances = new ArrayList<>();
    AuthenticationStatus authenticationStatus;


    public Account(String firstName, String lastName, String email, String password, String job, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
    }

    private enum AuthenticationStatus {
        SUCCESS,
        FAILURE
    }

    public AuthenticationStatus login(String email, String password) {
        if(email.equals(getEmail()) && password.equals(getPassword())) {
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            this.authenticationStatus = AuthenticationStatus.FAILURE;
        }
        return this.authenticationStatus;
    }

    public final void showUserInfo() {
        System.out.println("İsim: " + getFirstName()+ " " + getLastName() + " \n" +
                "Yaş: " + getAge() + " \n" +
                "Email: " + getEmail() + " \n" +
                "Meslek: " + getJob() + " \n" +
                "Adres: ");
        for (Address addres: getAddress()) {
            System.out.println(addres.getAddress());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Address> address) {
        this.address = address;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }
}
