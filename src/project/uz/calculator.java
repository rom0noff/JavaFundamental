package project.uz;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("a= ");
        int a = scanner.nextInt();

        System.out.print("b= ");
        int b = scanner.nextInt();

        char sign = '-';

        if(sign == '+'){
            System.out.println(a+b);
        }else if(sign == '-'){
            System.out.println(a-b);
        }else if(sign == '*'){
            System.out.println(a*b);
        }else if(sign == '/'){
            System.out.println(a/b);
        }

    }
}
