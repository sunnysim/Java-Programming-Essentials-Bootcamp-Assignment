import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter five integers: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Integer " + i + ": ");
            int num = input.nextInt();
            sum += num;
        }
        
        System.out.println("The sum of the integers is: " + sum);
        
        input.close();
    }
}
