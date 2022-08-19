package Projects;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of password :- ");
        int length = sc.nextInt();
        System.out.println(Generator(length));
        sc.close();
    }
    static char[] Generator(int length){
        String Number = "0123456789";
        String UpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String LowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String Special_Chars = "!@#$&";
        String Combined = Number+UpperCase+LowerCase+Special_Chars;
        Random random = new Random();
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            password[i] = Combined.charAt(random.nextInt(Combined.length()));
        }
        return password;
    }
} 