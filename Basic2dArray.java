package hwproject2;

public class Basic2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 10, 15},
                {6, 7, 8},
                {55, 12, 32},
        };
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j< arr[i].length; j++){
                sum = sum + arr[i][j];
                System.out.println(sum);
            }
        }
    }
}
