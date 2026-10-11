//Q1
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter ending range: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            int n = i, sum = 0, digits = 0, temp = i;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = i;
            while (temp > 0) {
                int r = temp % 10;
                sum += (int) Math.pow(r, digits);
                temp /= 10;
            }
            if (sum == n)
                System.out.print(n + " ");
        }
        sc.close();
    }
}

//Q2
<!DOCTYPE html>
<html>
<head>
<title>Student Registration</title>
<style>
body { background: #ffe4e1; font-family: Arial; }
form { width: 500px; margin: auto; }
h2 { text-align: center; }
label {
    display: inline-block;
    width: 130px;
    margin: 8px;
}
</style>
</head>
<body>

<h2>Student Registration Form</h2>
<form>
<label>Roll No.:</label>
<input type="number" required><br>

<label>Student Name:</label>
<input type="text" placeholder="First Name"
       minlength="2" required>
<input type="text" placeholder="Last Name" required><br>

<label>Father's Name:</label>
<input type="text" required><br>

<label>Date of Birth:</label>
<input type="date" required><br>

<label>Mobile No.:</label>
<input type="tel" pattern="[0-9]{10}"
       placeholder="10 digit number" required><br>

<label>Email ID:</label>
<input type="email" required><br>

<label>Password:</label>
<input type="password" minlength="8" required><br>

<label>Gender:</label>
<input type="radio" name="gender" required>Male
<input type="radio" name="gender">Female<br>

<label>Department:</label>
<input type="checkbox">CSE
<input type="checkbox">IT
<input type="checkbox">ECE<br>

<label>Course:</label>
<select required>
<option value="">Select Course</option>
<option>BCA</option>
<option>BBA</option>
<option>B.Tech</option>
</select><br>

<label>Student Photo:</label>
<input type="file" accept="image/*"><br>

<center>
<input type="submit" value="Register">
<input type="reset" value="Reset">
</center>
</form>

</body>
</html>
