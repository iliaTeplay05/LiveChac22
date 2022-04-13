import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secInStep = 10;
        int floor;
        int stepInStraight = 15;
        int straightInFloor = 2;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет понять на сколько секунд увеличилась ваша жизнь");

        System.out.print("Введите номер этажа, на который вы хотите подняться: ");
        floor = scanner.nextInt();

        result = secInStep * stepInStraight * straightInFloor * floor;

        System.out.print("Выша жизнь увеличилась на " + result + " секунд ");
    }
}