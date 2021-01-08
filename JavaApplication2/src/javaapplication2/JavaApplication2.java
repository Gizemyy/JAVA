/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author user
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yenidizi[]={1,2,3,4,11,32,12,42,233,23};
        int[] ikincidizi;
        ikincidizi= new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println(yenidizi[i]);
        }
        
        System.arraycopy(yenidizi,0,ikincidizi,0,yenidizi.length);
        System.out.println("Kopyalama işleminden sonra ikinci dizi:");
        
        for(int i=0;i<10;i++)
        {
            System.out.println(ikincidizi[i]);
        }
        
    }
    
}