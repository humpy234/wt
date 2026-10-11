//Q1
import java.util.Scanner;
class InvalidDateException extends Exception {
    InvalidDateException(String msg) {
        super(msg);
    }
}
class MyDate {
    int Day, Month, year;
    void accept() throws InvalidDateException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (dd mm yyyy): ");
        Day = sc.nextInt();
        Month = sc.nextInt();
        year = sc.nextInt();
        if (Month < 1 || Month > 12 || Day < 1 ||
            Day > java.time.YearMonth.of(year, Month).lengthOfMonth()) {
            throw new InvalidDateException("Invalid Date!");
        }
    }
    void display() {
        System.out.printf("Date: %02d/%02d/%04d%n", Day, Month, year);
    }
    public static void main(String args[]) {
        MyDate d = new MyDate();
        try {
            d.accept();
            d.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}

//Q2

const fs = require('fs');
const path = require('path');
const dir = './';
const extensions = ['.txt', '.json', '.js'];
fs.readdir(dir, (err, files) => {
    if (err) {
        console.log("Error reading directory:", err.message);
        return;
    }
    console.log("Matching Files:");

    files.forEach(file => {
        const ext = path.extname(file);

        if (extensions.includes(ext)) {
            console.log(file);
        }
    });
});

