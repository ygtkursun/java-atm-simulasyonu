package com.mycompany.java.atm.simulasyonu;

import java.util.Scanner;

public class JavaAtmSimulasyonu {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double bakiye = 10000;
        
        double yatirilanToplam = 0;
        
        double cekilenToplam = 0;
        
        int islemSayisi = 0;
        
        int secim;
        
        while(true) {
            
            System.out.println("1. Bakiye Goruntuleme");
            
            System.out.println("2. Para Yatirma");
            
            System.out.println("3. Para Cekme");
            
            System.out.println("4. Cikis");
            
            System.out.print("Seciminizi giriniz: ");
            
            secim = input.nextInt();
            
            switch (secim) {
                
                case 1:
                    
                    System.out.println("Guncel bakiyeniz: " + bakiye + " TL");
                    
                    islemSayisi++;
                    
                    break;
                    
                case 2:
                    
                    System.out.print("Yatirmak istediginiz tutari giriniz: ");
                    
                    double yatirilan = input.nextDouble();

                    if (yatirilan > 0) {
                        
                        bakiye += yatirilan;
                        
                        yatirilanToplam += yatirilan;
                        
                        islemSayisi++;

                        System.out.println("Para yatirma islemi basarili.");
                        
                        System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                        
                    } 
                    
                    else {
                        
                        System.out.println("Hatali tutar! Pozitif bir deger giriniz.");
                        
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.print("Cekmek istediginiz tutari giriniz: ");
                    
                    double cekilen = input.nextDouble();

                    if (cekilen <= 0) {
                        
                        System.out.println("Hatali tutar! Pozitif bir deger giriniz.");
                        
                    } 
                    
                    else if (cekilen > bakiye) {
                        
                        System.out.println("Yetersiz bakiye!");
                        
                    } 
                    
                    else {
                        
                        bakiye -= cekilen;
                        
                        cekilenToplam += cekilen;
                        
                        islemSayisi++;

                        System.out.println("Para cekme islemi basarili.");
                        
                        System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                    }
                    
                    break;
                    
                case 4:
                    
                    System.out.println("Son bakiyeniz: " + bakiye + " TL");
                    
                    System.out.println("Toplam islem sayisi: " + islemSayisi);
                    
                    System.out.println("Toplam yatirilan tutar: " + yatirilanToplam + " TL");
                    
                    System.out.println("Toplam cekilen tutar: " + cekilenToplam + " TL");
                    
                    System.out.println("ATM sisteminden cikis yapiliyor.");
                    
                    return;
                    
                default:
                    
                    System.out.println("Gecersiz secim! Lutfen 1-4 arasinda bir deger giriniz.");
                    
                    break;
                
            }
        } 
    }
}