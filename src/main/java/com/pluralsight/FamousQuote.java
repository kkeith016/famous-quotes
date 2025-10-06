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

        System.out.print("Select a quote (0 - 10) ");
        int index = scan.nextInt();
        System.out.print(quotes[index]);

            running = false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Issue with Quote, please try again.");
        }
    }
}
