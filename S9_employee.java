//Q1
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    void input(Scanner sc) {
        System.out.print("Enter id, name and salary: ");
        id = sc.nextInt();
        name = sc.next();
        salary = sc.nextDouble();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee e[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            e[i].input(sc);
        }

        Employee max = e[0];
        for (int i = 1; i < n; i++) {
            if (e[i].salary > max.salary)
                max = e[i];
        }

        System.out.println("Employee with maximum salary: " + max.name);
        System.out.println("Maximum Salary: " + max.salary);

        sc.close();
    }

  //Q2
let a = 20, b = 10;

let add = (a, b) => a + b;
let sub = (a, b) => a - b;
let mul = (a, b) => a * b;
let div = (a, b) => a / b;

console.log("Addition = " + add(a, b));
console.log("Subtraction = " + sub(a, b));
console.log("Multiplication = " + mul(a, b));
console.log("Division = " + div(a, b));
