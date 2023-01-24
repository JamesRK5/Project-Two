package hwproject2;

public class MaxMinArray {
    public static void main(String[] args) {
        int [] arr={14, 3, 4, 30, 28, 25, 26, 40, 2, 7};
        int high = arr[0];
        int low = arr[0];
        for (int i = 0; i< arr.length; i++) {
            if (high<arr[i]){
                high=arr[i];
            }
            if (low>arr[i]){
                low=arr[i];
            }
            }
        System.out.println("The highest number is "+high+" The lowest number is "+low);
        }
    }
