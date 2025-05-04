
//This program swaps two numbers without using a third variable by taking user input
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SwapWithoutThirdVar {
    public void swap() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the 1st number:");
            int no1 = Integer.parseInt(br.readLine());
            System.out.print("Enter the 2nd number:");
            int no2 = Integer.parseInt(br.readLine());
            System.out.println("The numbers before swapping are:" + no1 + " and " + no2);
            no1 = no1 + no2;
            no2 = no1 - no2;
            no1 = no1 - no2;
            System.out.println("The numbers after swapping are:" + no1 + " and " + no2);
        } catch (NumberFormatException | IOException e) {
            System.out.println("There is an error:");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        SwapWithoutThirdVar s = new SwapWithoutThirdVar();
        s.swap();
    }
}
