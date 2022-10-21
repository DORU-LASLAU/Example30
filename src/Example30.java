import java.util.Scanner;
public class Example30 {
    public static void main(String[] argv) {
        int i, j, n;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Enter the number of lines:");
        n = inputValue.nextInt();

        for (i=1; i<=n; i++) {
            for (j=1; j<=i;j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
