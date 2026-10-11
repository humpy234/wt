//Q1
class MyNumber {
    private int num;
    MyNumber() {
        num = 0;
    }
    MyNumber(int n) {
        num = n;
    }
    void isNegative() {
        if (num < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is not Negative");
    }
    void isPositive() {
        if (num > 0)
            System.out.println("Number is Positive");
        else
            System.out.println("Number is not Positive");
    }
    void isOdd() {
        if (num % 2 != 0)
            System.out.println("Number is Odd");
        else
            System.out.println("Number is not Odd");
    }
    void isEven() {
        if (num % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is not Even");
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please pass a number as command line argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        MyNumber obj = new MyNumber(n);
        obj.isNegative();
        obj.isPositive();
        obj.isOdd();
        obj.isEven();
    }
}

//Q2
const fs = require('fs');
const path = require('path');
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
function ask(q) {
    return new Promise(resolve => rl.question(q, resolve));
}
async function main() {
    while (true) {
        console.log("\n--- File Management Menu ---");
        console.log("1. Create File");
        console.log("2. Read File");
        console.log("3. Update File");
        console.log("4. Rename File");
        console.log("5. Delete File");
        console.log("6. Exit");

        let choice = await ask("Enter your choice: ");
        let name, newName, content;
        let filePath;

        try {
            if (choice === '6') {
                console.log("Exiting...");
                break;
            }

            if (!['1', '2', '3', '4', '5'].includes(choice)) {
                console.log("Invalid choice!");
                continue;
            }

            name = await ask("Enter file name (.txt): ");

            if (!/^[a-zA-Z0-9_-]+\.txt$/.test(name)) {
                console.log("Enter a valid .txt file name!");
                continue;
            }

            filePath = path.join(__dirname, name);

            switch (choice) {
                case '1':
                    content = await ask("Enter content: ");
                    fs.writeFileSync(filePath, content, { flag: 'wx' });
                    console.log("File created successfully!");
                    break;

                case '2':
                    console.log(fs.readFileSync(filePath, 'utf8'));
                    break;

                case '3':
                    content = await ask("Enter new content: ");
                    fs.appendFileSync(filePath, content);
                    console.log("File updated successfully!");
                    break;

                case '4':
                    newName = await ask("Enter new file name (.txt): ");

                    if (!/^[a-zA-Z0-9_-]+\.txt$/.test(newName)) {
                        console.log("Enter a valid .txt file name!");
                        continue;
                    }
                    fs.renameSync(filePath, path.join(__dirname, newName));
                    console.log("File renamed successfully!");
                    break;
                case '5':
                    fs.unlinkSync(filePath);
                    console.log("File deleted successfully!");
                    break;
            }
        } catch (err) {
            console.log("Error:", err.message);
        }
    }
    rl.close();
}
main();

