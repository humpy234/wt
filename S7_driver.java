//Q1
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}
class Driver {
    int license_no, age;
    String name, address;
    Driver(int l, String n, String a, int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age is below 18 years");

        license_no = l;
        name = n;
        address = a;
        this.age = age;
    }
    void display() {
        System.out.println("License No: " + license_no);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        try {
            Driver d = new Driver(101, "Rahul", "Pune", 16);
            d.display();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

  //Q2
  <!DOCTYPE html>
<html>
<head>
<title>Programming Languages</title>
<style>
li:first-child {
    color: red;
    font-weight: bold;
}

li:last-child {
    color: blue;
    background: lightyellow;
}
</style>
</head>
<body>
<h2>Programming Languages</h2>
<ul>
    <li>Java</li>
    <li>Python</li>
    <li>C</li>
    <li>C++</li>
    <li>JavaScript</li>
</ul>
</body>
</html>

}
