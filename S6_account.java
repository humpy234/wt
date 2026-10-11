//Q1
class Account {
    String custname;
    int accno;

    Account() {
        custname = "Unknown";
        accno = 0;
    }

    Account(String name, int no) {
        custname = name;
        accno = no;
    }
}

class SavingAccount extends Account {
    double savingbal, minbal;

    SavingAccount(String name, int no, double bal, double min) {
        super(name, no);
        savingbal = bal;
        minbal = min;
    }
}

class AccountDetail extends SavingAccount {
    double depositamt, withdrawalamt;

    AccountDetail(String name, int no, double bal, double min,
                  double dep, double wd) {
        super(name, no, bal, min);
        depositamt = dep;
        withdrawalamt = wd;
    }

    void display() {
        System.out.println("Customer Name: " + custname);
        System.out.println("Account Number: " + accno);
        System.out.println("Saving Balance: " + savingbal);
        System.out.println("Minimum Balance: " + minbal);
        System.out.println("Deposit Amount: " + depositamt);
        System.out.println("Withdrawal Amount: " + withdrawalamt);
        System.out.println("Final Balance: " +
                (savingbal + depositamt - withdrawalamt));
    }

    public static void main(String[] args) {
        AccountDetail a = new AccountDetail(
            "Rahul", 101, 5000, 1000, 2000, 500
        );
        a.display();
    }

  //Q2
  <!DOCTYPE html>
<html>
<head>
<title>Hover Effect</title>
<style>
button {
    background: blue;
    color: white;
    padding: 10px;
    border: none;
}
button:hover {
    background: green;
    cursor: pointer;
}

a {
    color: blue;
    text-decoration: none;
}
a:hover {
    color: red;
    text-decoration: underline;
}
</style>
</head>
<body>
<h2>Hover Effects</h2>
<button>Click Me</button>
<br><br>
<a href="https://www.google.com">Visit Google</a>
</body>
</html>

}
