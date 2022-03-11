import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите число 1");
        int count = sc.nextInt();
        System.out.println("введите число 2");
        int count2 = sc.nextInt();

        if (count < count2) {
            System.out.println(count);

        } else if (count == count2) {
            System.out.println("числа равные");

        }else {
            System.out.println(count2);
            System.out.println(count2);
        }
    }
}