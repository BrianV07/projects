import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("how many integers? ");
        int integers = sc.nextInt();

        while (integers < 0) {
             System.out.println("error! positive amount only.");
             System.out.print("how many integers? ");
             integers = sc.nextInt();
        }

        int evenSum = 0;
        int evenMax = 0;

        for (int i = 0; i < integers; i++) {
            System.out.print("next integer? ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
            }
        }
        System.out.println("even sum = " + evenSum);
        System.out.println("even max = " + evenMax);
    }

}
