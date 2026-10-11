//Q1

import java.util.Scanner;
class AttendanceException extends Exception {
    AttendanceException(String msg) {
        super(msg);
    }
}
class Student {
    String student_name;
    int student_rollno, total_lectures, attended_lectures;
    Student(String name, int roll, int total, int attended) {
        student_name = name;
        student_rollno = roll;
        total_lectures = total;
        attended_lectures = attended;
    }
    void display() throws AttendanceException {
        double per = (attended_lectures * 100.0) / total_lectures;
        if (per < 75)
            throw new AttendanceException("Student is Not Eligible for Exam");
        System.out.println("Name: " + student_name);
        System.out.println("Roll No: " + student_rollno);
        System.out.println("Attendance: " + per + "%");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name, roll no, total lectures and attended lectures: ");
        Student s = new Student(sc.next(), sc.nextInt(),
                                sc.nextInt(), sc.nextInt());
        try {
            s.display();
        } catch (AttendanceException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

//Q2

const fs = require('fs');
fs.writeFile('test.txt', 'Hello Node.js!', (err) => {
    if (err) {
        console.log("Error creating file:", err.message);
        return;
    }

    console.log("File created successfully.");
    fs.copyFile('test.txt', 'copy.txt', (err) => {
        if (err) {
            console.log("Error copying file:", err.message);
            return;
        }
        console.log("File copied successfully.");
        fs.rename('copy.txt', 'new.txt', (err) => {
            if (err) {
                console.log("Error renaming file:", err.message);
                return;
            }
            console.log("File renamed successfully.");
            fs.unlink('new.txt', (err) => {
                if (err) {
                    console.log("Error deleting file:", err.message);
                    return;
                }
                console.log("File deleted successfully.");
            });
        });
    });
});

