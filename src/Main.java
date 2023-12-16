import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write the first number: ");
        int number1 = scn.nextInt();
        System.out.println("Write the second number: ");
        int number2 = scn.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for(int i=1; i<number1;i++){
            if (number1 % i == 0){
                sum1 = sum1 + i;;
            }
        }
        for(int i=1; i<number2;i++){
            if (number2 % i == 0){
                sum2 = sum2 + i;;
            }
        }

        if (sum1==number2 && sum2==number1){
            System.out.println(number1 + " and " + number2 + " are friend numbers.");
        }else{
            System.out.println(number1 + " and " + number2 + " are not friend numbers.");
        }
    }
}