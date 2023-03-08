package AddressManagment;

import UserManagment.User;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressManager {
    public User addAddress(User user, Address address) {
        user.getAddress().add(address);
        return user;
    }

    public User deleteAddress(User user) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        for (Address address : user.getAddress()) {
            System.out.println(index++ + "- " + address.getAddress());
        }
        System.out.print("Silmek istediğiniz adresi seçiniz: ");
        try {
            user.getAddress().remove(scanner.nextInt());
        } catch (Exception e) {
            System.out.println("Adres silme hatası!!!");
        }

        return user;
    }
}
