//Q1
import java.util.Scanner;
class Vehicle {
    String Company;
    double price;
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company: ");
        Company = sc.next();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }
    void display() {
        System.out.println("Company: " + Company);
        System.out.println("Price: " + price);
    }
}
class LightMotorVehicle extends Vehicle {
    double mileage;
    void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mileage: ");
        mileage = sc.nextDouble();
    }
    void display() {
        super.display();
        System.out.println("Mileage: " + mileage);
    }
}
class HeavyMotorVehicle extends Vehicle {
    double capacity_in_tons;
    void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Capacity in Tons: ");
        capacity_in_tons = sc.nextDouble();
    }
    void display() {
        super.display();
        System.out.println("Capacity: " + capacity_in_tons + " tons");
    }
}

class VehicleDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("1. Light  2. Heavy");
            System.out.print("Enter vehicle type: ");
            int type = sc.nextInt();

            if (type == 1) {
                LightMotorVehicle l = new LightMotorVehicle();
                l.accept();
                l.display();
            } else if (type == 2) {
                HeavyMotorVehicle h = new HeavyMotorVehicle();
                h.accept();
                h.display();
            } else {
                System.out.println("Invalid type!");
                i--;
            }
        }
        sc.close();
    }
}

//Q2

let m1 = 80, m2 = 75, m3 = 90;
const calculate = (a, b, c) => {
    let total = a + b + c;
    let average = total / 3;
    console.log(`Total Marks = ${total}`);
    console.log(`Average Marks = ${average}`);
};
calculate(m1, m2, m3);
