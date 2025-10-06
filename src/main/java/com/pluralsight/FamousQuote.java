package com.pluralsight;

import java.util.Scanner;

public class FamousQuote {
    public static void main(String[] args) {
        boolean running = true;

        try{
        Scanner scan = new Scanner(System.in);
        //Quotes list

        String[] quotes = {"The only way to do great work is to love what you do. – Steve Jobs",
                "In the middle of every difficulty lies opportunity. – Albert Einstein",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
                "Do or do not. There is no try. – Yoda",
                "It always seems impossible until it’s done. – Nelson Mandela",
                "Be yourself; everyone else is already taken. – Oscar Wilde",
                "Act as if what you do makes a difference. It does. – William James",
                "Don’t watch the clock; do what it does. Keep going. – Sam Levenson",
                "The future belongs to those who believe in the beauty of their dreams. – Eleanor Roosevelt",
                "You miss 100% of the shots you don’t take. – Wayne Gretzky"};

        while (true) {
            System.out.print("\nEnter a number between 1 and 10 to see a quote: ");
            int choice = scan.nextInt();

            //If choice is between 1 and 10 than Display Quote # + Choice

            if (choice >= 1 && choice <= 10) {
                System.out.println("\n Quote #" + choice + ":");
                System.out.println(quotes[choice - 1]);

                //if not one of the numbers between 1 and 10 display invalid
            } else {
                System.out.println("\n Invalid number! Please choose between 1 and 10.");
            }
            //Ask if wanting another quote

            System.out.print("\nWould you like to see another quote? (yes/no): ");
            String again = scan.next().toLowerCase();

            //Making sure all formats are accepted that if they don't put some form of yes or Y then they get a goodbye

            if (!again.equals("yes") && !again.equals("y")) {
                System.out.println("\nGoodbye! Stay inspired! ");
                break;}

            running = false;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Issue with Quote, please try again.");
        }
    }
}
