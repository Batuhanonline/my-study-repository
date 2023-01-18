import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int passSorgu = 3, select;
        String userName, pass;
        double balance = 0, money;
        Scanner scanner = new Scanner(System.in);

        while (passSorgu > 0){

            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = scanner.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            pass = scanner.nextLine();

            if (userName.equals("batuhan") && pass.equals("123")){
                System.out.println("Merhaba " + userName + " Hoşgeldiniz");
                do {
                    System.out.print("1- Bakiye sorgulama\n2- Para yatırma\n3- Para çekme\n4- Çıkış yap");
                    select = scanner.nextInt();

                    if (select == 1){
                        System.out.println("Hesap bakiyeniz: " + balance);
                    } else if (select == 2) {
                        System.out.print("Yatıralacak tutar: ");
                        balance += scanner.nextInt();
                        System.out.println("Yeni bakiye: " + balance);
                    } else if (select == 3){
                        System.out.print("Çekilecek tutar: ");
                        money = scanner.nextInt();
                        if (money > balance){
                            System.out.println("Bakiye yetersiz!!!");
                        } else {
                            balance -= money;
                            System.out.println("Yeni bakiye: " + balance);
                        }
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere. Hoşçakalın.");
                break;
            } else {
                System.out.println("Hatalı deneme!!!");
                passSorgu--;

            }
        }

        if (passSorgu == 0){
            System.out.println("Hesabınız bloke olmuştur. Lütfen bankanızla iletişime geçiniz.");
        }

    }
}