/*

import java.util.Scanner;


class ArrayList{


}

class Faculty extends Student{

}
class Student extends Main{
    void ChangeName(String fName, String lName){
        firstName = fName;
        lastName = lName;
        System.out.println( fName.concat(lName));
    }


}


public class Main {
    static String firstName;
    static String lastName;
    static int id;
    static double cgpa;

    // Method to display all
    void DisplayAll(String fName, String lName, int id, double cgpa){
        System.out.println( fName + " " + lName);
        System.out.println("Roll no : " + id);
        System.out.println("Cgpa of the Student  : " + cgpa);
    }

    //Main method to call
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Firstname of the Student : ");
        firstName = sc.nextLine();
        System.out.println("Enter lastName of the Student");
        lastName = sc.nextLine();
        System.out.println("Enter Id of the Student : ");
        id = sc.nextInt();
        System.out.println("Enter cgpa of the Student");
        cgpa = sc.nextDouble();
        Main b1 = new Main();
        Student b2 = new Student();

        int choice;
        do {
            System.out.println("Welcome Students / Faculty Members");
            System.out.println("Choose from the below choices ");
            System.out.println("1. Change your name ");
            System.out.println("2. Display all Data");

            choice = sc.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("Change Name in DB");
                    System.out.println("Enter new Name : ");
                    String fName = sc.next();
                    System.out.println("Enter your lastName :");
                    String lName = sc.next();
                    b2.ChangeName(fName, lName);
                    break;
                case 2:
                    System.out.println("Displaying All the Data");
                    b1.DisplayAll(firstName, lastName, id, cgpa);

                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);

                case 3:

            }
        } while (choice != 3);
    }
}
*/
