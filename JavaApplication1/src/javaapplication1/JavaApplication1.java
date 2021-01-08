/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class JavaApplication1 {
    /*
    static int fibo(int x){
       int dizi[] = new int[x];
    
       dizi[x]=dizi[x]+dizi[x-1];
    }*/
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        insan ali = new insan();
        ali.kilo= 75;
        ali.boy=175;
        System.out.println("Ali'nin yasi:"+ali.yas);
        System.out.println("Ali'nin kilosu:"+ali.kilo);
        ali.yemek();
        System.out.println("Ali'nin yemekten sonraki kilosu:"+ali.kilo);
        ogrenci veli= new ogrenci();
        veli.ogrencinum=365377;
        veli.kilo=90;
        System.out.println("veli'nin kilosu:"+veli.kilo);
        System.out.println("veli'nin öğrenci numarası:"+veli.ogrencinum);
        veli.yemek();
        System.out.println("veli'nin yemekten sonraki kilosu:"+veli.kilo);
        insan gizem=new insan(21,175,75);
        System.out.println("gizemin kilosu:"+gizem.kilo);
        /* 
        //koşullu ifadeler
       while(true)
       {
        System.out.println(" Bir not giriniz:");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
      
        if(i<10){
            System.out.println("Bu sayı 10'dan küçüktür");
        }
        else if(i>10){
            System.out.println("Bu sayı 10 dan büyüktür");
            
        }
        else{
            System.out.println("Bu sayı 10 dur.");
        }
       }
        */
        /*
        //döngüler
        for(int i =1; i<=20 ;i++){
            if(i%2 == 1){
                System.out.println(i);
                if(i==13)
                    break;
            }
                */
            
        }

    }
    

