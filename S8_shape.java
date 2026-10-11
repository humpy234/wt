//Q1
abstract class Shape {
    int a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        a = 10;
        b = 5;
        System.out.println("Area of Rectangle = " + (a * b));
    }
}

class Triangle extends Shape {
    void printArea() {
        a = 10;
        b = 5;
        System.out.println("Area of Triangle = " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    void printArea() {
        a = 7;
        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}

class Main {
    public static void main(String[] args) {
        new Rectangle().printArea();
        new Triangle().printArea();
        new Circle().printArea();
    }

  //Q2
  <!DOCTYPE html>
<html>
<head>
    <title>Change Image</title>
</head>
<body>

<h2>Image Change Example</h2>

<img id="myImage"
src="https://picsum.photos/id/10/200/150"
width="200" height="150">

<br><br>

<button onclick="changeImage()">Change Image</button>

<script>
function changeImage() {
    document.getElementById("myImage").src =
    "https://picsum.photos/id/20/200/150";
}
</script>

</body>
</html>

}
