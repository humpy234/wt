//Q1
interface Display {
    void display();
}
class Product implements Display {
    int product_id, product_quantity;
    String product_name;
    double product_cost;
    static int count = 0;
    Product() {
        product_id = 0;
        product_name = "Unknown";
        product_cost = 0;
        product_quantity = 0;
        count++;
    }
    Product(int id, String name, double cost, int qty) {
        product_id = id;
        product_name = name;
        product_cost = cost;
        product_quantity = qty;
        count++;
    }
    public void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Cost: " + product_cost);
        System.out.println("Product Quantity: " + product_quantity);
        System.out.println();
    }
    public static void main(String args[]) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Pen", 10, 5);
        Product p3 = new Product(102, "Book", 50, 3);
        p1.display();
        p2.display();
        p3.display();
        System.out.println("Total Objects: " + count);
    }
}

//Q2

const fs = require('fs');
fs.writeFile('test.txt', 'Hello Node.js!', (err) => {
    if (err) throw err;
    console.log("File created and written.");
    fs.readFile('test.txt', 'utf8', (err, data) => {
        if (err) throw err;
        console.log("File Content:", data);
        fs.appendFile('test.txt', '\nWelcome!', (err) => {
            if (err) throw err;
            console.log("Data appended.");
            fs.readFile('test.txt', 'utf8', (err, data) => {
                if (err) throw err;
                console.log("Updated Content:", data);
                fs.unlink('test.txt', (err) => {
                    if (err) throw err;
                    console.log("File deleted.");
                });
            });
        });
    });
});

