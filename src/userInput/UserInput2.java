package userInput;

import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("Here is your number: " + data);
    }
}
