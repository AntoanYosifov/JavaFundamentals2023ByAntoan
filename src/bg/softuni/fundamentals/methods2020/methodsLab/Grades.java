package bg.softuni.fundamentals.methods2020.methodsLab;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        assessingGrade(grade);


    }
    public static void assessingGrade (double grade){
        if(2.00 <= grade && grade <= 2.99){
            System.out.println("Fail");
        }else if(3.00 <= grade && grade <= 3.49){
            System.out.println("Poor");
        }else if(3.50 <= grade && grade <= 4.49){
            System.out.println("Good");
        }else if(4.50 <= grade && grade <= 5.49){
            System.out.println("Very good");
        }else if(5.50 <= grade && grade <= 6.00){
            System.out.println("Excellent");
        }


    }
}
