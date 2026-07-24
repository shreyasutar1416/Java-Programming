//Print according to Age group:

// public class Conditional{
//     public static void main(String args[]){
//         int age = 16;
//         if(age >= 18){
//             System.out.println("Adult: drive, vote");
//         }

//         if(age > 13 && age < 18){
//             System.out.println("Teenager");
//         }else{
//             System.out.println("Not Adult");
//         }
//     }
// }

//Print the largest of 2 numbers:

// public class Conditional{
//     public static void main(String args[]){
//         int A = 10;
//         int B = 20;
//         if(A >= B){
//             System.out.println("A is Largest number");
//         }else{
//             System.out.println("B is Largest number");
//         }
//     }
// }

//Print if number is even or odd:

// public class Conditional{
//     public static void main(String args[]){
//         int number = 9;
//         if(number % 2 == 0){
//             System.out.println("Even Number");
//         }else{
//             System.out.println("Odd Number");
//         }
//     }
// }

//Else if:

// import java.util.*;

// public class Conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int marks = sc.nextInt();
//         if(marks >= 90){
//             System.out.println("Grade A");
//         }else if(marks >= 70 && marks < 90){
//             System.out.println("Grade B");
//         }else{
//             System.out.println("Grade C");
//         }
//     }
// }

//Income Tax Calculator:

// import java.util.*;

// public class Conditional{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;
//         if(income < 500000){
//             tax = 0;
//         }else if(income >= 500000 && income < 1000000){
//             tax = (int) (income * 0.2);
//         }else{
//             tax = (int) (income * 0.3);
//         }

//         System.out.println("your tax is: " + tax);
//     }
// }

//Print the largest of 3 numbers:

// public class Conditional{
//     public static void main(String args[]){
//         int a = 3;
//         int b = 7;
//         int c = 2;
//         if((a >= b) && (a >= c)){
//             System.out.println("Largest is a");
//         }else if(b >= c){
//             System.out.println("Largest is b");
//         }else{
//             System.out.println("Largest is c");
//         }
//     }
// }

//Ternary opertaor: variable = condition ? statement 1 : statement 2;

// public class Conditional{
//     public static void main(String args[]){
//         int number = 9;

//         //ternary operator
//         String type = (number % 2 == 0) ? "Even" : "Odd";
//         System.out.println(type);
//     }
// }

//Check if a student will pass or fail:

// public class Conditional{
//     public static void main(String args[]){
//         int marks = 50;

//         //ternary operator
//         String reportCard = (marks >= 35) ? "Pass" : "Fail";
//         System.out.println("Result: " + reportCard);
//     }
// }

//Switch statement:

// public class Conditional{
//     public static void main(String args[]){
//         int number = 3;
//         switch(number){
//             case 1 -> System.out.println("samosa");
//             case 2 -> System.out.println("Burger");
//             case 3 -> System.out.println("Mangoshake");
//             default -> System.out.println("We wake up");
//         }
//     }
// }

// public class Conditional{
//     public static void main(String args[]){
//         char ch = 'a';
//         switch(ch){
//             case 'd'-> System.out.println("samosa");
//             case 'c'-> System.out.println("Burger");
//             case 'a'-> System.out.println("Mangoshake");
//             default -> System.out.println("We wake up");
//         }
//     }
// }

//Calculator:

import java.util.*;

public class Conditional{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            default -> System.out.println("Wrong operator");
        }
    }
}
