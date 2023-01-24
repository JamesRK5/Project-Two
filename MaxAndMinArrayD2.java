package hwproject2;

public class MaxAndMinArrayD2 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;
        int [][] matrix1={
                {14, 15, 16},
                {24, 25, 26},
                {5, 6, 7},
        };
        for (int i = 0; i< matrix1.length; i++){
            for (int j = 0; j<matrix1[i].length; j++){
                num1=matrix1[i][j];
                for (int k = 0; k < matrix1.length; k++){
                    for (int l = 0; l < matrix1[k].length; l++){
                        num2=matrix1[k][l];
                        if (num1>num2){
                            num3=matrix1[i][j];
                        }
                        if (num3>num1){
                            result=num3;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
