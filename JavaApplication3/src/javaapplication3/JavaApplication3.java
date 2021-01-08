/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;


/*
//Abstract-Occurence Kalıbı


class occurence{
    abstraction ab = new abstraction();
}

class abstraction{
        ArrayList <occurence> al = new ArrayList <occurence>(); 
}

class dizi{
    String isim;
    String yapımcı;
    ArrayList <bolum> bolumler = new ArrayList<bolum>();
    void bolumEkle(bolum b){
    bolumler.add(b);
    }
}

class bolum{
    String bolumIsim;
    int bolumNumarasi;
    public bolum(String bolumIsmi,int bolumNumarasi){
        this.bolumIsim = bolumIsmi;
        this.bolumNumarasi = bolumNumarasi;
    }

}

public class JavaApplication3 {

  
    public static void main(String[] args) {
        dizi fringe= new dizi();
        fringe.isim = "Fringe";
        fringe.yapımcı = "J.J. Abrams";
        fringe.bolumEkle(new bolum("baslangıc",1));
        fringe.bolumEkle(new bolum("ikincibolum",2));
    }
    
}
*/

/*
//General Hierarchy

 class Node{
      Node SuperiorNode = new Node();
  }
  
  class calisan{
      String isim;
      calisan yonetici;
      public calisan(){}
      public calisan(String isim){
          this.isim = isim;
      }
  }
  
  class yonetici extends calisan{
       ArrayList <calisan>altlari = new ArrayList<calisan>();
       public yonetici(String isim){
            this.isim = isim;
       }
       public void addCalisan(calisan alt){
           altlari.add(alt);
           alt.yonetici=this;
       }
  }
public class JavaApplication3 {
  
   public static void main(String[] args) {
        yonetici ali = new yonetici("ali");
        calisan veli = new calisan("veli");
        calisan ahmet = new calisan("ahmet");
        ali.addCalisan(ahmet);
        ali.addCalisan(veli);
        System.out.println("Ahmetin yöneticisi "+ahmet.yonetici.isim);
        System.out.println("Velinin yöneticisi "+veli.yonetici.isim);
        System.out.println("Alinin çalışanları 1."+ali.altlari.get(0).isim+
                            " 2. "+ali.altlari.get(1).isim);
        System.out.println("Alinin çalışan sayısı:"+ali.altlari.size());
        
        
   }
    
*/


//Player-Role Kalıbı

abstract class devam{
    public abstract boolean devamsiz();
    int devam;
}
class fulltime extends devam{
    public boolean devamsiz(){
        if(devam>100)return true;
        return false;
    }
    
}
class parttime extends devam{
    public boolean devamsiz(){
        return false;
    }
}
abstract class seviye{
    public abstract boolean mezuniyet(double not);
}
class lisans extends seviye{
    public boolean mezuniyet(double not){
        if(not>2)return true;
        return false;
    }
}
class lisansUstu extends seviye{
     public boolean mezuniyet(double not){
        if(not>3)return true;
        return false;
    }
}
class ogrenci{
    String ogrenci;
    devam devamRolu;
    double notOrtalaması;
    seviye egitimSeviyesi;
}
        
public class JavaApplication3 {
  
   public static void main(String[] args) {
      
    ogrenci ali = new ogrenci();
    ali.devamRolu = new fulltime();
    ali.devamRolu.devam=150;
    System.out.println("Ali devamsızlıktan kaldı mı?"+ali.devamRolu.devamsiz());
    ali.devamRolu = new parttime();
    ali.devamRolu.devam=150;
    System.out.println("Ali devamsızlıktan kaldı mı?"+ali.devamRolu.devamsiz());
    ali.notOrtalaması=2.50;
    ali.egitimSeviyesi= new lisans();
    System.out.println("Ali mezun olabilir mi?"+ali.egitimSeviyesi.mezuniyet(ali.notOrtalaması));
    ali.egitimSeviyesi= new lisansUstu();
    System.out.println("Ali mezun olabilir mi?"+ali.egitimSeviyesi.mezuniyet(ali.notOrtalaması));
  
   }
}