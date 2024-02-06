package com.chatBot.viewmodel;

import org.json.simple.JSONArray;

import com.chatBot.model.ChatBotModel;
import com.chatBot.view.ChatBotView;

import java.util.Stack;

public class ChatBotViewModel {
   Stack<String> pathStack = new Stack<>();
   ChatBotModel model = new ChatBotModel();
   int count=0;

    public void start() throws Exception {
        int choice;
        ChatBotView.print();
        System.out.println("===============================");
        pathStack.push("Press");
        display(model.parse("Press"));

       while(true) {
            choice = ChatBotView.getUserChoice();
            if (choice == 9) 
            {
            	count--;
                pathStack.pop();
                if (pathStack.isEmpty())
                {
                    break;
                }
            } else if (choice == 0)
            {
            	count=0;
                break;
            } 
            else
            {
            	count++;
                pathStack.push(pathStack.peek() + "_" + choice);
            }

            String path = pathStack.peek();
            try {
                System.out.println("===============================");
                display(model.parse(path));
                if(count!=0)
                {
                ChatBotView.end();
                }
               
            }
            catch (Exception e) {
                System.out.println("Invalid Input !!");
            }
        } 
        
        
    }

    private void display(JSONArray jsonArray) {
        ChatBotView.display(jsonArray);
    }
}
