import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = 0, number2 = 1, number3, i, serial;

        System.out.println("Seri sayisini giriniz: ");
        serial = input.nextInt();

        for (i = 2; i < serial; ++i){
            number3 = number1 + number2;

            System.out.println(number1 + " + " + number2 + " = " + number3);
            number1 = number2;
            number2 = number3;
        }
        System.out.println();
    }
}
