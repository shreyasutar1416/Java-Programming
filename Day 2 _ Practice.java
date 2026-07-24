/* Question 1 : Write a Java program to get a number from the 
user and print whether it is positive or negative.                 */

// import java.util.*;
// public class Day2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if(number > 0){
//             System.out.println("Positive number");
//         }else if(number < 0){
//             System.out.println("Negative number");
//         }else{
//             System.out.println("Zero Number");
//         }
//     }
// }

/* Question 2 : Finish the following code so that it prints 
You have a fever if your temperature is above 100 and otherwise 
prints You don't have a fever.                 */

// public class Day2{
//     public static void main(String args[]){
//         double temp = 103.5;
//         if(temp > 100){
//             System.out.println("You have Fever");
//         }else{
//             System.out.println("You Don't have Fever");
//         }
//     }
// }

/* Question 3 : Write a Java program to input week number (1-7) 
and print day of week name using switch case.                   */

// import java.util.*;
// public class Day2{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the week number: ");
//         int week = sc.nextInt();
//         switch(week){
//             case 1 : System.out.println("Monday");
//                     break;
//             case 2 : System.out.println("Tuesday");
//                     break;
//             case 3 : System.out.println("Wednesday");
//                     break;
//             case 4 : System.out.println("Thursday");
//                     break;
//             case 5 : System.out.println("Friday");
//                     break;
//             case 6 : System.out.println("Saturday");
//                     break;
//             case 7 : System.out.println("Sunday");
//                     break;
//             default: System.out.println("Invalid Week Number, please enter week number between (1-7)");
//         }
//     }
// }

/* Question 5 : Write a Java program that takes a year from the 
user and print whether that year is a leap year or no                   */

import java.util.*;
public class Day2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        
        if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0){
            System.out.println("Is a Leap year");
        }else{
            System.out.println("Not a Leap year");
        }

        // if(year % 100 == 0){
        //     System.out.println("Is a leap year");
        // }else{
        //     System.out.println("Not a leap year");
        // }

        // if(year % 400 == 0){
        //     System.out.println("Is a leap year");
        // }else{
        //     System.out.println("Not a leap year");
        // }
    }
}
