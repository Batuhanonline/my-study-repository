import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, name = "batuhan", pass = "123";
        int secim;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Parolanızı giriniz: ");
        password = input.nextLine();

        if (userName.equals(name) && password.equals(pass)){
            System.out.println("Giriş başarılı.");
        } else {
            System.out.println("Hatalı giriş patınız!\nŞifre sıfırlamak için 1 yazınız.");
            secim = input.nextInt();
            if (secim == 1){
                System.out.print("Yeni parolanızı giriniz: ");
                pass = input.nextLine();
                System.out.println("Yeni şifreniz:" + pass);
            }
        }
    }
}