package SchoolManagementSystem;
import java.util.*;
import java.io.*;
public class Admin {

    public static void main(String[] args) throws IOException
    {
        int choice;
        Scanner sc = new Scanner (System.in);
        System.out.println("**********  St. Augustine Day School  **********");
        System.out.println("###  Welcome to our online service  ###");
        System.out.println("\n\n  Enter your choice from the give menu below:");
        System.out.println(" Principal ----->1");
        System.out.println(" Teacher   ----->2");
        System.out.println(" Student   ----->3");
        System.out.println(" Enter your choice:");
        choice  = sc.nextInt();
        System.out.println("\n\n");
        switch(choice){
            case 1:
                Principal p = new Principal();
                p.addDetails();
                p.setPaycheck();
                p.displayDetails();
                break;
            case 2:
                Teacher t = new Teacher();
                t.addDetails();
                t.setPaycheck();
                t.displayDetails();
                break;
            case 3:
                Student s = new Student();
                s.addDetails();
                s.calculateFee();
                s.displayDetails();
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}

