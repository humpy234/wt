//Q1

import java.util.Scanner;
interface Calculator {
    void add(int a, int b);
    void subtract(int a, int b);
}
class SimpleCalc implements Calculator {
    public void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
    public void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        SimpleCalc c = new SimpleCalc();
        c.add(a, b);
        c.subtract(a, b);
        sc.close();
    }
}
//Q2
const fs = require('fs');

fs.mkdirSync('myFolder', { recursive: true });
console.log("Directory created");

console.log("Files:", fs.readdirSync('.'));

fs.renameSync('myFolder', 'newFolder');
console.log("Directory renamed");

const data = {
    name: "Rahul",
    age: 20,
    course: "Computer Science"
};

fs.writeFileSync('data.json', JSON.stringify(data, null, 2));
console.log("JSON file created");

const content = fs.readFileSync('data.json', 'utf8');
const obj = JSON.parse(content);
console.log("JSON Data:", obj);

fs.rmdirSync('newFolder');
console.log("Directory deleted");
