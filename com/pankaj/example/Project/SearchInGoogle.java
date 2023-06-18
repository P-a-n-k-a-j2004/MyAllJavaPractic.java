package com.pankaj.example.Project;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.net.URL.*;
public class SearchInGoogle {
    public static void main(String [] args){
        try{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your what do you want:");
            String query= reader.readLine();
            String encodedQuery=URLEncoder.encode(query+"UTF-8");
            String searchUrl="https://www.google.com/search?q="+encodedQuery;
            URL url=new URL(searchUrl);
            BufferedReader urlReader=new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while((line=urlReader.readLine())!=null){
                System.out.println(line);

            }
            reader.close();
            urlReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
