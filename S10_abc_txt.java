//Q1
import java.io.*;

class FileDemo {
    public static void main(String[] args) throws IOException {
        FileReader f = new FileReader("abc.txt");
        int ch;
        while ((ch = f.read()) != -1)
            System.out.print(Character.toUpperCase((char) ch));
        f.close();
    }
}
//Q2
let name = "Rahul";
let rollNo = 101;
let course = "BCA";
let marks = 85;

let report = `
----- Student Report -----
Name: ${name}
Roll No: ${rollNo}
Course: ${course}
Marks: ${marks}
--------------------------
`;

console.log(report);
