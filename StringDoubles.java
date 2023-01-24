package hwproject2;

public class StringDoubles {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three", "four", "five", "six", "one", "three", "five"};
        for (int i = 0; i < arr.length; i++) {
            String check = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                String check2 = arr[j];
                if (check == check2) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
