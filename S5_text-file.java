//Q1
import java.io.*;
import java.util.Scanner;
class FileDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fname = sc.nextLine();
        FileReader fr = new FileReader(fname);
        StringBuilder s = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1)
            s.append((char) ch);
        fr.close();
        System.out.println("Reverse order:");
        System.out.println(s.reverse());
        System.out.println("Changed case:");
        String text = s.reverse().toString();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c))
                System.out.print(Character.toLowerCase(c));
            else
                System.out.print(Character.toUpperCase(c));
        }
        sc.close();
    }
}
//Q2
<!DOCTYPE html>
<html>
<head>
<title>Image Gallery</title>
<style>
body {
    font-family: Arial;
    text-align: center;
    background: #f2f2f2;
}

.gallery {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
    gap: 15px;
    padding: 20px;
}

.gallery img {
    width: 100%;
    height: 200px;
    object-fit: cover;
    border-radius: 10px;
    transition: 0.3s;
}

.gallery img:hover {
    transform: scale(1.05);
    opacity: 0.8;
}
</style>
</head>
<body>

<h2>My Image Gallery</h2>

<div class="gallery">
    <img src="https://picsum.photos/id/10/400/300" alt="Forest">
    <img src="https://picsum.photos/id/20/400/300" alt="Nature">
    <img src="https://picsum.photos/id/30/400/300" alt="Mountains">
    <img src="https://picsum.photos/id/40/400/300" alt="Beach">
    <img src="https://picsum.photos/id/50/400/300" alt="Flowers">
    <img src="https://picsum.photos/id/60/400/300" alt="Landscape">
</div>

</body>
</html>
