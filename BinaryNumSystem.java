//Converting binary into decimal:

// public class Binary{
//     public static void binToDec(int binNum){
//         int myNum = binNum;
//         int pow = 0;
//         int decNum = 0;

//         while(binNum > 0){
//             int lastDigit = binNum % 10;
//             decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//             pow++;
//             binNum = binNum/10;
//         }
//         System.out.println("Decimal of " + myNum + " = " + decNum);
//     }
//     public static void main(String args[]){
//         binToDec(101);
//     }
// }

//Converting decimal into binary:

public class Binary{
    public static void DecToBin(int n){
        int myNum = n;
        int pow = 0;
        int BinNum = 0;

        while(n > 0){
            int rem = n % 2;
            BinNum = BinNum + (rem * (int)Math.pow(10, pow));

            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + myNum + " = " + BinNum);
    }
    public static void main(String args[]){
        DecToBin(7);
    }
}

