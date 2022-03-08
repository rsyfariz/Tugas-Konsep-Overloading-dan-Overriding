
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Hasil {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Biodata b = new Biodata();
        
        String nama, jk;
        int umur;
        
        System.out.print("Nama : ");
        nama = scan.next();
        
        System.out.print("Jenis kelamin : ");
        jk = scan.next();
        
        System.out.print("umur : ");
        umur = scan.nextInt();
                
        b.uangsaku();
        
        System.out.println("-----------");
        b.Orangtua("Gustian", "Streamer", 50000000);
        
        System.out.println("-----------");
        b.Orangtua("Vior", "Ibu rumah tangga");
        
        
    }
    
}
