import java.util.*;
public class BMI {
public static void main(String[]args){
    
    double bmi;
    String Ulasan;
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan berat badan anda dalam ukuran kg:");
    double berat = input.nextDouble();
    
    System.out.print ("Masukkan tinggi anda dalam ukuran meter:");
    double tinggi = input.nextDouble();
    
    bmi = berat/(tinggi*tinggi);
    
    if (bmi < 18.5){
        Ulasan="kurang daripada yang sepatutnya";
        
    }else if (bmi < 25){
        Ulasan="Normal";
        
    }else if (bmi < 30){
        Ulasan="Berlebihan";
    }else{
        Ulasan="Gemuk";
    }
    System.out.println("Anda mempunyai berat badan yang "+Ulasan);
    }
}    