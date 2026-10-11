//Q1
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int a[] = {40, 10, 30, 20, 50};
        int sum = 0;

        for (int n : a)
            sum += n;

        System.out.println("Sum = " + sum);

        Arrays.sort(a);
        System.out.println("Ascending order: " + Arrays.toString(a));
    }
}


// Q2
<!DOCTYPE html>
<html>
<head>
<title>Student Registration</title>
<style>
body {
    font-family: Arial;
    background: #ffffe0;
}
form {
    width: 500px;
    margin: auto;
}
h2 { text-align: center; }
label {
    display: inline-block;
    width: 140px;
    margin: 8px 0;
}
input, select, textarea {
    margin: 5px;
}
button { margin: 10px; padding: 8px 20px; }
</style>
</head>
<body>

<h2>My-Future College / School</h2>
<p align="center">Student Registration Form</p>

<form>
<label>Student Name:</label>
<input type="text" minlength="3" maxlength="10" required>
<br>

<label>Date of Birth:</label>
<input type="date" required>
<br>

<label>Mobile No.:</label>
<input type="tel" pattern="[0-9]{10}" required>
<br>

<label>Email ID:</label>
<input type="email" required>
<br>

<label>Password:</label>
<input type="password" minlength="8" required>
<br>

<label>Gender:</label>
<input type="radio" name="gender" required>Male
<input type="radio" name="gender">Female
<br>

<label>Hobbies:</label>
<input type="checkbox">Drawing
<input type="checkbox">Singing
<input type="checkbox">Dancing
<br>

<label>Course:</label>
<select required>
<option value="">Select Course</option>
<option>BCA</option>
<option>BBA</option>
<option>B.Tech</option>
</select>
<br>

<label>Student Photo:</label>
<input type="file" accept="image/*">
<br>

<label>Register Time:</label>
<input type="time" required>
<br>

<label>Address:</label>
<textarea rows="3"></textarea>
<br>

<input type="checkbox" required>
I declare that the information is correct.
<br>

<button type="submit">Register</button>
<button type="reset">Reset</button>
</form>

</body>
</html>
