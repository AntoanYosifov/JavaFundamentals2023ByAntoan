package bg.softuni.fundamentals.basicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for(int i = startNumber; i < endNumber + 1; i++){
            System.out.printf("%d ", i);
            sum += i;

        }
        System.out.println();
        System.out.printf("Sum: %d", sum);


    }
}
