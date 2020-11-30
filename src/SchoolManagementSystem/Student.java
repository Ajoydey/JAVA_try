package SchoolManagementSystem;

import java.util.Scanner;
import java.io.*;
public class Student {

    String name;
    int std;
    char sec;
    String address;
    long mob;
    double fee;

    Student()
    {
        name=null;
        std=0;
        address=null;
        mob= 0L;
        fee=0.0;

    }

    public void addDetails()throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your class: ");
        std = sc.nextInt();
        System.out.print("Enter section: ");
        sec = Character.toUpperCase(sc.next().charAt(0));
        System.out.print("Enter address: ");
        address = br.readLine();
        System.out.print("Enter mobile number: ");
        mob = sc.nextLong();
    }

    public void calculateFee()
    {
        if(std>=1 && std<=3)
            fee = 1000;
        else if(std>=4 && std<=7)
            fee =  2000;
        else
            fee = 5000;
    }

    public void displayDetails() {
        System.out.println("$$$$$$$$  STUDENT'S DETAILS  $$$$$$$$");
        System.out.println("NAME: " + name);
        System.out.print("ClASS: "+ std);
        System.out.println("\t\t\t\t\t\t\tSECTION: "+ sec);
        System.out.println("ADDRESS: " + address);
        System.out.print("MOBILE NO: " + mob);
        System.out.println("\t\t\t\t\t\t\tMonthly fee: "+fee);
    }

}
