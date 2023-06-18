package com.pankaj.example.Project;

import java.util.Scanner;
import java.util.Random;

public class RandomChatBot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Hello ! Ask me anything , and  I'll provide random response.");
        while(true){
            String UserInput=sc.nextLine();
            String response=generateRandomResponse();
            System.out.println(response);
        }
    }
    public static String generateRandomResponse(){
        String[] response={
                "I'm not sure,could you please rephrase the question?",
                "That's an interesting question!",
                "I need more information to provide an answer.",
                "I'm sorry , I don't have the answer to that.",
                "Why don't you tell me your opinion on that?.",
                "I'm still learning Ask me something else!.",
                "I'm afraid I can't answer that question.",
                "hii","hello","Hey there","Welcome","Thank you",
        };
        Random random = new Random();
        int index= random.nextInt(response.length);
        return response[index];
    }
}
