package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        try {
            while (true) {
                System.out.println("What is your name?");
                String userName = getInput();
                System.out.println("Would You Like to Check a Ticket or Buy One?");
                String menuChoice = getInput();
                switch (menuChoice) {
                    case "Check":
                    case "check":
                        checkMenu(userName);
                        break;
                    case "Buy":
                    case "buy":
                        buyMenu(userName);
                }
            }
        } catch (Exception exception) {
            System.out.println("Error in mainMenu method " + exception);
        }
    }

    public static void checkMenu(String name) {
        //make bulletproof
        int ticketNumber = 0;

        if (raffelTickets.containsValue(name)) {
            for (Entry<Integer, String> entry : raffelTickets.entrySet()) {
                if (entry.getValue() == name) {
                    ticketNumber = entry.getKey();
                }
            }
            BigInteger userRaffelTicket = new BigInteger(String.valueOf(ticketNumber));
            if (userRaffelTicket.isProbablePrime(1)) {
                System.out.println("You won the raffle");
                System.out.println("Yay");
            } else {
                System.out.println("Bad luck, you lost");
                System.out.println("Try again?");
            }
        } else {
            System.out.println("You need to buy a ticket to check one");
        }
    }

    public static void buyMenu(String name) {
        Random random = new Random();
        System.out.println("How many tickets would you like to buy?");
        try {
            Integer amountOfTickets = Integer.valueOf(getInput());
            for (int i = 0; i <=amountOfTickets; i++) {
                Integer randomTicketNumber = random.nextInt(raffelTickets.size());
                if(raffelTickets)
            }
        }catch(Exception e){
            System.out.println("There was an error" + e);
        }
    }

    private static HashMap<Integer, String> raffelTickets = tickets(500);

    public static HashMap<Integer, String> tickets(int range) {
        HashMap<Integer, String> tickets = new HashMap<>();
        for (int i = 1; i <= range; i++) {
            tickets.put(i, "");
        }
        return tickets;
    }

    public static String getInput() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bufferedReader.readLine();
        } catch (Exception exception) {
            System.out.println("BufferedReader had an error" + exception);
            return "Cringe";
        }
    }
}
