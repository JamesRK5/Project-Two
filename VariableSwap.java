package hwproject2;

public class VariableSwap {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println(num1+" "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1+" "+num2);

        /*num1=num1^num2^(num2=num1);
        System.out.println(num1+" "+num2);*/
    }
}
