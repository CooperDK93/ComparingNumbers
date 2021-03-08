
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter Second Number");
        int secondNum = scanner.nextInt();
        
        if (firstNum > secondNum && firstNum != secondNum){
            System.out.println(firstNum + " is greater than " + secondNum);
        }else if (firstNum == secondNum){
            System.out.println(firstNum + " is equal to " + secondNum);
        }else {
            System.out.println(firstNum + " is smaller than " + secondNum);
        }

    }
}
