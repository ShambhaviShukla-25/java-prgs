import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class fibonacciSeries {
    int a = 0, b = 1, c = 1;
    public static int totalCount;

    public void Fibonacci(int totalCount) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the count of the series till which you want to print the fibonacci series:");
            totalCount = Integer.parseInt(br.readLine());
            for (int i = 1; i <= totalCount; i++) {
                System.out.print(a + ",");
                a = b;
                b = c;
                c = a + b;
            }
        } catch (NumberFormatException | IOException e) {
            System.out.println("There is an error:");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        fibonacciSeries f = new fibonacciSeries();
        f.Fibonacci(totalCount);
    }
}
