//print the numbers from n to 1 (Decresing order)

// public class Recursion{
//     public static void printDec(int n){
//         if(n == 1){
//             System.out.println(n);
//             return;
//         }

//         System.out.println(n+" ");
//         printDec(n - 1);
//     }
//     public static void main(String args[]){
//         int n = 10;
//         printDec(n);
//     }
// }

//print the numbers from n to 1 (Increasing order)

// public class Recursion{
//     public static void printInc(int n){
//         if(n == 1){
//             System.out.println(n);
//             return;
//         }

//         printInc(n - 1);
//         System.out.println(n+" ");
        
//     }
//     public static void main(String args[]){
//         int n = 10;
//         printInc(n);
//     }
// }

//Print factorial of number n

// public class Recursion{
//     public static int factorial(int n){
//         if(n == 0){
//             return 1;
//         }
        
//         int fnm1 = factorial(n - 1);
//         int fn = n * fnm1;
//         return fn;
//     }

//     public static void main(String args[]){
//         int n = 5;
//         System.out.println(factorial(n));
//     }
// }

//print sum of first n natural numbers

// public class Recursion{
//     public static int calcSum(int n){
//         if(n == 1){
//             return 1;
//         }
        
//         int Snm1 = calcSum(n - 1);
//         int Sn = n + Snm1;
//         return Sn;
//     }

//     public static void main(String args[]){
//         int n = 5;
//         System.out.println(calcSum(n));
//     }
// }

//print Nth fibonacci series

// public class Recursion{
//     public static int fibonacci(int n){
//         if(n == 1 || n == 0){
//             return n;
//         }
        
//         int fnm1 = fibonacci(n - 1);
//         int fnm2 = fibonacci(n - 2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }

//     public static void main(String args[]){
//         int n = 25;
//         System.out.println(fibonacci(n));
//     }
// }

//check if a given array is sorted or not

// public class Recursion{
//     public static boolean isSorted(int arr[], int i){
//         if(i == arr.length - 1){
//             return true;
//         }

//         if(arr[i] > arr[i + 1]){
//             return false;
//         }

//         return isSorted(arr, i + 1);
//     }

//     public static void main(String args[]){
//         int arr[]= {1,2,3,4,5};
//         System.out.println(isSorted(arr, 0));
//     }
// }

//WAF to find the first occurence of an element in an array

// public class Recursion{
//     public static int firstOccurence(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }

//         if(arr[i] == key){
//             return i;
//         }

//         return firstOccurence(arr, key, i + 1);
//     }

//     public static void main(String args[]){
//         int arr[]= {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         System.out.println(firstOccurence(arr,5,0));
//     }
// }

//WAF to find the last occurence of an element in an array

// public class Recursion{
//     public static int lastOccurence(int arr[], int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
        
//         int isFound = lastOccurence(arr, key, i + 1);
//         if(isFound == -1 && arr[i] == key){
//             return i;
//         }

//         // //check with self
//         // if(arr[i] == key){
//         //     return i;
//         // }

//         return isFound;
//     }

//     public static void main(String args[]){
//         int arr[]= {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         System.out.println(lastOccurence(arr,5,0));
//     }
// }

//print x to the power n

public class Recursion{
    // public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }

    //     // int xnm1 = power(x, n - 1);
    //     // int xn = x * xnm1;
    //     // return xn;

    //     return x * power(x, n - 1);
    // }

    //optimized way --> O(log n)

    public static int optimizedPower(int a, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String args[]){
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));
    }
}
