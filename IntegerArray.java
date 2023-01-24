package hwproject2;

import java.util.Scanner;

public class IntegerArray {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int [] arr= new int[10];
        int sum = 0;
        System.out.println("Please enter 10 numbers");
        for (int i = 0; i < arr.length; i++){
            arr[i]= inp.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The sum is "+sum);
    }
}
