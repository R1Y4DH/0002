import java.util.Scanner;
public class Math_Sains {
public static void main(String[]args){
    Scanner input = new Scanner (System.in);
char Sains;
char Math;
System.out.println("Apakah gred bagi Math :[A/B/C/D/E/F/G]");
Math=input.next().charAt(0);
System.out.println("Apakah gred bagi Sains :[A/B/C/D/E/F/G]");
Sains=input.next().charAt(0);

if (Sains==Math)
        System.out.println ("Gred yang dperoleh sama");
if (Sains!=Math) // also CORRECT>
        System.out.println ("Gred yang diperoleh tidak sama");
    }
}
