package hwproject2;

public class EvenOddArray {
    public static void main(String[] args) {
        int [][] matrix1={
                {13, 2, 6},
                {15, 12, 18},
                {100, 7, 25},
        };
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    System.out.print(anInt + " ");
                }
            }
        }
    }
}
