/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyphaberapp;

/**
 *
 * @author pc
 */
public class Kategoriler implements IKategori{
    @Override
    public void kategoriSema(){
        System.out.println("Kategoriler");
        System.out.println("-----------");
        System.out.println("1-Spor");
        System.out.println("2-Magazin");
        System.out.println("3-Bilim");
        System.out.println("4-Sağlık");
        System.out.println("5-Siyaset");
        System.out.println("6-Önceki Menü");
        System.out.println("7-Ana Menü");
        System.out.println("----------");
    }
}
