package functions;

import java.util.Scanner;

class AdditionNum{
    int sum(int a, int b){
        return a+b;
    }
}
public class FunctionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no: ");
        int first = sc.nextInt();
        System.out.print("Enter Second no: ");
        int second = sc.nextInt();
        AdditionNum additionNum = new AdditionNum();
        int res = additionNum.sum(first, second);
        System.out.println("The addition is: ♦"+res);
    }
}
