package com.chatBot.view;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chatBot.viewmodel.ChatBotViewModel;

import java.util.Scanner;

public class ChatBotView {
    

    public static void print() {
        System.out.println("==============================");
        System.out.println("---WELCOME TO MUTHU's Quotes---");
    }

    public static void print1() {
    	System.out.println("0===Exit");
    }
    public static void print2() {
    	System.out.println("9==back");
    }
    public static void end() {
        System.out.println("9===Back");
        System.out.println();
        System.out.println("0===Exit ");
        System.out.println("==============================");
    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter your Option :");
        return scanner.nextInt();
    }

    public static void display(JSONArray jsonArray) {
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            System.out.println(jsonObject.get(Integer.toString(i)));
            System.out.println();
        }
    }
}

