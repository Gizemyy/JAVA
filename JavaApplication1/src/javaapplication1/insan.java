/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author user
 */
public class insan {
     int boy;
        int yas;
        int kilo;
        void yemek(){
            kilo++;
        }
        public insan(){
            System.out.println("!bir insan nesnesi oluşuruldu!");
            yas=222;
        }
        public insan(int yas,int boy,int kilo){
            this();// defaut constructor ı çalıştırır.
           // System.out.println("!bir insan nesnesi oluşuruldu!");
            this.yas=yas;//bu class daki yaşı belirtmek için 'this' kullanılır.
            this.boy=boy;
            this.kilo=kilo;
           
        }
}
