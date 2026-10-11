//Q1

import java.util.Scanner;
class Clock {
    int hours, minutes, seconds;
    Clock(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }
    void display() {
        if (hours < 0 || hours > 23 ||
            minutes < 0 || minutes > 59 ||
            seconds < 0 || seconds > 59) {
            System.out.println("Invalid Time!");
        } else {
            String period = (hours >= 12) ? "PM" : "AM";
            int h = hours % 12;
            if (h == 0)
                h = 12;

            System.out.printf("Time: %02d:%02d:%02d %s%n",
                              h, minutes, seconds, period);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int h = sc.nextInt();
        System.out.print("Enter minutes: ");
        int m = sc.nextInt();
        System.out.print("Enter seconds: ");
        int s = sc.nextInt();
        Clock c = new Clock(h, m, s);
        c.display();
        sc.close();
    }
}

//Q2

let a = 10, b = 20;
console.log(`Before swapping: a = ${a}, b = ${b}`);
[a, b] = [b, a];
console.log(`After swapping: a = ${a}, b = ${b}`);

