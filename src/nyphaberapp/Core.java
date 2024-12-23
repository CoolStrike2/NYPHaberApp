/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyphaberapp;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class Core {

    private Scanner tarayici;
    private String oncekiMenu;

    public Core() {
        this.tarayici = new Scanner(System.in);
        this.oncekiMenu = "";
    }

    public boolean GirisYap(String kullaniciAdi, String sifre) {
    while (true){
        try{
            if (bosmu(kullaniciAdi) || bosmu(sifre)) {
                throw new IllegalArgumentException("Kullanıcı adı ve şifre boş olamaz!");
            }

            if (kullaniciAdi.equals("admin") && sifre.equals("1234")) {
                System.out.println("Giriş başarılı! Hoş geldiniz, " + kullaniciAdi + ".");
                return true;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre! Lütfen tekrar deneyin.");
                System.out.print("Kullanıcı adı: ");
                kullaniciAdi = tarayici.nextLine();
                System.out.print("Şifre: ");
                sifre = tarayici.nextLine();
            }
        }
        catch (IllegalArgumentException e) {
            System.err.println("Hata: " + e.getMessage());
            return false;
            }
        }
    }
    
    public void MainMenu() {
        oncekiMenu = "MainMenu";
        while (true) {
            System.out.println("\n--- Ana Menü ---");
            System.out.println("1. Haberleri Görüntüle");
            System.out.println("2. Kategorileri Listele");
            System.out.println("3. Çıkış Yap");
            System.out.print("Seçiminizi yapın: ");

            int secim = tarayici.nextInt();
            try{
                switch (secim) {
                    case 1 -> HaberlerMenu();
                    case 2 -> KategoriListeleMenu();
                    case 3 -> {
                        cikisYap();
                        return;
                    }
                    default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
                }
                }
             catch(IllegalArgumentException e){
                     
                 System.err.println("Hata: " + e.getMessage());
                 return;
                }
            
                
        }
    }

    public void HaberlerMenu() {
        oncekiMenu = "anaMenu";
        while (true) {
            System.out.println("\n--- Haberler ---");
            System.out.println("1. Uzayda Yeni Keşifler");
            System.out.println("2. Yapay Zekadaki Gelişmeler");
            System.out.println("3. Bir Önceki Menüye Dön");
            System.out.println("4. Ana Menüye Dön");
            System.out.print("Seçiminizi yapın: ");

            int secim = tarayici.nextInt();

            switch (secim) {
                case 1 -> HaberGoruntule("Uzayda Yeni Keşifler");
                case 2 -> HaberGoruntule("Yapay Zekadaki Gelişmeler");
                case 3 -> OncekiMenuyeDon();
                case 4 -> MainMenu();
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    public void KategoriListeleMenu() {
        oncekiMenu = "anaMenu";
        Kategoriler kategori = new Kategoriler();
        
        while (true) {
//            System.out.println("\n--- Haber Kategorileri ---");
//            System.out.println("1. Spor");
//            System.out.println("2. Magazin");
//            System.out.println("3. Bilim");
//            System.out.println("4. Bir Önceki Menüye Dön");
//            System.out.println("5. Ana Menüye Dön");
//            System.out.print("Seçiminizi yapın: ");
            kategori.kategoriSema();

            int secim = tarayici.nextInt();

            switch (secim) {
                case 1 -> KategoriGoruntule("Spor");
                case 2 -> KategoriGoruntule("Magazin");
                case 3 -> KategoriGoruntule("Bilim");
                case 4 -> KategoriGoruntule("Saglik");
                case 5 -> KategoriGoruntule("Siyaset");
                case 6 -> OncekiMenuyeDon();
                case 7 -> MainMenu();
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    public void HaberGoruntule(String haberBasligi) {
        System.out.println("\n--- Haber Detayı ---");
        System.out.println("Haber Başlığı: " + haberBasligi);
        System.out.println("Bu haberin detayları burada yer alacak.");

        System.out.println("\n1. Bir Önceki Menüye Dön");
        System.out.println("2. Ana Menüye Dön");
        System.out.print("Seçiminizi yapın: ");
        int secim = tarayici.nextInt();

        switch (secim) {
            case 1 -> HaberlerMenu();
            case 2 -> MainMenu();
            default -> {
                System.out.println("Geçersiz seçim! Ana menüye yönlendiriliyorsunuz.");
                MainMenu();
            }
        }
    }

    public void cikisYap() {
        System.out.println("\nProgramdan çıkış yapılıyor. İyi günler!");
    }

    public void OncekiMenuyeDon() {
        switch (oncekiMenu) {
            case "anaMenu" -> MainMenu();
            case "haberlerMenu" -> HaberlerMenu();
            case "kategoriListeleMenu" -> KategoriListeleMenu();
            default -> {
                System.out.println("Önceki menü bulunamadı. Ana menüye dönülüyor...");
                MainMenu();
            }
        }
    }

    private boolean bosmu(String metin) {
        return metin == null || metin.trim().isEmpty();
    }

    private void KategoriGoruntule(String kategori) {
        System.out.println("\n--- " + kategori + " Haberleri ---");
        System.out.println(kategori + " kategorisine ait haberler listeleniyor...");
        System.out.println("Örnek bir haber görüntüleniyor...\n");

        System.out.println("1. Bir Önceki Menüye Dön");
        System.out.println("2. Ana Menüye Dön");
        System.out.print("Seçiminizi yapın: ");
        int secim = tarayici.nextInt();

        switch (secim) {
            case 1 -> KategoriListeleMenu();
            case 2 -> MainMenu();
            default -> {
                System.out.println("Geçersiz seçim! Ana menüye yönlendiriliyorsunuz.");
                MainMenu();
            }
        }
    }
}

