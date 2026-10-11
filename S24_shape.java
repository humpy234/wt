//Q1
import java.util.Scanner;
abstract class Shape {
    abstract void area();
    abstract void volume();
}
class Cylinder extends Shape {
    double radius, height;
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    void area() {
        double a = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area: " + a);
    }
    void volume() {
        double v = Math.PI * radius * radius * height;
        System.out.println("Volume: " + v);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        Cylinder c = new Cylinder(r, h);
        c.area();
        c.volume();
        sc.close();
    }
}

//Q2
const fs = require('fs');
console.log("Synchronous Operation:");
fs.writeFileSync('test.txt', 'Hello Node.js');
let data = fs.readFileSync('test.txt', 'utf8');
console.log(data);
console.log("Sync operation completed.");
console.log("\nAsynchronous Operation:");
fs.writeFile('test.txt', 'Welcome Node.js', (err) => {
    if (err) throw err;
    console.log("File written asynchronously.");
    fs.readFile('test.txt', 'utf8', (err, data) => {
        if (err) throw err;
        console.log(data);
    });
});
console.log("Async operation continues...");

