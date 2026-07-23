//Operators--> symbols that tell compiler to perform some operation

//Arithmetic Operators
// public class operators{
//     public static void main(String args[]){
//         //binary operators
//         // int a = 10;
//         // int b = 5;
//         // System.out.println("Add: " + (a + b));  
//         // System.out.println("Sub: " + (a - b));  
//         // System.out.println("Div: " + (a / b));  
//         // System.out.println("Mul: " + (a * b));  
//         // System.out.println("Mod: " + (a % b)); 

//         //unary operators
//         int a = 10;
//         //int b = ++a;
//         //int b = a++;
//         //int b = --a;
//         int b = a--;
//         System.out.println(a);
//         System.out.println(b);

//     }
// }

//Relational Operators
// public class operators{
//     public static void main(String args[]){
//         int A = 10;
//         int B = 5;
//         System.out.println((A == B));  //Equal to
//         System.out.println((A != B));  //Not equal to
//         System.out.println((A > B));   //Greater than
//         System.out.println((A < B));   //lesser than
//         System.out.println((A >= B));  //greater than equal to
//         System.out.println((A <= B));  //lesser than equal to

//     }
// }

//Logical Operators
// public class operators{
//     public static void main(String args[]){
//         System.out.println((3 > 2) && (5 > 0));    //Logical AND
//         System.out.println((3 > 2) || (5 < 0));    //Logical OR
//         System.out.println(!(3 > 2));              //Logical NOT
//     }
// }

//Assignment Operators
public class operators{
    public static void main(String args[]){
        int A = 10;
        //A = A + 10;
        A += 10;
        System.out.println(A);

        int B = 15;
        //B = B - 5;
        B -= 5;
        System.out.println(B);

        int C = 10;
        //C = C * 5;
        C *= 5;
        System.out.println(C);

        int D = 15;
        //D = D / 3;
        D /= 3;
        System.out.println(D);
    }
}
