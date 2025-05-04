import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PrimeCheck {
    public void Check() {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the number to be checked:");
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= n; i++) {
                if (n % i == 0)
                    count++;
            }
            if (count <= 2)
                System.out.println("The number is prime");
            else
                System.out.println("The number is composite");
        } catch (NumberFormatException | IOException e) {
            System.out.println("There is an error:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PrimeCheck p = new PrimeCheck();
        p.Check();
    }
}
