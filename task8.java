import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = s.nextInt();
        int b = 0;
        for(int i = 1; i < n; i++)
            //сумма нечетных ДО введенного числа, если надо суммировать и введенное число то
            //for(int i = 1; i <= n; i++)
            if(i%2==1)
                b+=i;
            System.out.println(b);
        }

    }

