package hwproject2;

public class EvenOddSum {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {13, 2, 6, 9},
                {15, 12, 18, 17},
                {100, 7, 25, 44},
        };
        int evensum1 = 0;
        int oddsum1 = 0;
        for (int[] ints : matrix1) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    evensum1 = evensum1 + anInt;
                }
                if (anInt % 2 != 0) {
                    oddsum1 = oddsum1 + anInt;
                }
            }
        }
        System.out.println("The even sum is "+evensum1+" The odd sum is "+oddsum1);
    }
}
