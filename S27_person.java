//Q1
import java.util.Scanner;

class Person {
    String Personname, Aadharno, Panno;

    Person(String Personname, String Aadharno, String Panno) {
        this.Personname = Personname;
        this.Aadharno = Aadharno;
        this.Panno = Panno;
    }

    void display() {
        System.out.println("Name: " + Personname);
        System.out.println("Aadhar No: " + Aadharno);
        System.out.println("PAN No: " + Panno);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Person p[] = new Person[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Aadhar No: ");
            String aadhar = sc.nextLine();
            System.out.print("PAN No: ");
            String pan = sc.nextLine();

            p[i] = new Person(name, aadhar, pan);
        }

        System.out.println("\n--- Person Details ---");
        for (int i = 0; i < 5; i++) {
            p[i].display();
        }

        sc.close();
    }
}
//Q2
