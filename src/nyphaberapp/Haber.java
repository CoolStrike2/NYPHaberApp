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

public abstract class Haber implements IHaber{
    public String haberBasligi;
    public String haberAltBasligi;
    public String haberIcerigi;
    public String haberBasligi2;
    public String haberAltBasligi2;
    public String haberIcerigi2;

    public Haber(String HaberBasligi,String HaberAltBasligi,String HaberIcerigi){
        this.haberBasligi=HaberAltBasligi;
        this.haberAltBasligi=HaberAltBasligi;
        this.haberIcerigi=HaberIcerigi;
    }
    public Haber(String HaberBasligi,String HaberAltBasligi,String HaberIcerigi,String HaberBasligi2,String HaberAltBasligi2,String HaberIcerigi2){
        this.haberBasligi=HaberAltBasligi;
        this.haberAltBasligi=HaberAltBasligi;
        this.haberIcerigi=HaberIcerigi;
        this.haberBasligi2=HaberBasligi2;
        this.haberAltBasligi2=HaberAltBasligi2;
        this.haberIcerigi2=HaberIcerigi2;
    }
    public Haber(){}

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
        return puan;
    }
    @Override
    public void puanGoster(int puan) {
        System.out.println("Girdiginiz deger: " + puan);
    }

}
