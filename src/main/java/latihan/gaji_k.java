/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Skaylee
 */
import java.util.Scanner;
import static latihan.fungsi.totalg;
import static latihan.fungsi.transport;
import static latihan.fungsi.uangmakan;
public class gaji_k {
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
    int gaji;
    String nama, nik;
    float makan, transport_, total;
        
        
        
    System.out.print("Nama\t: ");nama=sc.nextLine();
    System.out.print("NIK\t: ");nik=sc.nextLine();
    System.out.print("Gaji\t: Rp.");gaji=sc.nextInt();
    
    System.out.printf("Nama\t: "+nama+"\n");
    System.out.printf("Nik\t: "+nik+"\n");
    System.out.printf("Gaji awal\t: Rp."+gaji+",00\n");
    
    makan=uangmakan(gaji);
    System.out.printf("Uang makan\t: Rp."+makan+",00\n");
    transport_=transport(gaji);
    System.out.printf("Uang transport\t: Rp."+transport_+",00\n");
    total=totalg(makan,transport_,gaji);
    System.out.printf("Total Gaji\t: Rp."+total+",00\n");
        }
    
}   
