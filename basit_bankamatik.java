package java101;

import java.util.Scanner;

public class basit_bankamatik {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("\n******** T Bankasına Hoşgeldiniz ********\n");
        int bakiye = 5000;
        int right = 3;
        int select, price;
        String userName, password;
        userName = "tahta";
        password = "balta";

        while (right > 0) {
            System.out.print("Kullanıcı adı : ");
            userName = input.nextLine();
            System.out.print("Şifre : ");
            password = input.nextLine();

            if (userName.equals("tahta") && password.equals("balta")) {
                System.out.println("\n*****Giriş başarılı*****\n");
                do {
                    System.out.print("1- Para yatırma.\n" +
                            "2- Para çekme\n" +
                            "3- Bakiye sorgulama\n" +
                            "4- Kayıtlı kişi İBAN transfer\n" +
                            "0- Çıkış yap\n");
                    System.out.print("\nLütfen yapmak istediğiniz işlemi seçiniz (rakam olarak) : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            do {
                                System.out.println("***Bakiyeniz*** : " + bakiye);
                                System.out.print("Yatırmak istediğinz tutar : ");
                                price = input.nextInt();
                                bakiye += price;
                                System.out.println("\n***Güncel bakiyeniz*** : " + bakiye);
                                do {
                                    System.out.print("Devam etmek istiyorsanız (1) ana menüye dönmek için (2) : ");
                                    select = input.nextInt();
                                    if (select != 1 && select != 2) {
                                        System.out.println("\nGeçersiz giriş!\n");
                                    }

                                } while (select != 1 && select != 2);
                            } while (select == 1);
                            break;
                        case 2:
                            do {
                                System.out.println("****Bakiyeniz**** : " + bakiye);
                                System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                                int cash = input.nextInt();
                                if (cash > bakiye) {
                                    System.out.println("\n**Yetersiz bakiye**\n");
                                } else {
                                    bakiye -= cash;
                                }
                                System.out.println("****Güncel bakiyeniz**** : " + bakiye);
                                do {
                                    System.out.print("Para çekme işlemine devam etmek istiyorsanız (1) ana menüye dönmek için (2) : ");
                                    select = input.nextInt();
                                    if (select != 1 && select != 2) {
                                        System.out.println("\nGeçersiz giriş!\n");
                                    }
                                } while (select != 1 && select != 2);
                            } while (select == 1);
                            break;
                        case 3:
                            System.out.println("****Bakiyeniz**** : " + bakiye);
                            Thread.sleep(3000);
                            break;
                        case 4:
                            String kisiler;
                            do {

                                kisiler = "1- Enes\n" + "2- Ahmet\n" + "3- Ayşe\n" + "4- Melis\n" + "5- Ana menü\n";
                                System.out.println(kisiler);
                                System.out.println("Para göndermek istediğiniz kişiyi seçin : ");
                                select = input.nextInt();
                                switch (select) {
                                    case 1:
                                        do {
                                            System.out.print("'Enes' adlı kişiye gönderilecek para miktarını girin :");
                                            Thread.sleep(3000);
                                            price = input.nextInt();
                                            if (price > bakiye) {
                                                System.out.println("**Yetersiz bakiye!**");
                                                System.out.println("**Mevcut bakşyeniz** : "+bakiye);
                                            } else {
                                                bakiye -= price;
                                                System.out.println("\nİşleminiz gerçekleşmiştir!\n" + "**Gönderilen** : " + price + "\n**Kalan bakiye** : " + bakiye);
                                                System.out.print("Devam etmek istiyorsanız (1) Geri gitmek için  (2) : ");
                                                select = input.nextInt();
                                            }
                                        } while (select == 1);
                                        break;
                                    case 2:
                                        do {
                                            do {
                                                System.out.print("'Ahmet' adlı kişiye gönderilecek para miktarını girin :");
                                                Thread.sleep(3000);
                                                price = input.nextInt();
                                                if (price > bakiye){
                                                    System.out.println("**Yetersiz bakiye!**\n");
                                                    System.out.println("**Mevcut bakşyeniz** : "+bakiye);
                                                }else {
                                                    bakiye -= price;
                                                    System.out.println("\nİşleminiz gerçekleşmiştir!\n" + "**Gönderilen** : " + price + "\n**Kalan bakiye**: " + bakiye);
                                                    System.out.print("\nDevam etmek istiyorsanız (1) Geri  (2) : ");
                                                    select = input.nextInt();
                                                }
                                            }while (price > bakiye );
                                        } while (select == 1);
                                        break;
                                    case 3:
                                        do {
                                            do {
                                                System.out.print("'Ayşe' adlı kişiye gönderilecek para miktarını girin :");
                                                Thread.sleep(3000);
                                                price = input.nextInt();
                                                if (price > bakiye){
                                                    System.out.println("\n**Yetersiz bakiye!**\n");
                                                    System.out.println("**Mevcut bakşyeniz** : "+bakiye);
                                                }else {
                                                    bakiye -= price;
                                                    System.out.println("\nİşleminiz gerçekleşmiştir!\n" + "**Gönderilen** : " + price + "\n**Kalan bakiye**: " + bakiye);
                                                    System.out.print("\nDevam etmek istiyorsanız (1) Geri  (2) : ");
                                                    select = input.nextInt();
                                                }
                                            }while (price > bakiye );
                                        } while (select == 1);
                                        break;
                                    case 4:
                                        do {
                                            do {
                                                System.out.print("'Melis' adlı kişiye gönderilecek para miktarını girin :");
                                                Thread.sleep(3000);
                                                price = input.nextInt();
                                                if (price > bakiye){
                                                    System.out.println("\n**Yetersiz bakiye!**\n");
                                                    System.out.println("**Mevcut bakşyeniz** : "+bakiye);
                                                }else {
                                                    bakiye -= price;
                                                    System.out.println("\nİşleminiz gerçekleşmiştir!\n" + "**Gönderilen** : " + price + "\n**Kalan bakiye**: " + bakiye);
                                                    System.out.print("\nDevam etmek istiyorsanız (1) Geri  (2) : ");
                                                    select = input.nextInt();
                                                }
                                            }while (price > bakiye );
                                        } while (select == 1);
                                        break;


                                }
                            } while (select != 5);

                    }
                } while (select != 0);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                right--;
                System.out.println("Kullanıcı adı veya parola hatalı! ");
                System.out.println("Kalan deneme hakkınız : " + right);
            }
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçin.");
            }
        }
    }
}
