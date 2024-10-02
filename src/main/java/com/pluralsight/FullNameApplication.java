package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName = Keyboard.nextLine();
        System.out.println("Now enter your middle name, if you don't have one press enter:");
        String middleName = Keyboard.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = Keyboard.nextLine();
        System.out.println("If you have a suffix please enter it now, if not press enter: ");
        String suffix = Keyboard.nextLine();
        System.out.println("Your full name is: ");
        System.out.println(firstName.trim() + " " + middleName.trim() + " " + lastName.trim() + " " + suffix);
        Keyboard.close();








    }
}
