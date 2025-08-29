import java.util.Scanner;

public class BasitProje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double furkanb = 1234.123;
        String kullanicif = "furkan123";
        String furkansifre = "123";
        String furkaniban = "TR1234 000 567 985 6572 23 45";

        double kursatb = 123423;
        String kullanicik = "kursat512";
        String kursatsifre = "12345";
        String kursatiban = "TR1234 000 567 985 6522 60 60";

        System.out.println("Bankamıza Hoşgeldiniz");
        System.out.println("Kullanıcı Adınızı Giriniz");
        String kullaniciad = scanner.nextLine();
        System.out.println("Şifrenizi Giriniz");
        String sifre = scanner.nextLine();

        String secim = ""; 

        if (kullaniciad.equals(kullanicif) && sifre.equals(furkansifre)) {
            System.out.println("Furkan Aydemir Hesabınıza Hoşgeldiniz");
            System.out.println("1 - Bakiye Görüntüle\n2 - Para Çek\n3 - Başka Hesaba Para Yatırr\nq - Çıkış");
            System.out.println("Lütfen Bir İşlem Seçiniz:");
            secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz: " + furkanb);
                    break;
                case "2":
                    System.out.println("Çekmek İstediğiniz Tutarı Giriniz:");
                    int cekilentutar = scanner.nextInt();
                    if (furkanb >= cekilentutar) {
                        furkanb -= cekilentutar;
                        System.out.println("Para Hesabınızdan Çekildi");
                        System.out.println("Kalan Bakiye: " + furkanb);
                    } else {
                        System.out.println("Bakiyenizden Fazla Çekim Yapamazsınız!");
                    }
                    break;
                case "3":
                    System.out.println("Yatırmak istediğiniz ibanı giriniz.");
                    String girilenIban = scanner.nextLine();
                    System.out.println("Yatırmak İstediğiniz Tutarı giriniz");
                    int ibanTutar = scanner.nextInt();
                    if(girilenIban.equals(kursatiban) && (furkanb>=ibanTutar))
                    {
                     furkanb-=ibanTutar;
                     System.out.println("Para hesaba başarıyla aktarılmıştır" + " Kalan Bakiyeniz :" + furkanb);
                    } else {
                      System.out.println("Bakiyeniz Yetersizdir");
                    }
                    break;
                case "q":
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz işlem.");
            }
        } else if (kullaniciad.equals(kullanicik) && sifre.equals(kursatsifre)) {
            System.out.println("Kürşat Aydemir Hesabınıza Hoşgeldiniz");
            System.out.println("1 - Bakiye Görüntüle\n2 - Para Çek\n3 - Başka Hesaba Para Yatır\nq - Çıkış");
            System.out.println("Lütfen Bir İşlem Seçiniz:");
            secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz: " + kursatb);
                    break;
                case "2":
                    System.out.println("Çekmek İstediğiniz Tutarı Giriniz:");
                    int cekilentutar = scanner.nextInt();
                    if (kursatb >= cekilentutar) {
                        kursatb -= cekilentutar;
                        System.out.println("Para Hesabınızdan Çekildi");
                        System.out.println("Kalan Bakiye: " + kursatb);
                    } else {
                        System.out.println("Bakiyenizden Fazla Çekim Yapamazsınız!");
                    }
                    break;
                case "3":
                    System.out.println("Farklı hesaba para yatırma işlemi şu an desteklenmiyor.");
                    break;
                case "q":
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz işlem.");
            }
        } else {
            System.out.println("Yanlış Kullanıcı Adı veya Şifre!");
        }
    }
    }  

     
