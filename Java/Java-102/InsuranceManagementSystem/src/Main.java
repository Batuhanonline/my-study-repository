import AddressManagment.Address;
import AddressManagment.AddressManager;
import AddressManagment.HomeAddress;
import UserManagment.User;

public class Main {
    public static void main(String[] args) {
        //
        User user = new User("Batuhan", "Güven", "batuhan_guvenn@outlook.com", "123123", "Software Dev", 23);

        AddressManager addressManager = new AddressManager();

        addressManager.addAddress(user, new HomeAddress("MimarSinan mah.", "Semazen sok."
                , "18", "6", "Sultanbeyli", "İstanbul", "---"));

        user.showUserInfo();
    }
}