//Q1
import java.util.Scanner;

class NumberException extends Exception {
    NumberException(String msg) {
        super(msg);
    }
}

class Prime {
    static void check(int n) throws NumberException {
        if (n == 0) {
            throw new NumberException("Number is 0");
        }

        if (n < 2) {
            System.out.println(n + " is not Prime");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not Prime");
                return;
            }
        }

        System.out.println(n + " is Prime");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            Prime.check(n);
        } catch (NumberException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

//Q2

const fs = require('fs');
const filePath = 'demo.txt';
fs.stat(filePath, (err, stats) => {
    if (err) {
        console.log("Error:", err.message);
        return;
    }
    console.log("File Statistics");
    console.log("File Size:", stats.size, "bytes");
    console.log("File Type:", require('path').extname(filePath));
    console.log("Creation Time:", stats.birthtime);
    console.log("Last Access Time:", stats.atime);
    console.log("Last Modification Time:", stats.mtime);
    if (stats.isFile()) {
        console.log("Path represents a File");
    } else if (stats.isDirectory()) {
        console.log("Path represents a Directory");
    }
});

