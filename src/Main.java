//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1,num2,num3;
//        num1 = sc.nextInt();
//        num2 = sc.nextInt();
//        num3 = sc.nextInt();
//        int largest = num1;
//        if((num2 > largest) && (num2 > num3))
//        {
//            largest = num2;
//        } else if ((num3 > largest) && (num3 > num2)) {
//            largest = num3;
//        }
//
//
//        System.out.println(largest);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        for (int row = 1; row <= 2; row++) {
//            for (int value = 1; value <= 5; value++) {
//                System.out.print(value + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        int counter = 0;
//        while (counter <= 7) {
//            if (counter % 2 == 0) {
//                counter += 1;
//                continue;
//            } else {
//                counter += 1;
//            }
//            System.out.println(counter);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int i = 0;
//        for (; i <= 3; i++) {
//            if (i++ % 2 == 0) {
//                System.out.println("i = " + i);
//            }
//        }
//        System.out.println("i after the loop = " + i);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int num1 = 0;
//        int num2 = 0;
//        for (int i = 0; i < 5; i++) {
//            if ((++num1 > 2) && (++num2 > 2)) {
//                num1++;
//            }
//        }
//        System.out.println(num1 + " and " + num2);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 2; i >= i % 2; i--) {
//            System.out.println(i);
//
//        }
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num1,num2,ans;
//        ans = 0;
//        num1 = sc.nextInt();
//        num2 = sc.nextInt();
//        if(num1 == num2)
//        {
//            ans = num1 + num2;
//        }
//        else if(num1 != num2)
//        {
//            ans = ((num1 + num2) * 2);
//        }
//        System.out.println(ans);
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        double a,b,c;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextDouble();
//        b = sc.nextDouble();
//        c = sc.nextDouble();
//        int descriminent = (int)((b * b) - (4 * a * c));
//        if(descriminent == 0)
//        {
//            double root1 = (- b) / (2 * a);
//            System.out.println(root1);
//        } else if (descriminent > 0) {
//            double roo1 = (-b + (descriminent)) / (2 * a);
//            double roo2 = (-b - (descriminent)) / (2 * a);
//            System.out.println(roo1);
//            System.out.println(roo2);
//        }
//        else {
//            System.out.println("The equation has no real roots");
//        }
//    }
//}
//
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a,b,c;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        int ans = 0;
//        if(a == 7)
//        {
//            ans = b * c;
//        }
//        else if(b == 7)
//        {
//            ans = c;
//        }
//        else if(c == 7)
//        {
//            ans = -1;
//        }
//        else{
//            ans = a * b * c;
//        }
//    }
//}
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        char foodType;
//        int nonVegPrice = 0;
//        int vegPrice = 0;
//        int quantity = 0;
//        int distance = 0;
//        double distance1 = 0;
//        int serviceTime = 0;
//        foodType = sc.next().charAt(0);
//        quantity = sc.nextInt();
//        distance = sc.nextInt();
//        int cost = 0;
//
//        if(distance > 0) {
//            while (distance1 >= 0) {
//                distance1 = distance1 / 3;
//                serviceTime = serviceTime + 1;
//            }
//            switch (serviceTime) {
//                case 1:
//                    cost = cost + 0;
//                    break;
//                case 2:
//                    cost = cost + 1;
//                    break;
//                case 3:
//                    cost = cost + 2;
//            }
//        }
//
//        if(distance > 0) {
//
//                if (foodType == 'N') {
//
//                    nonVegPrice = nonVegPrice + 15 * quantity;
//                    int totalPriceNonVeg = 0;
//                    totalPriceNonVeg = nonVegPrice + cost;
//                    System.out.println(totalPriceNonVeg);
//
//                } else if (foodType == 'V') {
//                    vegPrice = vegPrice + 12 * quantity;
//                    int totalPriceVeg = 0;
//                    totalPriceVeg = vegPrice + cost;
//                    System.out.println(totalPriceVeg);
//                }
//
//        }
//        else {
//            System.out.println(-1);
//        }
//
//    }
//}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        long accountNumber = sc.nextLong();
//        long salary = sc.nextLong();
//        long accountBalance = sc.nextLong();
//        String loanType = sc.next();
//        long loanAmountExpected = sc.nextLong();
//        long emisExpected = sc.nextLong();
//
//        long eligibleLoan = 0;
//        int eligibleEmis = 0;
//        boolean isEligible = false;
//
//        switch (loanType) {
//            case "Car":
//                if (salary >= 25000) {
//                    eligibleLoan = 500000;
//                    eligibleEmis = 36;
//                    isEligible = true;
//                }
//                break;
//            case "House":
//                if (salary >= 50000) {
//                    eligibleLoan = 6000000;
//                    eligibleEmis = 60;
//                    isEligible = true;
//                }
//                break;
//            case "Business":
//                if (salary >= 75000) {
//                    eligibleLoan = 7500000;
//                    eligibleEmis = 84;
//                    isEligible = true;
//                }
//                break;
//            default:
//        }
//
//        if (isEligible) {
//
//                System.out.println(eligibleLoan);
//                System.out.println(eligibleEmis);
//
//        } else {
//
//        }
//    }
//}
// FINAL QUESTIONS ANSWERS FINDING
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        String input1 = "warner";
//        String input2 = new String("WARNER");
//        input2.toLowerCase();
//        if(input1 == input2){
//            System.out.println("Welcome" + input1);
//        }
//        else if(input1.equals(input2)){
//            System.out.println("Welcome" + input2);
//        }
//        else{
//            System.out.println("Welcome");
//        }
//    }
//}
//
//import java.util.*;
//class Parent{
//    public final void displayMessage()
//    {
//        System.out.println("displayMessage() method of Parent invoked");
//    }
//}
//class Child extends Parent{
//    public void displayMessage()
//    {
//        System.out.println("");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Parent parent = new Child();
//        parent.displayMessage();
//    }
//}
//class Employee{
//    private int employeeID;
//    private static int counter = 1000;
//    public Employee()
//    {
//        employeeID = ++counter;
//    }
//    public int getEmployeeID(){
//        return employeeID;
//    }
//    public static int getCounter()
//    {
//        return counter;
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        Employee employee1 = new Employee();
//        Employee employee2 = new Employee();
//        Employee employee3 = new Employee();
//        displayEmployeeDetails(employee1);
//        displayEmployeeDetails(employee2);
//        displayEmployeeDetails(employee3);
//
//
//    }
//    public static void  displayEmployeeDetails(Employee employee)
//    {
//        System.out.println(employee.getEmployeeID() + "" + employee.getCounter());
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        short discountPercentage = 7;
//        int noOfItems = 10;
//        float pricePerItem = 255.6f;
//        float taxAmount = 135.50f;
//        int discountAmount = (noOfItems * (int) pricePerItem) * (1 - discountPercentage / 100);
//        double totalAmount = discountAmount + taxAmount;
//        System.out.println("TotalAmountPaidIs:"+ totalAmount);
//    }
////}
//class Address{
//    private int zipCode;
//    public Address(int zipCode){
//        this.zipCode = zipCode;
//    }
//    public int getZipCode()
//    {
//        return zipCode;
//    }
//}
//class Customer{
//    public Address address;
//    public  String name;
//    public Customer(String name, int zipCode)
//    {
//        this.name = name;
//        address = new Address(zipCode);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//    Customer cu = new Customer("Sam",100001);
//        System.out.println(cu.address.getZipCode());
//    }
//}
//class Calculator{
//    public int num1 = 10;
//    public float num2 = 20;
//    public double sum;
//    public double product;
//    public double add(int num1, int num2)
//    {
//        double sum = this.num1 + this.num2;
//        return sum;
//    }
//    public double multiply(int num1, int num2)
//    {
//        double sum = this.add(num1,num2);
//        double product = this.sum * this.num1;
//        return (int)product;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Calculator c = new Calculator();
//        System.out.println(c.multiply(10,5));
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int num1 = -20;
//        int num2 = -30;
//        int num3 = 10;
//        int num4 = -40;
//        if((num1 + num2) >= num4){
//            if(num4 < num3){
//                if(num4 % num3 != 0){
//                    System.out.println(1);
//                }
//                else {
//                    System.out.println(2);
//                }
//            }
//        }else {
//            if(num2 / num1 > 0){
//                if(num1 < num2 || num4 % num3 == 0){
//                    System.out.println(3);
//                }else {
//                    System.out.println(4);
//                }
//            }
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int num1 = 28;
//        int num2 = 36;
//        int num3 = 0;
//        if(~(num2 / num1) < 0 && (num1 + num2) % 4 == 0){
//            num1 = num1 + --num3;
//        }
//        if((num2 / num1) > 1 || num3 == 0)
//        {
//            num1 = num1 + num3++;
//            System.out.println(num1 + --num3);
//        }
//        else {
//            System.out.println(num1 + --num3);
//        }
//    }
//}
//class Employee{
//    public String name;
//    public char gender;
//    public double salary;
//    public  Employee(String name,char gender)
//    {
//        this.name = name;
//        this.gender = gender;
//    }
//    public Employee(String name){
//        this.name = name;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Employee emp1 = new Employee("Robert",'M');
//        Employee emp2 = new Employee("Alex");
//        System.out.println(emp2.name + "," + emp2.gender + "," + emp1.name );
//    }
//}

//class Student{
//    public int studentId;
//    public String name;
//}
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = s1;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int sum = 0;
//        for(int i = 2;i < 8;i +=2){
//            for(int j = 8;j > i;j -= 2){
//                if(i >= j / 2){
//                    continue;
//                }else {
//                    sum += i + j;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}
//class Validator{
//    public int[] studentId = {101, 102, 103};
//    public  void validateStudent(int id)
//    {
//        try{
//            for(int index = 0;index <= studentId.length;index++){
//                if(id == studentId[index])
//                    System.out.println("P");
//
//
//            }
//        }finally {
//            System.out.println("Q");
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Validator validator = new Validator();
//        try {
//            validator.validateStudent(101);
//            System.out.println("R");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("S");
//        }finally {
//            System.out.println("T");
//        }
//    }
//}
