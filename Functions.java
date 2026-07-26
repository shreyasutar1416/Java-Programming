//Functions/Methods --> Block of code, reusable

// public class Functions{
    // public static void printHelloWorld(){  //function
    //     System.out.println("Hello world");
    //     System.out.println("Hello world");
    //     System.out.println("Hello world");
    // }

    // public static int calculateSum(int num1, int num2){ //parameters or formal parameters
    //     int sum = num1 + num2;
    //     return sum;
    // }

    // public static void main(String args[]){
    //     // printHelloWorld();   //function call
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculateSum(a,b);   //actual parameters or arguments
    //     System.out.println("Sum is: " + sum);
    // }
    
    //Call by value:
    // public static void swap(int a, int b){
    //      //swap
    //     int temp = a;
    //     a = b;
    //     b = temp;

    //     System.out.println("a = " + a);
    //     System.out.println("b = " + b);
    // }

    // public static void main(String args[]){
    //     int a = 5;
    //     int b = 10;
    //     swap(a,b);
    // }

    //Find the product of a and b:
    // public static int multiply(int a, int b){
    //     int product = a * b;
    //     return product;
    // }

    // public static void main(String args[]){
    //     int a = 3;
    //     int b = 4;
    //     int prod = multiply(a, b);
    //     System.out.println("a * b = " + prod);
    //     prod = multiply(10,20);
    //     System.out.println("a * b = " + prod);
    // }

    //Factorial of n:
    // public static int factorial(int n){
    //     int f= 1;

    //     for(int i = 1; i <= n; i++){
    //         f = f * i;
    //     }
    //     return f;  //factorial of n
    // }

    // public static void main(String args[]){
    //     System.out.println(factorial(4));
    // }

    //Binomial Coefficients:
//     public static int BinCoeff(int n, int r){
//         int n_fact = factorial(n);
//         int r_fact = factorial(r);
//         int nmr_fact = factorial(n - r);

//         int BinCoeff = n_fact / (r_fact * nmr_fact);
//         return BinCoeff;
//     }

//     public static void main(String args[]){
//         System.out.println(BinCoeff(5,2));
//     }
// }

//Function overloading --> Multiple functions with same name but different parameters
public class Functions{
    //using parameters

    //func to cal 2 numbers
    // public static int sum(int a, int b){
    //     return a + b;
    // }
    // //func to cal 3 numbers
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }

    // public static void main(String args[]){
    //     System.out.println(sum(2, 4));
    //     System.out.println(sum(2, 4, 8));
    // }

    //using datatypes

    //func to cal int numbers
    // public static int sum(int a, int b){
    //     return a + b;
    // }
    // //func to cal float numbers
    // public static float sum(float a, float b){
    //     return a + b;
    // }

    // public static void main(String args[]){
    //     System.out.println(sum(2, 4));
    //     System.out.println(sum(2.5f, 4.6f));
    // }

    //Check if a number is prime or not
    // public static boolean isPrime(int n){
    //     for(int i = 2; i <= n-1; i++){
    //         if(n % i == 0){   //Completely dividing
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //optimized way 
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(n); i ++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // public static void main(String args[]){
    //     System.out.println(isPrime(12));
    // }

    //Print the Primes in range
    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        primesInRange(20); 
    }
}



