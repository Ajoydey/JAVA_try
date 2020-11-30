package SchoolManagementSystem;

import java.util.*;
import java.io.*;

public class Teacher {

    String name;
    int teaching_period;  //in years
    String address;
    long mob;
    String email_address;
    double paycheck;

    Teacher() {
        name = null;
        teaching_period = 0;
        address = null;
        mob = 0L;
        email_address = null;
    }

    public void addDetails()throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        name = br.readLine();
        System.out.print("Enter address: ");
        address = br.readLine();
        System.out.print("Enter mobile number: ");
        mob = sc.nextLong();
        System.out.print("Enter email address: ");
        email_address = sc.nextLine();
        System.out.print("Enter the teaching period: ");
        teaching_period = sc.nextInt();
    }

    public void setPaycheck() {
        paycheck = 50000 + teaching_period * 1500;
    }

    public void displayDetails() {
        System.out.println("@@@@@@@@@  TEACHER'S DETAILS  @@@@@@@@@@@");
        System.out.println("NAME: " + name);
        System.out.println("ADDRESS: " + address);
        System.out.print("MOBILE NO: " + mob);
        System.out.println("\t\t\t\t\t\t\tEMAIL ADDRESS: " + email_address);
        System.out.println("SALARY: " + paycheck);
    }
}
