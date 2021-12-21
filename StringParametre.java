/*
kendisine parametre olarak gelen String ifadesinin içindeki sesli harf sayısı,harf sayısı,
kelime sayısı,ters çevrilmiş halini,boşluk sayısını geri döndüren metot ve java programı.   
*/
package stringparametre;
import java.util.Scanner;
public class StringParametre {
public static int sesliHarf(String s){
    String sesli_harf="aeiou";
    int sayacSesli=0;
        for(int i=0;i<s.length();i++){
            for(int n=0;n<sesli_harf.length();n++){
                if(s.charAt(i)==sesli_harf.charAt(n)){
               sayacSesli++;
                }
            }
        }  
    return sayacSesli;
}
public static int harfSayisi(String s){
    int sayacHarf=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
            sayacHarf--;
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                sayacHarf--;
            }
            } 
        }
    return sayacHarf;
}
public static int kelimeSayisi(String s){
    int sayacKelime=1;//
     s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
            sayacKelime++;
            }
        }
    return sayacKelime;
}
public static String ters(String s){
    String ters="";
        for(int i=s.length()-1;i>=0;i--){
            ters+=s.charAt(i);
        }
    return ters;
}

public static int bosluk(String s){
   int sayacBosluk=0;
     for(int i=0;i<s.length();i++){
         if(s.charAt(i)==' '){
             sayacBosluk++;
         }
     }
     return sayacBosluk;
}
    public static void main(String[] args) {
    
        Scanner k=new Scanner(System.in);
        System.out.println("String giriniz..");
        String str=k.nextLine();
        System.out.println("Girilen Stringte "+sesliHarf(str)+" tane sesli harf vardır.");
        System.out.println("Girilen Stringte "+harfSayisi(str)+" tane harf vardır.");
        System.out.println("Girilen Stringte "+kelimeSayisi(str)+" tane kelime vardır.");
        System.out.println("Girilen Stringin ters çevirilmiş hali "+ters(str));
        System.out.println("Girilen Stringte "+bosluk(str)+" tane boşluk vardır.");
    
    }
    
}
