package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){
        try{
            while(true){
                System.out.println("What is your name?");
                String userName = getInput();
                System.out.println("Would You Like to Check a Ticket or Buy One?");
                String menuChoice = getInput();
                switch (menuChoice){
                    case "Check":
                    case "check":
                        checkMenu(userName);
                        break;
                    case "Buy":
                    case "buy":
                        buyMenu(userName);
                }
            }
        }catch (Exception exception){
            System.out.println("Error in mainMenu method " + exception);
        }
    }

    public static void checkMenu(String name){
        if(raffelTickets.containsValue(name)){
            if
        }
    }

    public static void buyMenu(String name){

    }

    private static HashMap<Integer, String> raffelTickets = tickets(500);

    public static HashMap<Integer, String> tickets(int range){
        HashMap<Integer, String> tickets = new HashMap<>();
        for (int i = 1; i <=range; i++) {
            tickets.put(i, "");
        }
        return tickets;
    }

    public static String getInput(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            return bufferedReader.readLine();
        }catch (Exception exception){
            System.out.println("BufferedReader had an error" + exception);
            return "Cringe";
        }
    }
}
