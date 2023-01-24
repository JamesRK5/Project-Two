package hwproject2;

public class SecondHighestInArray {
    public static void main(String[] args) {
        int [] arr={45, 3, 4, 30, 28, 25, 26, 40, 2, 7};
        int high=arr[0];
        int twohigh=0;
        for(int i=1;i< arr.length;i++) {
            if (high < arr[i]) {
                high = arr[i];
            }
        }for (int j=0;j< arr.length;j++){
            if (arr[j] != high && twohigh < arr[j])
                twohigh = arr[j];
        }

        System.out.println("The second highest number is "+twohigh);
    }
}
