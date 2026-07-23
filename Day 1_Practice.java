/* Question 1: In a program, input 3 numbers : A, B and C. 
You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)             */

import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c)/3;
        System.out.println(avg);
    }
}

/* Question 2 : In a program, input the side of a square.
You have to output the area of the square.
(Hint : area of a square is (side x side))                  */

import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side*side;
        System.out.println(area);
    }
}

/* Question 3 : Enter cost of 3 items from the user 
(using float datatype)- a pencil, a pen and an eraser. 
You have to output the total cost of the items back to 
the user as their bill.(Add on : You can also try adding 
18% gst tax to the items in the bill as an advanced problem)) */

import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pencil cost: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the pen cost: ");
        float pen = sc.nextFloat();

        System.out.print("Enter the eraser cost: ");
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;

        System.out.println("Total cost of items: " + bill);
    }
}

