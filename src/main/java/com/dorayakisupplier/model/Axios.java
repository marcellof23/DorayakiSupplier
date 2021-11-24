package com.dorayakisupplier.model;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Axios {
    String base_url="";
    
    public Axios(String base_url){
      this.base_url = base_url;
    }

    public String get(String endpoint){
      try{
        String final_url = this.base_url + endpoint;
        URL url = new URL(final_url);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type","application/json; charset=utf-8");
        con.setDoOutput(true);

        String responseStatus = con.getResponseMessage();
        System.out.println(responseStatus);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
        }
        in.close();

        return response.toString();
      }catch(Exception e){
        System.out.println(e);
        return "";
      } 
    }
    
    public String post(String endpoint, String payload){
      try{
        String final_url = this.base_url + endpoint;
        URL url = new URL(final_url);
        
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type","application/json; charset=utf-8");
        con.setDoOutput(true);

        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(payload);
        wr.flush();
        wr.close();

        String responseStatus = con.getResponseMessage();
        System.out.println(responseStatus);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
        }
        in.close();
        
        return response.toString();
      }catch(Exception e){
        System.out.println(e);
        return "";
      } 
    }
}
