//Type Conversion --> byte > short > Int > Float > long > double

//Type Casting --> changing type of data forcefully (lossy conversion) using type casting

import java.util.*;

public class TypeCasting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = 10.9f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        int number = ch;
        System.out.println(number);
    }
}
