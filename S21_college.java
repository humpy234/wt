//Q1

import java.util.Scanner;
class College {
    int cno;
    String cname, caddr;
    void acceptCollege() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter College Number: ");
        cno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter College Name: ");
        cname = sc.nextLine();
        System.out.print("Enter College Address: ");
        caddr = sc.nextLine();
    }
    void displayCollege() {
        System.out.println("College Number: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + caddr);
    }
}
class Department extends College {
    int dno;
    String dname;
    void acceptDepartment() {
        acceptCollege();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department Number: ");
        dno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department Name: ");
        dname = sc.nextLine();
    }
    void display() {
        displayCollege();
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name: " + dname);
    }
    public static void main(String args[]) {
        Department d = new Department();
        d.acceptDepartment();
        System.out.println("\nCollege Details:");
        d.display();
    }
}

//Q2

const path = require('path');
let p = path.join('folder', 'subfolder', 'file.txt');
console.log("Joined Path:", p);
console.log("Resolved Path:", path.resolve(p));
console.log("Directory Name:", path.dirname(p));
console.log("File Name:", path.basename(p));
console.log("File Extension:", path.extname(p));

