package com.chatBot.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ChatBotModel {
    public JSONArray parse(String path) throws Exception {
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader(
                "C:\\Users\\USER\\Desktop\\Pradeesh\\ZSGS\\ConsoleApplications\\Chatbot\\src\\com\\chatBot\\chat.json"));
        return (JSONArray) jsonObject.get(path);
    }
}
