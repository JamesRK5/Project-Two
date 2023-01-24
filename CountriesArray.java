package hwproject2;

import java.util.Scanner;

public class CountriesArray {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int counter = 0;
        String [] ctry= new String[5];
        String [] cptl= {"Kiev", "Washington", "London", "Dublin", "Mexico City"};
        System.out.println("Please enter 5 countries");
        for (int i = 0; i < ctry.length; i++){
            ctry[i]= inp.nextLine();
            counter++;
            System.out.println("Youve printed "+counter+" countries");
        }
        for (int i = 0; i < ctry.length; i++){
            System.out.println(ctry[i]);
            System.out.println(cptl[i]);
        }
    }
}
