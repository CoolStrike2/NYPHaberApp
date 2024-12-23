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


public class HaberSpor extends Haber {

    public HaberSpor(String HaberBasligi, String HaberAltBasligi, String HaberIcerigi) {
        super(HaberBasligi, HaberAltBasligi, HaberIcerigi);
    }
    public HaberSpor(){}

    public String kategori(){
        return "Spor haberleri";
    }

    class Futbol implements IHaberSpor,IHaber{
        @Override
        public String altKategori(){
            return "Futbol";
        }
        @Override
        public int haberPuanlama() {
            Scanner scanner = new Scanner(System.in);
            int puan = 0;

            while (true) {
                System.out.print("1 ile 10 arasinda bir deger girin: ");
                puan = scanner.nextInt();

                if (puan >= 1 && puan <= 10) {
                    break;
                } else {
                    System.out.println("Belirtilen aralik disinda girdiniz tekrar deneyin");
                }
            }
            scanner.close();
            return puan;
        }
        @Override
        public void puanGoster(int puan) {
            System.out.println("Girdiginiz deger: " + puan);
        }

    }
    class  Basketbol implements IHaberSpor,IHaber{
        @Override
        public String altKategori(){
            return "Basketbol";
        }

        @Override
        public int haberPuanlama() {
           return puanHesaplama();
        }

        @Override
        public void puanGoster(int puan) {

            System.out.println("Girdiginiz deger: " + puan);
        }
    }
    class Voleybol implements IHaberSpor,IHaber{
        @Override
        public String altKategori(){
            return "Voleybol";
        }
        @Override
        public int haberPuanlama() {
            return puanHesaplama();
        }
        @Override
        public void puanGoster(int puan) {
            System.out.println("Girdiginiz deger: " + puan);
        }
    }
    public int puanHesaplama(){
        Scanner scanner = new Scanner(System.in);
        int puan = 0;

        while (true) {
            System.out.print("1 ile 10 arasinda bir deger girin: ");
            puan = scanner.nextInt();

            if (puan >= 1 && puan <= 10) {
                break;
            } else {
                System.out.println("Belirtilen aralik disinda girdiniz tekrar deneyin");
            }
        }
        scanner.close();
        return puan;
    }




}
