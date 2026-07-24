//Print pattern

// public class pattern{
//     public static void main(String args[]){
//         System.out.println("****");  
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }

//Print Square Pattern

// public class pattern{
//     public static void main(String args[]){
//         for(int i = 1; i <= 4; i++){
//             System.out.println("****");
//         }
//     }
// }

//Nested loops:
//Print star pattern

// public class pattern{
//     public static void main(String args[]){
//         for(int line = 1; line <= 4; line++){
//             //one line
//             for(int star = 1; star <= line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Print Inverted star pattern

// public class pattern{
//     public static void main(String args[]){
//         int n = 4;

//         for(int line = 1; line <= n; line++){
//             for(int star = 1; star <= (n-line+1); star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Print half pyramid pattern

// public class pattern{
//     public static void main(String args[]){
//         int n = 4;

//         for(int line = 1; line <= n; line++){
//             //numbers print
//             for(int number = 1; number <= line; number++){
//                 System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }

//Print Character Pattern

public class pattern{
    public static void main(String args[]){
        int n = 4;
        char ch = 'A';

        //outer loop
        for(int line = 1; line <= n; line++){
            //inner loop
            for(int chars = 1; chars <= line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
