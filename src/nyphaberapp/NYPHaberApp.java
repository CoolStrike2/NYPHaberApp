/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nyphaberapp;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class NYPHaberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Core core = new Core();
        
        System.out.print("Kullanıcı adı: ");
        String username = scanner.nextLine();

        System.out.print("Şifre: ");
        String password = scanner.nextLine();
        
        boolean GirisSonucu = core.GirisYap(username, password);
        
        if(GirisSonucu)
        {
           core.MainMenu();
        }
                
    }
}

