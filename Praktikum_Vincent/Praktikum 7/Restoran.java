/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;
import java.util.Scanner;

/**
 *
 * @author Vincent/18217042
 */
public class Restoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Pesanan[] listPesanan = new Pesanan[100];
        Station[] listStation=new Station[100];
        int jmlPesanan,jmlStation;
        int i;
        String nama;
        int durasi,tipe;

        jmlPesanan=input.nextInt();
        for(i=0;i<jmlPesanan;i++){
            nama=input.next();
            tipe=input.nextInt();
            durasi=input.nextInt();
            listPesanan[i]=new Pesanan(nama,durasi,tipe);
        }
        jmlStation=input.nextInt();
        for(i=0;i<jmlStation;i++){
            nama=input.next();
            tipe=input.nextInt();
            listStation[i]=new Station(nama,listPesanan,tipe);
        }
        for(i=0;i<jmlStation;i++){
            listStation[i].start();
        }
    }
    
}
