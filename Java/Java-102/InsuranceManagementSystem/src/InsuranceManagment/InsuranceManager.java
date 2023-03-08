package InsuranceManagment;

import UserManagment.User;

import java.util.Scanner;

public class InsuranceManager {

    public User addInsurance(User user, Insurance insurance) {
        user.getInsurances().add(insurance);
        return user;
    }

    public User deleteInsurance(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silmek istediğiniz Sigortayı seçiniz: ");
        int index = 1;
        for (Insurance insurance : user.getInsurances()) {
            System.out.println(index++ + "- " + insurance.getName());
        }
        try {
            user.getInsurances().remove(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Sigorta silme kısmında hata!!!");
        }
        return user;
    }
}
