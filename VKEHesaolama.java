/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vkehesaolama;

/**
 *
 * @author Samsung
 */
    import java.util.*;
public class VKEHesaolama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double boy,kilo;
        
        Scanner inp=new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz:");
        boy=inp.nextDouble();
        
        System.out.print("Kilonuzu Giriniz:");
        kilo=inp.nextDouble();
        
        double vke=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz:"+vke);
        
    }
    
}
