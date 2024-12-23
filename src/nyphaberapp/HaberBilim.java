/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyphaberapp;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class HaberBilim extends Haber {

    public HaberBilim(String HaberBasligi, String HaberAltBasligi, String HaberIcerigi) {
        super(HaberBasligi, HaberAltBasligi, HaberIcerigi); 
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
        return puan;
    }
    @Override
    public void puanGoster(int puan) {
        System.out.println("Girdiginiz deger: " + puan);
    }
}
