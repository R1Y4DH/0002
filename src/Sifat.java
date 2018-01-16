import java.util.*;
public class Sifat {
    public static void main(String[]args){
        
        String ulasan = null;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda:");
        String nama = input.next();
        
        System.out.print("Taipkan warna kegemaran anda\n Merah/ Biru/ Kuning/ Hijau/ Hitam/ Putih:");
        
        String warna = input.next();
        
        switch(warna) {
            case "Merah" :{
                ulasan= "membawa makna kekuatan, kemarahan dan semangat";
                break;
            }case "Biru" :{
                ulasan= ("membawa maksud ketenangan, keikhlasan dan harapan.");
                break;
            }case "Kuning" :{
                ulasan= ("melambangkan kegembiraan, penuh semangat dan riang");
                break;
            }case "Hijau" :{
                ulasan= ("menggambarkan kehidupan, kestabilan dan ketulenan");
                break;
            }case "Hitam" :{
                ulasan= ("dikaitkan dengan kejahatan dan penuh kerahsiaan");
                break;
            }case "Putih" :{
                ulasan= ("adalh berani tetapi tidak suka taunjukkan keberanian");
                break;
                
            }default :{
                
                System.out.println("Maaf pilihan salah");
            }
            }
            System.out.println(nama+", warna anda "+ulasan);
        }
    }