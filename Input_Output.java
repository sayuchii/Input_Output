
import java.util.Scanner;

public class Input_Output{
    public static void main(String args[]){
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = scanner.next();
        
        System.out.print("Age: ");
        int age = scanner.nextInt();
        
        System.out.print("Motto in life: ");
        String motto = scanner.next();
        motto += scanner.nextLine();
        
        scanner.nextLine();
        
        System.out.println("Thank you for answering " + name + "!");
        System.out.print("You are " + age + " years old");
        System.out.print(" and your motto in life is " + motto );
        System.out.println(".");
        
        
        
    } 
}